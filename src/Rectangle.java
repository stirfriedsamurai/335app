/*
Ronnie Allen
CMSC 335 Project 1
23-AUG-2025

This class represents a rectangle and is used to create and instance and
calculate the area of the rectangle instance.
 */
import java.util.Scanner;

public class Rectangle extends TwoDimensionalShape {
    private double length;
    private double width;

    public Rectangle() {
        super();
    }

    @Override
    public double calculateArea () {
        return length * width;
    }

    @Override
    public void promptForArea (Scanner sc) {
        // Loop to gather a valid double for length
        double tempLength = -1;
        double tempWidth = -1;

        while (true) {
            System.out.print("What is the length?:    ");
            String userInput = sc.nextLine();

            try {
                tempLength = Double.parseDouble(userInput);
                if (tempLength < 0) {
                    System.out.println("Invalid Input. Enter a positive number.");
                } else {
                    break;
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid Input. Enter a positive number.");
            }
        }

        // Loop to gather a valid double for width
        while (true) {
            System.out.print("What is the width?:    ");
            String userInput = sc.nextLine();

            try {
                tempWidth = Double.parseDouble(userInput);
                if (tempWidth < 0) {
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
        this.length = tempLength;
        this.width = tempWidth;
        this.area = new Area(calculateArea());
    }// end - method - promptForArea
}// end - class - Rectangle
