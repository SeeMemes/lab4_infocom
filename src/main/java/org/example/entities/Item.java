package org.example.entities;

import org.example.users.Seller;

public class Item {
    private final long itemId;
    private final String itemHashName;
    private final long uId;
    private final long price;
    private final Seller seller;

    public Item(long itemId, String itemHashName, long uId, long price, Seller seller) {
        this.itemId = itemId;
        this.itemHashName = itemHashName;
        this.uId = uId;
        this.price = price;
        this.seller = seller;
    }

    public long getuId() {
        return uId;
    }

    public long getItemId() {
        return itemId;
    }

    public String getItemHashName() {
        return itemHashName;
    }

    public long getPrice() {
        return price;
    }

    public Seller getSeller() {
        return seller;
    }
}
