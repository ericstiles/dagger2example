package com.ets.payment.model;

import com.ets.payment.model.fields.TransactionId;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Singular;
import lombok.ToString;

import java.util.List;

@Builder(toBuilder = true)
@Getter
@ToString
public class Transaction {
    @NonNull private final TransactionId transactionId;
    private Receipt receipt;
    @Singular
    private final List<Payment> payments;
}