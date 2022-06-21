package com.sprintboot.com.apispringboottestapplication.contoller;

import com.sprintboot.com.apispringboottestapplication.exception.NoDataFoundException;
import com.sprintboot.com.apispringboottestapplication.model.Transaction;
import com.sprintboot.com.apispringboottestapplication.service.TransactionService;
import org.jboss.jandex.Main;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class MainController {

    static final org.slf4j.Logger log =
            LoggerFactory.getLogger(MainController.class);
     @Autowired
     public TransactionService transactionService;

     @Autowired
     public RestTemplate restTemplate;

    @GetMapping("/transactions")
    public ResponseEntity<List<Transaction>> getAllTransactions(String name) throws NoDataFoundException {
        return new ResponseEntity<List<Transaction>>(transactionService.getAllTransactions(), HttpStatus.OK);
    }

    @GetMapping("/transactions/{senderId}")
    public ResponseEntity<List<Transaction>> getTRansactionBySenderID( @PathVariable("senderId") String senderId) throws NoDataFoundException {
        return new ResponseEntity<List<Transaction>>(transactionService.getTransactionBySenderId(senderId), HttpStatus.OK);
    }

    @PostMapping("/transaction")
    public ResponseEntity<UUID>  doTransaction(@RequestBody Transaction transaction) {

        String id = restTemplate.getForObject("https://www.uuidgenerator.net/api/version4", String.class);
        transaction.setTransactionId(UUID.fromString(id));
        Transaction transact = transactionService.doTransaction(transaction);
        return new ResponseEntity<UUID>(transact.getTransactionId(), HttpStatus.CREATED);
    }
}
