package connector;

import com.ets.payment.model.Payment;
import com.ets.payment.model.Transaction;
import com.ets.payment.model.fields.PaymentId;
import com.ets.payment.model.fields.TransactionId;
import dagger.DaggerPaymentComponents;
import dagger.PaymentComponents;

import java.math.BigDecimal;

/** The main app responsible for brewing the coffee and printing the logs. */
public class PaymentConnector {


  public static void main(String[] args) {
    PaymentComponents paymentComponents = DaggerPaymentComponents.builder().build();

    String type = "GiftCard";
    Transaction giftCardTransactionPre = Transaction.builder()
            .transactionId(TransactionId.of(type + "-Transaction"))
            .payment(Payment.of(PaymentId.of(type + "-Payment"), BigDecimal.valueOf(1L)))
            .build();
    System.out.println(type + "-Transaction pre-processing:" + giftCardTransactionPre);
    Transaction giftCardTransactionPost = paymentComponents.getGiftCardGatewayFactory().getGateway().process(giftCardTransactionPre);
    System.out.println(type + "-Transaction post-processing:" + giftCardTransactionPost);

    System.out.println("----------");

    type = "CreditCard";
    Transaction creditCardTransactionPre = Transaction.builder()
            .transactionId(TransactionId.of(type + "-Transaction"))
            .payment(Payment.of(PaymentId.of(type + "-Payment"), BigDecimal.valueOf(2L)))
            .build();
    System.out.println(type + "-Transaction pre-processing:" + creditCardTransactionPre);
    Transaction creditCardTransactionPost = paymentComponents.gerCreditCardGatewayFactory().getGateway().process(creditCardTransactionPre);
    System.out.println(type + "-Transaction post-processing:" + giftCardTransactionPost);


  }
}
