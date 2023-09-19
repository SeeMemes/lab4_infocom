package org.example.entities;

public class Trade {
    private final long tradeId;
    private final Item givenItem;
    private final long buyerId;
    private final long sellerId;
    private final long price;

    public Trade(Item givenItem, long buyerId, long sellerId, long price) {
        this.tradeId = 1;
        this.givenItem = givenItem;
        this.buyerId = buyerId;
        this.sellerId = sellerId;
        this.price = price;
    }

    public long getTradeId() {
        return tradeId;
    }

    public Item getGivenItem() {
        return givenItem;
    }

    public long getBuyerId() {
        return buyerId;
    }

    public long getSellerId() {
        return sellerId;
    }

    public long getPrice() {
        return price;
    }
}
