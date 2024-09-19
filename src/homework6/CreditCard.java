package homework6;

import java.util.Scanner;

public class CreditCard {

    private String account_number;
    private double money;

    public CreditCard(String account_number, double money) {
        this.account_number = account_number;
        this.money = money;
    }

    public void addMoney(double amount) {
        this.money += amount;
    }

    public void takeMoney(double amount) {
        if(this.money >= amount) {
            money -= amount;
        }
        else {
            System.out.println("Not enough money.");
        }
    }

    public void cardStatus() {
        System.out.println("The actual status of account number: " + account_number + " is " + money + " $ .");
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double initial_amount1;
        do {
            initial_amount1 = scan.nextDouble();
        } while(initial_amount1 < 0);

        double initial_amount2;
        do {
            initial_amount2 = scan.nextDouble();
        } while(initial_amount2 < 0);

        double initial_amount3;
        do {
            initial_amount3 = scan.nextDouble();
        } while(initial_amount3 < 0);

        CreditCard card1 = new CreditCard("num12345", initial_amount1);
        CreditCard card2 = new CreditCard("num23456", initial_amount2);
        CreditCard card3 = new CreditCard("num34567", initial_amount3);

        card1.addMoney(scan.nextDouble());
        card2.addMoney(scan.nextDouble());
        card3.takeMoney(scan.nextDouble());

        card1.cardStatus();
        card2.cardStatus();
        card3.cardStatus();

    }
}
