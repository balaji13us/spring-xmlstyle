package me.bs.java.usermanagement.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import me.bs.java.usermanagement.backend.mapper.AddressMapper;
import me.bs.java.usermanagement.backend.model.Address;
import me.bs.java.usermanagement.common.IDNotFoundException;
import me.bs.java.usermanagement.common.NotAbleToProcessException;

@Service
@Transactional
public class AddressService {

	@Autowired
	AddressMapper addressMapper;

	public void deleteById(Long id) throws NotAbleToProcessException {
		int count = addressMapper.deleteByPrimaryKey(id);
		if (count != 1 ) {
			throw new NotAbleToProcessException("UNABLE_TO_DELETE");

		} 
	}

	public List<Address> findAll() {
		return addressMapper.selectByExample(null);
	}

	public Address findById(Long id) throws IDNotFoundException {
		Address address = addressMapper.selectByPrimaryKey(id);
		if (null == address || address.getId() == null) {
			// System.out.println("ID not found");
			throw new IDNotFoundException("ID_NOT_FOUND");
		} else {
			// System.out.println("ID found "+ addressEntity);
		}

		return address;
	}

	public Address insert(Address address) throws NotAbleToProcessException, IDNotFoundException {
		Address createdAddress = new Address();

		if (address != null) {

			int count = addressMapper.insert(address);
			System.out.println("RECORDS INSERTED = " + count);

			if (count == 1) {
				if (address.getId() != null) {
					System.out.println(" INSERTED_ID=" + address.getId());
					createdAddress = findById(address.getId());
				}
			} else {
				throw new NotAbleToProcessException("UNABLE_TO_INSERT");
			}

		} else {
			throw new IDNotFoundException("INPUT_IS_NULL");
		}

		return createdAddress;
	}

	public Address update(Address address) throws NotAbleToProcessException, IDNotFoundException {
		Address updatedAddress = new Address();

		if (address != null && address.getId() != null) {

			findById(address.getId());

			int count = addressMapper.updateByPrimaryKey(address);
			System.out.println("RECORDS UPDATED = " + count);

			if (count == 1 && address.getId() != null) {
				System.out.println("ID UPDATED " + address.getId());
				updatedAddress = findById(address.getId());

			} else {
				throw new NotAbleToProcessException("UNABLE_TO_UPDATE");
			}
		}

		return updatedAddress;
	}

}
