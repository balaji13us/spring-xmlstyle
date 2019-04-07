package me.bs.java.usermanagement.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me.bs.java.usermanagement.backend.model.Address;
import me.bs.java.usermanagement.backend.model.Person;
import me.bs.java.usermanagement.backend.model.Phone;
import me.bs.java.usermanagement.backend.vo.PersonWrapper;
import me.bs.java.usermanagement.common.IDNotFoundException;
import me.bs.java.usermanagement.common.NotAbleToProcessException;

@Service
@Transactional
public class UserService {


	@Autowired
	PersonService personService;
	
	@Autowired
	PhoneService phoneService;
	
	@Autowired
	AddressService addressService;
	



	public PersonWrapper findById(Long id) throws IDNotFoundException {
		PersonWrapper personWrapper = new PersonWrapper();
		
		Person person = personService.findById(id);
		List<Address> addresses = addressService.findAll();
		List<Phone> phones = phoneService.findAll();
		
		personWrapper.setAddresses(addresses);
		personWrapper.setPerson(person);
		personWrapper.setPhones(phones);
		
		return personWrapper;
	}
	@Transactional 
	public PersonWrapper insert(PersonWrapper personWrapper) throws NotAbleToProcessException, IDNotFoundException {
		
		Person person = personWrapper.getPerson();
		personService.insert(person);
		for(Address address : personWrapper.getAddresses()) {
			address.setPersonId(person.getId());
			addressService.insert(address);
		}
		
		for(Phone phone: personWrapper.getPhones()) {
			phone.setPersonId(person.getId());
			phoneService.insert(phone);
		}

		return personWrapper;
	}



}
