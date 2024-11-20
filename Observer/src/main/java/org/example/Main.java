package org.example;

public class Main {
    public static void main(String[] args) {

        StockAgent agent = new StockAgent();

        StockAgency1 agency1 = new StockAgency1("Agency 1");
        StockAgency2 agency2 = new StockAgency2("Agency 2");

        agent.addAgency(agency1);
        agent.addAgency(agency2);


        agent.changeState("rising");
        agent.changeState("falling");

        agent.removeAgency(agency2);
        agent.changeState("rising higher");
    }
}