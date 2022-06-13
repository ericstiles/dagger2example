package com.ets.payment.service;

import com.ets.payment.model.Receipt;
import com.ets.payment.model.Transaction;
import com.ets.payment.model.fields.ReceiptId;
import com.ets.payment.model.fields.TransactionId;

import javax.inject.Inject;

public class CreditCardGateway implements Gateway {

    @Inject
    CreditCardGateway() {
    }

    @Override
    public Transaction process(Transaction transaction) {
        System.out.println("Process a CreditCard payment here");
        Receipt receipt = Receipt.of(ReceiptId.of("CreditCard-Receipt"));
        return transaction.toBuilder().receipt(receipt).build();

    }
}
