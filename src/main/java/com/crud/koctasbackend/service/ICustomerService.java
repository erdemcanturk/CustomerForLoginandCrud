package com.crud.koctasbackend.service;

import com.crud.koctasbackend.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ICustomerService  {


    Customer saveCustomer(Customer customer);

    void deleteCustomer(Long id);


    List<Customer> findAllCustomer(Long id);

    Optional<Customer> findById(Long id);
}
