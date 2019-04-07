package me.bs.java.usermanagement.backend.vo;

import java.util.List;

import me.bs.java.usermanagement.backend.model.Address;
import me.bs.java.usermanagement.backend.model.Person;
import me.bs.java.usermanagement.backend.model.Phone;

public class PersonWrapper {

	private Person person;
	private List<Address> addresses;
	private List<Phone> phones;
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	public List<Phone> getPhones() {
		return phones;
	}
	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("personWrapper [ person=\"");
		builder.append(person);
		builder.append("\", addresses=\"");
		builder.append(addresses);
		builder.append("\", phones=\"");
		builder.append(phones);
		builder.append("\" ]");
		return builder.toString();
	}
	
	
	
}
