package com.expava.gpp.springcloud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.expava.gpp.springcloud.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
