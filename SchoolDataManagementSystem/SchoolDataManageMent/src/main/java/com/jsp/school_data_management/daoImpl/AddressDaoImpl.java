package com.jsp.school_data_management.daoImpl;

import com.jsp.school_data_management.dao.AddressDao;
import com.jsp.school_data_management.entity.Address;
import com.jsp.school_data_management.repository.AddressRespository;

public class AddressDaoImpl implements AddressDao {

	private AddressRespository repo;
	
	@Override
	public Address saveAddress(Address a) {
		
		return repo.save(a);
	}

}
