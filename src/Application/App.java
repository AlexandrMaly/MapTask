package Application;

import Data.DataProducts;
import Outputer.OutputProduct;
import utils.IdGenerate;

import java.util.Scanner;

public class App {
    private static Scanner sc = new Scanner(System.in);
    private static boolean continueWorking = true;
    private static OutputProduct outputProduct = new OutputProduct();
    private static DataProducts dataProducts = new DataProducts();

    public static void appStart() {
        while (continueWorking) {
            System.out.println("_____________________");
            displayMenu();
            IdGenerate.resetId();
            try {
                int option = Integer.parseInt(sc.nextLine());
                switch (option) {
                    case 1 -> outputProduct.getOutputProducts(dataProducts.getDataProducts());
                    case 2 -> {
                        System.out.println("Enter the ID");
                        int id = Integer.parseInt(sc.nextLine());
                        outputProduct.getOutputProduct(dataProducts.getDataProducts(), id);
                    }
                    case 3 -> {
                        dataProducts.getDataProducts();
                        System.out.println("Enter the name: ");
                        String name = sc.nextLine();
                        System.out.println("Enter the amount: ");
                        int amount = Integer.parseInt(sc.nextLine());
                        System.out.println("Enter the price: ");
                        double price = Double.parseDouble(sc.nextLine());
                        outputProduct.getOutputProducts(dataProducts.addProduct(name, amount, price));
                    }
                    case 4 -> {
                        System.out.println("Have a good day!");
                        continueWorking = false;
                    }
                    default -> System.out.println("Enter correct number");
                }
            } catch (NumberFormatException e) {
                System.out.println("Exception " + e.getMessage());
            }
        }
        sc.close();
    }

    private static void displayMenu() {
        System.out.println("""
                Menu:
                1. Get products list
                2. Get product by ID
                3. Add product to list
                4. Exit
                Enter number:
                """);
    }
}
