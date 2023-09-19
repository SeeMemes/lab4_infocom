package org.example.payment;

import org.example.users.User;

public class BankCardPayment extends PaymentHandler{
    @Override
    public void handle(User user, long moneyAmount) {
        if (user.isBankCardAccept()) {
            System.out.println("Перевод по банковской карте");
            user.addMoney(moneyAmount);
        }
        else if (getSuccessor() != null) getSuccessor().handle(user, moneyAmount);
    }
}
