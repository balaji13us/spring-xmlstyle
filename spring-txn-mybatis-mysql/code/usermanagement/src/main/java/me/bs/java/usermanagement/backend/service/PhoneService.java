package me.bs.java.usermanagement.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import me.bs.java.usermanagement.backend.mapper.PhoneMapper;
import me.bs.java.usermanagement.backend.model.Phone;
import me.bs.java.usermanagement.common.IDNotFoundException;
import me.bs.java.usermanagement.common.NotAbleToProcessException;

@Service
@Transactional
public class PhoneService {

	@Autowired
	PhoneMapper phoneMapper;

	public void deleteById(Long id) throws NotAbleToProcessException {
		int count = phoneMapper.deleteByPrimaryKey(id);
		if (count != 1 ) {
			throw new NotAbleToProcessException("UNABLE_TO_DELETE");

		} 
	}

	public List<Phone> findAll() {
		return phoneMapper.selectByExample(null);
	}

	public Phone findById(Long id) throws IDNotFoundException {
		Phone phone = phoneMapper.selectByPrimaryKey(id);
		if (null == phone || phone.getId() == null) {
			// System.out.println("ID not found");
			throw new IDNotFoundException("ID_NOT_FOUND");
		} else {
			// System.out.println("ID found "+ phoneEntity);
		}

		return phone;
	}

	public Phone insert(Phone phone) throws NotAbleToProcessException, IDNotFoundException {
		Phone createdPhone = new Phone();

		if (phone != null) {

			int count = phoneMapper.insert(phone);
			System.out.println("RECORDS INSERTED = " + count);

			if (count == 1) {
				if (phone.getId() != null) {
					System.out.println(" INSERTED_ID=" + phone.getId());
					createdPhone = findById(phone.getId());
				}
			} else {
				throw new NotAbleToProcessException("UNABLE_TO_INSERT");
			}

		} else {
			throw new IDNotFoundException("INPUT_IS_NULL");
		}

		return createdPhone;
	}

	public Phone update(Phone phone) throws NotAbleToProcessException, IDNotFoundException {
		Phone updatedPhone = new Phone();

		if (phone != null && phone.getId() != null) {

			findById(phone.getId());

			int count = phoneMapper.updateByPrimaryKey(phone);
			System.out.println("RECORDS UPDATED = " + count);

			if (count == 1 && phone.getId() != null) {
				System.out.println("ID UPDATED " + phone.getId());
				updatedPhone = findById(phone.getId());

			} else {
				throw new NotAbleToProcessException("UNABLE_TO_UPDATE");
			}
		}

		return updatedPhone;
	}

}
