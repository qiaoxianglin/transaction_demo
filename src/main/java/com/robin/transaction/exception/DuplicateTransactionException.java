package com.robin.transaction.exception;

/**
 * Exception thrown when attempting to create a transaction that would be
 * a duplicate of an existing transaction. The rule is by comparing
 * the account number, amount, and transaction。
 */
public class DuplicateTransactionException extends RuntimeException {
    
    /**
     * Constructs a new DuplicateTransactionException with the specified detail message.
     * @param message The detail message explaining the reason for the exception
     */
    public DuplicateTransactionException(String message) {
        super(message);
    }
} 