package com.crud.koctasbackend.service;


import com.crud.koctasbackend.model.Customer;
import com.crud.koctasbackend.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public Customer saveCustomer(Customer customer){
        customer.setFirstName(customer.getFirstName());
        customer.setLastName(customer.getLastName());
        customer.setPhoneNum(customer.getPhoneNum());
        customer.setCustMail(customer.getCustMail());
        customer.setStreet(customer.getStreet());

        return customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Long id){
        customerRepository.deleteById(id);
    }
@Override
    public List<Customer> findAllCustomer(Long id){
        return customerRepository.findAllById(id);
    }

    @Override
    public Optional<Customer> findById(Long id) {return customerRepository.findById(id);}



}
