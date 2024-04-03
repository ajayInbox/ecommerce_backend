package com.aj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aj.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
