package dagger;

import com.ets.payment.service.GatewayModule;
import com.ets.payment.service.GiftCardGatewayFactory;
import com.ets.payment.service.CreditCardGatewayFactory;

import javax.inject.Singleton;

@Singleton
@Component(
        modules = {
                GatewayModule.class
        }
)
public interface PaymentComponents {

    GiftCardGatewayFactory getGiftCardGatewayFactory();
    CreditCardGatewayFactory gerCreditCardGatewayFactory();

}