package com.ets.payment.model.fields;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName="of")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ReceiptId implements StringId {

    @NonNull
    private String value;

    @Override
    public String getId() {
        return value;
    }
}
