package com.BankPro.System.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BankPro.System.entities.Customer;

@Repository
public interface Myrepo extends JpaRepository<Customer, Integer> {

}
