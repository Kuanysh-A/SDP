package menu;

import java.util.Scanner;

public class Menu {
    CakeMenu cakeMenu = new CakeMenu();
    boolean exit = false;

    public void runMenu() {
        printHeader();
        while (!exit) {
            printMenu();
            int choice = getInput();
            performAction(choice);
        }
    }

    private void printHeader() {
        System.out.println("+----------------------------------------+");
        System.out.println("|       Welcome to CakeApplication       |");
        System.out.println("+----------------------------------------+");
    }

    private void printMenu() {
        System.out.println("\nPlease make a selection:");
        System.out.println("1) Start making cake");
        System.out.println("0) Exit application");
    }

    private int getInput() {
        Scanner kb = new Scanner(System.in);
        int choice = -1;
        while (choice < 0 || choice > 1) {
            try {
                System.out.println("Enter your choice:");
                choice = Integer.parseInt(kb.nextLine());
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid selection. Please try again.");
            }
        }
        return choice;
    }

    private void performAction(int choice) {
        switch (choice) {
            case 0:
                exit = true;
                System.out.println("Exiting Cake Application..");
                break;
            case 1:
                cakeMenu.runCakeMenu();
                break;
            default:
                System.out.println("An unknown error has occurred.");
        }
    }
}
