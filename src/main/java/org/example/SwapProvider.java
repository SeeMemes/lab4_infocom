package org.example;

import org.example.entities.Trade;
import org.example.payment.BankCardPayment;
import org.example.payment.PaymentHandler;
import org.example.payment.TRC20Payment;
import org.example.users.Seller;

public class SwapProvider {
    private static SwapProvider swapProvider = null;
    private final PaymentHandler bankCardPayment = new BankCardPayment();
    private final PaymentHandler trc20Payment = new TRC20Payment();

    public static SwapProvider getSwapProvider() {
        if (swapProvider == null) swapProvider = new SwapProvider();
        return swapProvider;
    }

    private SwapProvider() {
        bankCardPayment.setSuccessor(trc20Payment);
    }

    public long sendTradeOffer() {
        return 0;
    }

    /**
     * Singleton + Chain of Responsibility
     */
    public boolean confirmTrade(Trade trade, Seller seller) {
        bankCardPayment.handle(seller, trade.getPrice());
        History.getHistorySingleton().saveTradeToHistory(trade);
        return true;
    }
}
