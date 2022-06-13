package com.ets.payment.service;

import com.ets.payment.model.Receipt;
import com.ets.payment.model.Transaction;
import com.ets.payment.model.fields.ReceiptId;

import javax.inject.Inject;

public class GiftCardGateway implements Gateway {

    @Inject
    GiftCardGateway() {
    }

    @Override
    public Transaction process(Transaction transaction) {
        System.out.println("Process a GiftCard payment here");
        Receipt receipt = Receipt.of(ReceiptId.of("GiftCard-Receipt"));
        return transaction.toBuilder().receipt(receipt).build();
    }
}
