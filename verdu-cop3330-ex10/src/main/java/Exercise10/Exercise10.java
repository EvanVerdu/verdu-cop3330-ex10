package Exercise10;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.Scanner;

public class Exercise10 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
        String Price1 = scanner.nextLine();

        System.out.print("Enter the quantity of item 1: ");
        String Quantity1 = scanner.nextLine();

        System.out.print("Enter the price of item 2: ");
        String Price2 = scanner.nextLine();

        System.out.print("Enter the quantity of item 2: ");
        String Quantity2 = scanner.nextLine();

        System.out.print("Enter the price of item 3: ");
        String Price3 = scanner.nextLine();

        System.out.print("Enter the quantity of item 3: ");
        String Quantity3 = scanner.nextLine();

        int Pri1 = Integer.parseInt(Price1);
        int Quant1 = Integer.parseInt(Quantity1);
        int Pri2 = Integer.parseInt(Price2);
        int Quant2 = Integer.parseInt(Quantity2);
        int Pri3 = Integer.parseInt(Price3);
        int Quant3 = Integer.parseInt(Quantity3);

        double Subtotal = ((Pri1*Quant1)+(Pri2*Quant2)+(Pri3*Quant3));
        double tax = Subtotal*0.055;
        double total = Subtotal+tax;

        System.out.println("Subtotal: $" + String.format("%.2f", Subtotal));
        System.out.println("Tax: $" + String.format("%.2f",tax));
        System.out.print("Total: $" + String.format("%.2f", total));

    }

}
