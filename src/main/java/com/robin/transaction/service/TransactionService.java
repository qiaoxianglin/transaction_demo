package com.robin.transaction.service;

import com.robin.transaction.model.Transaction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface TransactionService {
    CompletableFuture<Transaction> createTransaction(Transaction transaction);
    CompletableFuture<Transaction> updateTransaction(String id, Transaction transaction);
    CompletableFuture<Void> deleteTransaction(String id);
    CompletableFuture<Transaction> getTransaction(String id);
    CompletableFuture<Page<Transaction>> getAllTransactions(Pageable pageable);
} 