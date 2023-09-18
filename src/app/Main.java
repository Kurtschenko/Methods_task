package app;

import java.util.Scanner;

public class Main {

    static double price;
    static double discountRate;
    static double discountAmount;
    static double priceAmount;
    private static final String CURRENCY = "USD";

    public static void main(String[] args) {

        inputPrice();
        calculatingDicsount();
        calculatingPrice();
        outputSumes();
    }

    private static void inputPrice() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the amount you want to spend on purchases: ");

        price = sc.nextDouble();
    }

    private static void calculatingDicsount() {

        if (price <= 5000) {
            discountRate = 5.0;
            discountAmount = (price * discountRate) / 100;

        } else if (price <= 10000) {
            discountRate = 10.0;
            discountAmount = (price * discountRate) / 100;

        } else {
            discountRate = 15.0;
            discountAmount = (price * discountRate) / 100;

        }
    }

    private static void calculatingPrice() {

        priceAmount = price - discountAmount;
    }

    private static void outputSumes() {

        System.out.println("Total price: " + price + " " + CURRENCY + "\n------------------------\n" + "Amount of discount: " + discountAmount + " " + CURRENCY + " (Discount rate " + discountRate + "%)" + "\n------------------------\n" + "Price for paying: " + priceAmount + " " + CURRENCY);
    }
}

