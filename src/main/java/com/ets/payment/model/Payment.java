package com.ets.payment.model;

import com.ets.payment.model.fields.PaymentId;
import com.ets.payment.model.fields.TransactionId;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@RequiredArgsConstructor(staticName="of")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
public class Payment {

    @NonNull private PaymentId paymentId;
    @NonNull private BigDecimal amount;

}
