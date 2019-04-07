package me.bs.java.usermanagement.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me.bs.java.usermanagement.backend.mapper.PersonMapper;
import me.bs.java.usermanagement.backend.model.Person;
import me.bs.java.usermanagement.common.IDNotFoundException;
import me.bs.java.usermanagement.common.NotAbleToProcessException;

@Service
@Transactional
public class PersonService {

	@Autowired
	PersonMapper personMapper;

	public void deleteById(Long id) throws NotAbleToProcessException {
		int count = personMapper.deleteByPrimaryKey(id);
		if (count != 1 ) {
			throw new NotAbleToProcessException("UNABLE_TO_DELETE");

		} 
	}

	public List<Person> findAll() {
		return personMapper.selectByExample(null);
	}

	public Person findById(Long id) throws IDNotFoundException {
		Person person = personMapper.selectByPrimaryKey(id);
		if (null == person || person.getId() == null) {
			// System.out.println("ID not found");
			throw new IDNotFoundException("PERSON_ID_NOT_FOUND");
		} else {
			// System.out.println("ID found "+ personEntity);
		}

		return person;
	}

	public Person insert(Person person) throws NotAbleToProcessException, IDNotFoundException {
		Person createdPerson = new Person();

		if (person != null) {

			int count = personMapper.insert(person);
			System.out.println("RECORDS INSERTED = " + count);

			if (count == 1) {
				if (person.getId() != null) {
					System.out.println(" INSERTED_ID=" + person.getId());
					createdPerson = findById(person.getId());
				}
			} else {
				throw new NotAbleToProcessException("UNABLE_TO_INSERT");
			}

		} else {
			throw new IDNotFoundException("INPUT_IS_NULL");
		}

		return createdPerson;
	}

	public Person update(Person person) throws NotAbleToProcessException, IDNotFoundException {
		Person updatedPerson = new Person();

		if (person != null && person.getId() != null) {

			findById(person.getId());

			int count = personMapper.updateByPrimaryKey(person);
			System.out.println("RECORDS UPDATED = " + count);

			if (count == 1 && person.getId() != null) {
				System.out.println("ID UPDATED " + person.getId());
				updatedPerson = findById(person.getId());

			} else {
				throw new NotAbleToProcessException("UNABLE_TO_UPDATE");
			}
		}

		return updatedPerson;
	}

}
