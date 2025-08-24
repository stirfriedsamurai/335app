/*
Ronnie Allen
CMSC 335 Project 1
23-AUG-2025

This class represents a circle and is used to create and instance and
calculate the area of the circle instance.
 */
import java.util.Scanner;

public class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle() {
        super();
    }

    @Override
    public double calculateArea () {
        return radius * radius * Math.PI;
    }

    @Override
    public void promptForArea (Scanner sc) {
        // Loop to gather a valid double for radius
        double tempRadius = -1;

        while (true) {
            System.out.print("What is the radius?:    ");
            String userInput = sc.nextLine();

            try {
                tempRadius = Double.parseDouble(userInput);
                if (tempRadius < 0) {
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
        this.radius = tempRadius;
        this.area = new Area(calculateArea());
    }// end - method - promptForArea
}//end - class - circle
