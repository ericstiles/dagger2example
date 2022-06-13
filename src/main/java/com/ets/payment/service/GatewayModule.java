package com.ets.payment.service;

import dagger.Module;
import dagger.Provides;

import javax.inject.Named;

@Module
public class GatewayModule {

  //@Binds is better approached
  @Provides
  @Named("CreditCard")
  Gateway providesCreditCardGateway(CreditCardGateway creditCardGateway) {
    //Dagger takes care of instantiating CreditCardGateway, and the @Provides
    //method is only used to alias it to the type Gateway.
    return creditCardGateway;
  }

  //@Binds is better approached
  @Provides
  @Named("GiftCard")
  Gateway providesGiftCardGateway(GiftCardGateway giftCardGateway) {
    //Dagger takes care of instantiating CreditCardGateway, and the @Provides
    //method is only used to alias it to the type Gateway.
    return giftCardGateway;
  }
}
