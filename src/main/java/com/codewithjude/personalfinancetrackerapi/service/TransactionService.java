package com.codewithjude.personalfinancetrackerapi.service;

import com.codewithjude.personalfinancetrackerapi.model.Transaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {
    private List<Transaction> transactions = new ArrayList<>();
}
