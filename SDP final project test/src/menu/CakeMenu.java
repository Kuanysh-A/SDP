package menu;

import facade.CakeMaker;

import java.util.Scanner;

public class CakeMenu {
    CakeMaker cakeMaker = new CakeMaker();

    public void runCakeMenu() {
        printCakes();
        int choice = getInput();
        printSizes();
        int size = getSizeInput();
        printGlazes();
        int glaze = getGlazeInput();
        performAction(choice, size, glaze);
    }

    private int getInput() {
        Scanner kbb = new Scanner(System.in);
        int choice = -1;
        while (choice < 1 || choice > 5) {
            try {
                System.out.println("Choose a cake:");
                choice = Integer.parseInt(kbb.nextLine());
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid selection. Please try again.");
            }
        }
        return choice;
    }

    private int getSizeInput() {
        Scanner kbb = new Scanner(System.in);
        int size = -1;
        while (size < 1 || size > 3) {
            try {
                System.out.println("Choose a cake layer size:");
                size = Integer.parseInt(kbb.nextLine());
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid selection. Please try again.");
            }
        }
        return size;
    }

    private int getGlazeInput() {
        Scanner kbb = new Scanner(System.in);
        int glaze = -1;
        while (glaze < 1 || glaze > 5) {
            try {
                System.out.println("Choose a glaze for a cake:");
                glaze = Integer.parseInt(kbb.nextLine());
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid selection. Please try again.");
            }
        }
        return glaze;
    }

    private void printCakes() {
        System.out.println("Choose a cake:");
        System.out.println("1) Biscuit");
        System.out.println("2) Carrot cake");
        System.out.println("3) Chocolate cake");
        System.out.println("4) Cinnamon cake");
        System.out.println("5) Red velvet cake");
    }

    private void printSizes() {
        System.out.println("Choose cake layer size:");
        System.out.println("1) Small");
        System.out.println("2) Medium");
        System.out.println("3) Large");
    }

    private void printGlazes() {
        System.out.println("Choose a glaze for a cake");
        System.out.println("1) Don't add any glaze");
        System.out.println("2) Carrot cream glaze");
        System.out.println("3) Chocolate glaze");
        System.out.println("4) Cinnamon creat glaze");
        System.out.println("5) Red velvet cream glaze");
    }

    private void performAction(int choice, int size, int glaze) {
        switch (choice) {
            case 1:
                cakeMaker.makeBiscuit(size, glaze);
                break;
            case 2:
                cakeMaker.makeCarrotCake(size, glaze);
                break;
            case 3:
                cakeMaker.makeChocolateCake(size, glaze);
                break;
            case 4:
                cakeMaker.makeCinnamonCake(size, glaze);
                break;
            case 5:
                cakeMaker.makeRedVelvetCake(size, glaze);
                break;
            default:
                System.out.println("An unknown error has occurred.");
        }
    }


}
