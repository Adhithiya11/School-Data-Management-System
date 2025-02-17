package com.jsp.school_data_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.school_data_management.entity.Address;

public interface AddressRespository extends JpaRepository<Address, Integer> {

}
