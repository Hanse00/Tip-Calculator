package org.example;

import java.util.Scanner;

public class App {
    public Double totalWithTip(Double totalBeforeTip, int tipPercentage) {
        if (totalBeforeTip < 0.0) {
            throw new IllegalArgumentException("Total cannot be negative");
        }
        double totalCost = totalBeforeTip + (totalBeforeTip*tipPercentage/100);

        double totalCents = totalCost * 100;
        totalCents = Math.round(totalCents);
        return totalCents / 100;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input before tip amount : ");
        double totalBeforeTip = in.nextDouble();

        System.out.println("Please input tip percentage : ");
        int tipPercentage = in.nextInt();

        App app = new App();
        Double result = app.totalWithTip(totalBeforeTip, tipPercentage);
        System.out.println(result);
    }
}
