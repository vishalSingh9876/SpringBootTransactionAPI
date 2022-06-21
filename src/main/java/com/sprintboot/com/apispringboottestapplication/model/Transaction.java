package com.sprintboot.com.apispringboottestapplication.model;


import com.sprintboot.com.apispringboottestapplication.service.TransactionService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "transaction_tb")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    UUID transactionId;
    String senderId;
    String receiverId;

    long amount;

}
