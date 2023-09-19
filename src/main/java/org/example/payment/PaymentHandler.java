package org.example.payment;

import org.example.users.User;

public abstract class PaymentHandler {
    private PaymentHandler successor;

    public abstract void handle(User user, long moneyAmount);

    public void setSuccessor(PaymentHandler successor) {
        this.successor = successor;
    }

    public PaymentHandler getSuccessor() {
        return successor;
    }
}
