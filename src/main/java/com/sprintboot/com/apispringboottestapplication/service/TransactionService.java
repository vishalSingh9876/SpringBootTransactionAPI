package com.sprintboot.com.apispringboottestapplication.service;

import com.sprintboot.com.apispringboottestapplication.exception.NoDataFoundException;
import com.sprintboot.com.apispringboottestapplication.model.Transaction;
import com.sprintboot.com.apispringboottestapplication.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public Transaction doTransaction(Transaction transaction){
        return transactionRepository.save(transaction);
    }

    public List<Transaction> getTransactionBySenderId(String senderId){
        return transactionRepository.findBysenderId(senderId);
    }
}
