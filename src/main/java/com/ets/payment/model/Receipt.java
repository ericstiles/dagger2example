package com.ets.payment.model;

import com.ets.payment.model.fields.ReceiptId;
import com.ets.payment.model.fields.TransactionId;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor(staticName="of")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
public class Receipt {

    @NonNull ReceiptId receiptId;

}
