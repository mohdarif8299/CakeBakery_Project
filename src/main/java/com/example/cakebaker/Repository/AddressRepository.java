package com.example.cakebaker.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cakebaker.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
