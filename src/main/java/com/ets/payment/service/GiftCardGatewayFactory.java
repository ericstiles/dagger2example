package com.ets.payment.service;

import javax.inject.Inject;
import javax.inject.Named;

public class GiftCardGatewayFactory implements GatewayFactory {
    private final Gateway gateway;

    @Inject
    GiftCardGatewayFactory(@Named("GiftCard") Gateway gateway) {
        this.gateway = gateway;
    }

    public Gateway getGateway() {
        return gateway;
    }
}
