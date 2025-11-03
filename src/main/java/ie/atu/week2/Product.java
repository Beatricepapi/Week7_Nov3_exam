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
    }

    private static int getValidInt(Scanner input) {
        return 0;
    }
}
