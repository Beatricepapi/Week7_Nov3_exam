package ie.atu.week2;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Product {
    private static final String FILE_NAME = "product.txt";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter product name: ");
        int numProducts = getValidInt(input);

        String[] product1 = new String[numProducts];
        String[] product2 = new String[numProducts];
        String[] product3 = new String[numProducts];

        for (int i = 0; i < numProducts; i++) {
            System.out.printf("Enter product 1 name: %d: ", i + 1);
            product1[i] = input.next().trim();

            System.out.printf("Enter product 2 name: %d: ", i + 1);
            product2[i] = input.next().trim();

            System.out.printf("Enter product 3 name: %d: ", i + 1);
            product3[i] = input.next().trim();
        }

        System.out.println("Product List: ");
        for (int i = 0; i < numProducts; i++) {
            System.out.printf("Product 1: %s, Product 2: %s, Product 3: %s%n", product1[i], product2[i], product3[i]);
        }
    }
    private static int getValidInt(Scanner input) {
        return 0;
    }
}
