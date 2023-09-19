package org.example.users;

import org.example.History;

public class Admin extends User{
    public Admin(long id, String name, String api) {
        super(id, name, api);
    }

    @Override
    public String visionContext() {
        return "adminContext";
    }

    public boolean decideToBanOrNot (long tradeId) {
        return History.getHistorySingleton().checkTrade((int) tradeId).getPrice() < 0;
    }
}
