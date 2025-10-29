package org.example;

public class App {
    public String getGreeting() {
        return "Hello World";
    }

    public Double totalWithTip(Double totalBeforeTip, int tipPercentage) {
        double totalCost = totalBeforeTip + (totalBeforeTip*tipPercentage/100);
        return totalCost;
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
