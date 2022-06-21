package com.sprintboot.com.apispringboottestapplication.repository;

import com.sprintboot.com.apispringboottestapplication.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Integer> {

    List<Transaction> findBysenderId(String senderId);

}
