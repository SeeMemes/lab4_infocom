package org.example.users;

import org.example.Market;

public abstract class User {
    private final long id;
    private long money;
    private final String name;
    private final String api;
    private boolean trc20Accept;
    private boolean bankCardAccept;
    public User(long id, String name, String api) {
        this.id = id;
        this.name = name;
        this.api = api;
        this.money = 0;
    }

    /**
     * Strategy Pattern
     * Разная "стратегия" отображения для разных типов пользователей
     */
    public abstract String visionContext();

    public void checkPrice(String itemHashName) {
        Market market = Market.getMarket();
        market.checkPrice(itemHashName);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getApi() {
        return api;
    }

    public boolean isTrc20Accept() {
        return trc20Accept;
    }

    public void setTrc20Accept(boolean trc20Accept) {
        this.trc20Accept = trc20Accept;
    }

    public boolean isBankCardAccept() {
        return bankCardAccept;
    }

    public void setBankCardAccept(boolean bankCardAccept) {
        this.bankCardAccept = bankCardAccept;
    }

    public long getMoney() {
        return money;
    }

    public void addMoney(long money) {
        this.money += money;
    }

    public void subtractMoney(long money) {
        this.money -= money;
    }
}
