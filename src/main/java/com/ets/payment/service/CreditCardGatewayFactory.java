package com.ets.payment.service;

import javax.inject.Inject;
import javax.inject.Named;

public class CreditCardGatewayFactory implements GatewayFactory {
    private final Gateway gateway;

    @Inject
    CreditCardGatewayFactory(@Named("CreditCard") Gateway gateway) {
        this.gateway = gateway;
    }

    public Gateway getGateway() {
        return gateway;
    }
}
