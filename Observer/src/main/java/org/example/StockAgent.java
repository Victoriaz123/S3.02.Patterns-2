package org.example;
import java.util.ArrayList;
import java.util.List;

public class StockAgent {

    private List<StockAgency> agencies = new ArrayList<>();
    private String stockState;


    public void addAgency(StockAgency agency) {
        if (agencies.contains(agency)) {
            System.out.println("Agency is already registered. Introduce another agency");
        } else {
            agencies.add(agency);
            System.out.println("Agency added: ");
        }
    }

    public void removeAgency(StockAgency agency) {
        if (!agencies.contains(agency)) {
            System.out.println("Agency not found.");
        } else {
            agencies.remove(agency);
            System.out.println("Agency removed: " + agency);
        }
    }

    public void notifyAgencies() {
        if (agencies.isEmpty()) {
            System.out.println("No agencies to notify.");
        } else {
            System.out.println("Notifying agencies about stock state: " + stockState);
            for (StockAgency agency : agencies) {
                agency.update(stockState);
            }
        }
    }

    public void changeState(String newState) {
        this.stockState = newState;
        System.out.println("Stock market state changed to " + newState);
        notifyAgencies();
    }
}