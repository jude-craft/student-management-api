package com.codewithjude.personalfinancetrackerapi.model;

import java.time.LocalDate;

public class Transaction {
    private Long id;
    private Double amount;
    private String description;
    private TransactionType type;
    private LocalDate timestamp;

    Transaction(Long id, Double amount, String description, TransactionType type, LocalDate timestamp ){
        this.id = id;
        this.amount = amount;
        this.description = description;
        this.type = type;
        this.timestamp = LocalDate.now();
    }

    public Double getAmount(){
        return amount;
    }
    public TransactionType getType(){
        return type;
    }
    public String getDescription(){
        return description;
    }

}
