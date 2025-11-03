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

        SaveToFile(product1, product2, product3);
        System.out.println("Product details saved to " + FILE_NAME);
        input.close();
    }

    private static void SaveToFile() {
    }

    private static int getValidInt(Scanner input) {
        while (true) {
            try {
                return Integer.parseInt(input.next());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number");
            }
        }
    }
    private static void SaveToFile(String[] product1, String[] product2, String[] product3) {
        try(PrintWriter writer = new PrintWriter(new) FileWriter(FILE_NAME))){
    for(int i = 0; i < product1.length; i++){
        writer.printf("Product 1: %s, product 2: %s, Product 3: %s%n"), product1[i], product2[i] and product3[i]);
    }
        }catch(IOExeption e){
    System.out.println("Error saving to file: " + egetMassage());
        }
    }

    private static String egetMassage() {
        return 0;
    }
}
