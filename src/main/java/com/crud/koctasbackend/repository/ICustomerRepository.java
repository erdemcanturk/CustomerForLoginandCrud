package com.crud.koctasbackend.repository;

import com.crud.koctasbackend.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //jpa repo implementasyonu
public interface ICustomerRepository extends JpaRepository<Customer, Long> {

    //all CRUD database methods
    List<Customer> findAllById(Long id);




}
