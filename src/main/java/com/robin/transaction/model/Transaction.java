package com.robin.transaction.model;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Represents a financial transaction in the system.
 * This class includes validation constraints and business rules
 * for transaction data.
 */
@Data
public class Transaction {
    // Unique identifier for the transaction
    private String id;

    // Account number with validation constraints
    @NotBlank(message = "Account number is required")
    @Pattern(regexp = "^[0-9]{8,16}$", message = "Account number must be 8-16 digits")
    private String accountNumber;

    // Transaction amount with validation constraints
    @NotNull(message = "Amount is required")
    @DecimalMin(value = "0.01", message = "Amount must be greater than 0")
    private BigDecimal amount;

    // Transaction type with validation constraints
    @NotBlank(message = "Type is required")
    @Pattern(regexp = "^(DEBIT|CREDIT)$", message = "Type must be either DEBIT or CREDIT")
    private String type;

    // Transaction description with validation constraints
    @NotBlank(message = "Description is required")
    @Size(max = 255, message = "Description must not exceed 255 characters")
    private String description;

    // Timestamp of when the transaction was created
    private LocalDateTime timestamp;


    /**
     * Default constructor.
     * Initializes the transaction with a new UUID and current timestamp.
     */
    public Transaction() {
        this.id = UUID.randomUUID().toString();
        this.timestamp = LocalDateTime.now();
    }

    /**
     * Constructor with required fields.
     *
     * @param accountNumber The account number for the transaction
     * @param amount        The transaction amount
     * @param type          The transaction type (DEBIT/CREDIT)
     * @param description   A description of the transaction
     */
    public Transaction(String accountNumber, BigDecimal amount, String type, String description) {
        this();
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.type = type;
        this.description = description;
    }

} 