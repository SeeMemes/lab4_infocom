package org.example;

import org.example.users.Buyer;
import org.example.users.Seller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Seller seller = new Seller(1, "Alex", "32", true, true);
        Buyer buyer = new Buyer(1, "Gregory", "18");
        while (true) {
            seller.saleItem(2, "prikol", 13);
            buyer.buyItem("prikol");
            scanner.nextLine();
        }
    }
}
