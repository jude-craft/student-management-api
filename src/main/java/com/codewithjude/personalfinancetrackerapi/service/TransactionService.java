package com.codewithjude.personalfinancetrackerapi.service;

import com.codewithjude.personalfinancetrackerapi.model.Transaction;
import com.codewithjude.personalfinancetrackerapi.model.TransactionType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service  // Tells Spring to manage this class as a bean
public class TransactionService {

    // Temporary in memory storage for week 1
    private final List<Transaction> transactions = new ArrayList<>();

    public List<Transaction> getAllTransactions(){
        return transactions;
    }
    public void addTransaction(Transaction transaction){
        transactions.add(transaction);
    }
    public Double calculateNetBalance(){
        return transactions.stream()
                .mapToDouble(t -> t.getType() == TransactionType.INCOME ? t.getAmount() : -t.getAmount())
                .sum();
    }



}
