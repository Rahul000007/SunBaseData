package org.assignment.sunbasedataassignment.repository;

import org.assignment.sunbasedataassignment.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

    Page<Customer> findAll(Pageable pageable);

    @Query("SELECT c FROM Customer c WHERE c.id = :customerId")
    Optional<Customer> findById(@Param("customerId") String customerId);

    List<Customer> findByFirstNameContaining(String firstName);

    List<Customer> findByEmailContaining(String email);

    List<Customer> findByPhoneContaining(String phone);

    List<Customer> findByCityContaining(String city);

    Optional<Customer> findCustomerByEmail(String email);

}
