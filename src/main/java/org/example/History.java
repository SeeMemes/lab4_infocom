package org.example;

import org.example.entities.Item;
import org.example.entities.Trade;

import java.util.ArrayList;
import java.util.List;

public class History {
    /**
     * Паттерн Синглтон
     * Программе не нужно больше одного инстанса истории
     */
    private static History historySingleton = null;

    public static History getHistorySingleton() {
        if (historySingleton == null) historySingleton = new History();
        return historySingleton;
    }

    private final List<Trade> trades;

    private History() {
        this.trades = new ArrayList<>();
    }

    public void saveTradeToHistory(Item givenItem, long buyerId, long sellerId, long price) {
        trades.add(new Trade(givenItem, buyerId, sellerId, price));
    }

    public void saveTradeToHistory(Trade trade) {
        trades.add(trade);
    }

    public Trade checkTrade(int tradeId) {
        return trades.get(tradeId);
    }
}
