package org.example.payment;

import org.example.users.User;

public class TRC20Payment extends PaymentHandler{
    @Override
    public void handle(User user, long moneyAmount) {
        if (user.isTrc20Accept()) {
            System.out.println("Перевод по сети TRC-20 карте");
            user.addMoney(moneyAmount);
        }
        else if (getSuccessor() != null) getSuccessor().handle(user, moneyAmount);
    }
}
