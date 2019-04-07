package me.bs.java.common;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.bs.java.usermanagement.backend.model.Address;
import me.bs.java.usermanagement.backend.model.Person;
import me.bs.java.usermanagement.backend.model.Phone;
import me.bs.java.usermanagement.backend.service.PersonService;
import me.bs.java.usermanagement.backend.service.UserService;
import me.bs.java.usermanagement.backend.vo.PersonWrapper;
import me.bs.java.usermanagement.common.IDNotFoundException;
import me.bs.java.usermanagement.common.NotAbleToProcessException;

public class SpringApp {
	private static Log log = LogFactory.getLog(SpringApp.class);

	public static void main(String[] args) throws NotAbleToProcessException, IDNotFoundException {

		StringBuilder springProfiles = new StringBuilder();
		springProfiles.append("H2");
		System.setProperty("spring.profiles.active", springProfiles.toString());

		ApplicationContext cxt = new ClassPathXmlApplicationContext("spring-config.xml");

		// PersonService personService = (PersonService) cxt.getBean("personService");
		// handlePerson(personService);

		UserService userService = (UserService) cxt.getBean("userService");
		handleUser(userService);
	}

	private static void handleUser(UserService userService) throws NotAbleToProcessException, IDNotFoundException {
		Person createdPerson = null;
		log.info("Running App...");
		PersonWrapper personWrapper= null;
		
		personWrapper = new PersonWrapper();
		Person person = null;
		person = createPerson("Michael", "Fox");
		List<Address> addresses = new ArrayList<Address>();
		Address address = createAddress("chennai",person.getId());
		addresses.add(address);
		address = createAddress("London",person.getId());
		addresses.add(address);
		
		List<Phone> phones = new ArrayList<Phone>();
		Phone phone = createPhone("1321654",person.getId(), "home");
		phones.add(phone);
		phone = createPhone("65165",person.getId(), "asdf");
		phones.add(phone);
		
		personWrapper.setAddresses(addresses);
		personWrapper.setPerson(person);
		personWrapper.setPhones(phones);
		
		userService.insert(personWrapper);
		
		
		System.out.println("List<Person> persons = service.selectAllPerson()");
		PersonWrapper createdPersonWrapper = userService.findById(person.getId());
		System.out.println("createdPersonWrapper : " + createdPersonWrapper);
	}

	private static void handlePerson(PersonService personService)
			throws NotAbleToProcessException, IDNotFoundException {
		Person createdPerson = null;
		log.info("Running App...");

		System.out.println("List<Person> persons = service.selectAllPerson()");
		List<Person> persons = personService.findAll();
		System.out.println("-> " + persons + "\n");

		System.out.println("service.insertPerson(person)");
		createdPerson = personService.insert(createPerson("Michael", "Fox"));
		createdPerson.setTitle("Mr");
		personService.update(createdPerson);

		createdPerson = personService.insert(createPerson("Macy", "Fox"));
		createdPerson.setTitle("Mrs");
		personService.update(createdPerson);

		System.out.println("List<Person> persons = service.selectAllPerson()");
		persons = personService.findAll();
		System.out.println("size : " + persons.size() + " -> " + persons + "\n");
	}

	private static Person createPerson(String firstName, String lastName)
			throws NotAbleToProcessException, IDNotFoundException {
		Person person = new Person();
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setFullName(person.getFirstName() + " " + person.getLastName());
		person.setEmail(person.getFirstName() + "." + person.getLastName() + "@abc.com");
		person.setProxy(UUID.randomUUID().toString());
		return person;
	}
	
	private static Address createAddress(String city, Long personId) {
		Address address = new Address();
		address.setCity(city);
		address.setPersonId(personId);
		return address;
	}
	private static Phone createPhone(String number, Long personId, String phoneType) {
		Phone phone = new Phone();
		phone.setNumber(number);
		phone.setPersonId(personId);
		phone.setPhoneType(phoneType);
		return phone;
	}
}
