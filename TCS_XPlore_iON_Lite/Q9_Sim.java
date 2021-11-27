package TCS_XPlore_iON_Lite;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Q9_Sim {

    public static void main(String[] args) {
        Sim[] cards = new Sim[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int simId = sc.nextInt();
            sc.nextLine();
            String customerName = sc.nextLine();
            double balance = sc.nextDouble();
            double ratePerSecond = sc.nextDouble();
            sc.nextLine();
            String circle = sc.nextLine();

            cards[i] = new Sim(simId, customerName, balance, ratePerSecond, circle);
        }

        String circle1 = sc.nextLine();
        String circle2 = sc.nextLine();

        Sim[] result = transferCustomerCircle(cards, circle1, circle2);

        for (Sim s : result)
            System.out.println(s.getSimId() + " " + s.getCustomerName() + " "
                    + s.getCircle() + " " + s.getRatePerSecond());

    }

    public static Sim[] transferCustomerCircle(Sim[] cards, String circle1, String circle2) {
//method logic
        List<Sim> list = new LinkedList<>();
        for (Sim card : cards) {
            if (card.circle.equalsIgnoreCase(circle1)) {
                card.circle = circle2;
                list.add(card);
            }
        }

        Sim[] arr = list.toArray(new Sim[list.size()]);

        Arrays.sort(arr);
        return arr;
    }
}

class Sim implements Comparable<Sim> {
    //code to build Sim class
    int simId;
    String customerName;
    double balance;
    double ratePerSecond;
    String circle;

    public Sim(int simId, String customerName, double balance, double ratePerSecond, String circle) {
        this.simId = simId;
        this.customerName = customerName;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    public int getSimId() {
        return simId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public double getRatePerSecond() {
        return ratePerSecond;
    }

    public String getCircle() {
        return circle;
    }


    @Override
    public int compareTo(Sim o) {
        if (this.ratePerSecond > o.ratePerSecond) return -1;
        else if (this.ratePerSecond < o.ratePerSecond) return 1;
        return 0;
    }
}
