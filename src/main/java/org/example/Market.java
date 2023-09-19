package org.example;

import org.example.entities.Item;
import org.example.entities.Trade;
import org.example.users.Seller;

import java.util.HashMap;
import java.util.Map;

public class Market {
    private static Market thisMarket = null;

    public static Market getMarket() {
        if (thisMarket == null) thisMarket = new Market();
        return thisMarket;
    }

    private final Map<String, Item> items;

    private Market() {
        this.items = new HashMap<>();
    }

    public void saleItem(long itemId, String itemHashName, long uId, long price, Seller seller) {
        items.put(itemHashName, new Item(itemId, itemHashName, uId, price, seller));
    }

    public boolean buyItem(String itemHashName, long buyerID) {
        System.out.println("Searching for item \"" + itemHashName + "\"");
        Item item = items.get(itemHashName);
        System.out.println("Found item with id: " + item.getItemId());
        if (new WalletStorage().isEnoughBalance())
            items.remove(itemHashName);
        Trade trade = new Trade(item, buyerID, item.getSeller().getId(), item.getPrice());
        Seller seller = item.getSeller();
        System.out.println("Buying from seller: " + seller.getName());
        return seller.giveItem(trade);
    }

    public long checkPrice(String itemHashName) {
        return items.get(itemHashName).getPrice();
    }
}
