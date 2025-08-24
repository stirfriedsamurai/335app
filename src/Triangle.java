/*
Ronnie Allen
CMSC 335 Project 1
23-AUG-2025

This class represents a triangle and is used to create and instance and
calculate the area of the triangle instance.
 */
import java.util.Scanner;

public class Triangle extends TwoDimensionalShape {
    private double base;
    private double height;

    public Triangle() {
        super();
    }

    @Override
    public double calculateArea () {
        return 0.5 * base * height;
    }

    @Override
    public void promptForArea (Scanner sc) {
        double tempBase = -1;
        double tempHeight = -1;

        // Loop to gather a valid double for base
        while (true) {
            System.out.print("What is the base?:    ");
            String userInput = sc.nextLine();

            try {
                tempBase = Double.parseDouble(userInput);
                if (tempBase < 0) {
                    System.out.println("Invalid Input. Enter a positive number.");
                } else {
                    break;
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid Input. Enter a positive number.");
            }
        }

        // Loop to gather a valid double for height
        while (true) {
            System.out.print("What is the height?:    ");
            String userInput = sc.nextLine();

            try {
                tempHeight = Double.parseDouble(userInput);
                if (tempHeight < 0) {
                    System.out.println("Invalid Input. Enter a positive number.");
                } else {
                    break;
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid Input. Enter a positive number.");
            }
        }

        // Assign class variables
        this.base = tempBase;
        this.height = tempHeight;
        this.area = new Area(calculateArea());
    }// end - method - promptForArea
}// end - class - Triangle
