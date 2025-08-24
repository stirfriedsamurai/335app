/*
Ronnie Allen
CMSC 335 Project 1
23-AUG-2025

This class represents a square and is used to create and instance and
calculate the area of the square instance.
 */
import java.util.Scanner;

public class Square extends TwoDimensionalShape {
    private double sideLength;

    public Square() {
        super();
    }

    @Override
    public double calculateArea () {
        return sideLength * sideLength;
    }

    @Override
    public void promptForArea (Scanner sc) {
        // Loop to gather a valid double for radius
        double tempSideLength = -1;

        while (true) {
            System.out.print("What is the side length?:    ");
            String userInput = sc.nextLine();

            try {
                tempSideLength = Double.parseDouble(userInput);
                if (tempSideLength < 0) {
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
        this.sideLength = tempSideLength;
        this.area = new Area(calculateArea());
    }// end - method - promptForArea
}//end - class - square
