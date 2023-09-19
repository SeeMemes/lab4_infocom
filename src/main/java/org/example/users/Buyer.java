package org.example.users;

import org.example.Market;

public class Buyer extends User {
    public Buyer(long id, String name, String api) {
        super(id, name, api);
    }

    @Override
    public String visionContext() {
        return "buyerContext";
    }

    public void buyItem (String itemHashName) {
        Market market = Market.getMarket();
        /**
         * Шаблон "Фасад"
         */
        if (market.buyItem(itemHashName, this.getId())) System.out.println("Предмет \"" + itemHashName + "\" успешно куплен");
    }
}
