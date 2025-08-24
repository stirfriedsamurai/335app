/*
Ronnie Allen
CMSC 335 Project 1
23-AUG-2025


 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Project1 {

    // ========================================================================
    // Main -------------------------------------------------------------------
    // ========================================================================

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueInput = true;
        int userChoice;

        // Print the greeting once
        System.out.println("\n*********Welcome to the Java OO Shapes Program **********");

        // While loop to prompt for user input
        while (continueInput) {
            // Prompt the user for input
            printMainMenu();
            userChoice =  getValidNumberInput(sc);

            // Switch case for the users choice
            switch (userChoice) {
                case 1:
                    System.out.println("You have selected a Circle");
                    Circle circle = new Circle();
                    circle.promptForArea(sc);
                    System.out.println("The area of the Circle is " + String.format("%.2f", circle.getArea()) + ".");
                    break;
                case 2:
                    System.out.println("You have selected a Rectangle");
                    Rectangle rectangle = new Rectangle();
                    rectangle.promptForArea(sc);
                    System.out.println("The area of the Rectangle is " + String.format("%.2f", rectangle.getArea()) + ".");
                    break;
                case 3:
                    System.out.println("You have selected a Square");
                    Square square = new Square();
                    square.promptForArea(sc);
                    System.out.println("The area of the Square is " + String.format("%.2f", square.getArea()) + ".");
                    break;
                case 4:
                    System.out.println("You have selected a Triangle");
                    Triangle triangle = new Triangle();
                    triangle.promptForArea(sc);
                    System.out.println("The area of the Triangle is " + String.format("%.2f", triangle.getArea()) + ".");
                    break;
                case 5:
                    System.out.println("You have selected a Sphere");
                    Sphere sphere = new Sphere();
                    sphere.promptForVolume(sc);
                    System.out.println("The volume of the Sphere is " + String.format("%.2f", sphere.getVolume()) + ".");
                    break;
                case 6:
                    System.out.println("You have selected a Cube");
                    Cube cube = new Cube();
                    cube.promptForVolume(sc);
                    System.out.println("The volume of the Cube is " + String.format("%.2f", cube.getVolume()) + ".");
                    break;
                case 7:
                    System.out.println("You have selected a Cone");
                    Cone cone = new Cone();
                    cone.promptForVolume(sc);
                    System.out.println("The volume of the Cone is " + String.format("%.2f", cone.getVolume()) + ".");
                    break;
                case 8:
                    System.out.println("You have selected a Cylinder");
                    Cylinder cylinder = new Cylinder();
                    cylinder.promptForVolume(sc);
                    System.out.println("The volume of the Cylinder is " + String.format("%.2f", cylinder.getVolume()) + ".");
                    break;
                case 9:
                    System.out.println("You have selected a Torus");
                    Torus torus = new Torus();
                    torus.promptForVolume(sc);
                    System.out.println("The volume of the Torus is " + String.format("%.2f", torus.getVolume()) + ".");
                    break;
                case 10:
                    System.out.println("Thanks for using the program. Today is " + getCurrentDateTime());
                    continueInput = false;
                    break;
            }// end - switch - user choice

            // Exit the loop if the user doesn't want to continue
            if (continueInput) {
                continueInput = continuePrompt();
            } 
        }// end - while - user controlled

        sc.close();
    }// end - main

    // ========================================================================
    // Private Methods --------------------------------------------------------
    // ========================================================================

    private static void printMainMenu() {
        System.out.println("\nSelect from the menu below:\n");
        System.out.println("1. Construct a Circle");
        System.out.println("2. Construct a Rectangle");
        System.out.println("3. Construct a Square");
        System.out.println("4. Construct a Triangle");
        System.out.println("5. Construct a Sphere");
        System.out.println("6. Construct a Cube");
        System.out.println("7. Construct a Cone");
        System.out.println("8. Construct a Cylinder");
        System.out.println("9. Construct a Torus");
        System.out.println("10. Exit the program");
    }// end - method - printMainMenu

    private static int getValidNumberInput(Scanner sc) {
        int choice = 0;
        boolean valid = false;

        while(!valid) {
            System.out.print("\nEnter your choice (1-10): ");
            String userInput = sc.nextLine();

            try{
                choice = Integer.parseInt(userInput);
                if (choice >= 1 && choice <= 10) {
                    valid = true;
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input. Try again.");
            }// end - try catch
        }// end - while

        return choice;
    }// end - method - validateNumberInput

    private static boolean continuePrompt() {
        Scanner contiueScanner = new Scanner(System.in);
        String answer = "";
        boolean toContinue;

        while (true) {
            System.out.print("Would you like to continue? (Y or N): ");
            answer = contiueScanner.nextLine().trim().toLowerCase();

            if (answer.equals("y")) {
                toContinue = true;
                break;
            } else if (answer.equals("n")) {
                System.out.println("Thanks for using the program. Today is " + getCurrentDateTime());
                toContinue = false;
                break;
            } else {
                System.out.println("Sorry I do not understand. Enter Y or N: ");
            }
        }

        return toContinue;
    }// end - method - continuePrompt

    private static String getCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd h:mma", Locale.ENGLISH);

        return now.format(formatter);
    }// end - method - getCurrentDateTime

}// end - class - Project1
