package homework6;

import java.util.Scanner;

public class CreditCard {

    private String account_number;
    private double money;

    public CreditCard(String account_number) {
        this.account_number = account_number;
    }

    public void addMoney(double amount) {
        money += amount;
    }

    public void takeMoney(double amount) {
        money -= amount;
    }

    public void cardStatus() {
        System.out.println("The actual status of account number: " + account_number + " is " + money + " $ .");
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double initial_amount;
        do {
            initial_amount = scan.nextDouble();
        } while(initial_amount < 0);

        CreditCard card1 = new CreditCard("12345");
        CreditCard card2 = new CreditCard("23456");
        CreditCard card3 = new CreditCard("34567");

        card1.addMoney(11.2);
        card2.addMoney(14.7);
        card3.takeMoney(3.76);

        card1.cardStatus();
        card2.cardStatus();
        card3.cardStatus();

    }
}
