package com.ets.payment.service;

import com.ets.payment.model.Transaction;

public interface Gateway {
    Transaction process(Transaction transaction);
}
