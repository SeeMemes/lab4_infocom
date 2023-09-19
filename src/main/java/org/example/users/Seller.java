package org.example.users;

import org.example.Market;
import org.example.SwapProvider;
import org.example.entities.Trade;

public class Seller extends User {
    public Seller(long id, String name, String api, boolean bankCardAccept, boolean trc20Accept) {
        super(id, name, api);
        this.setBankCardAccept(bankCardAccept);
        this.setTrc20Accept(trc20Accept);
    }

    @Override
    public String visionContext() {
        return "sellerContext";
    }

    public void saleItem (long itemId, String itemHashName, long price) {
        Market market = Market.getMarket();
        market.saleItem(itemId, itemHashName, this.getId(), price, this);
    }

    public boolean giveItem (Trade trade) {
        return SwapProvider.getSwapProvider().confirmTrade(trade, this);
    }
}
