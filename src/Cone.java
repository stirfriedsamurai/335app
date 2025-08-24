/*
Ronnie Allen
CMSC 335 Project 1
23-AUG-2025

This class represents a cone and is used to create and instance and
calculate the volume of the cone instance.
 */
import java.util.Scanner;

public class Cone extends ThreeDimensionalShape {
    private double radius;
    private double height;

    public Cone() {
        super();
    }

    @Override
    public double calculateVolume () {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public void promptForVolume (Scanner sc) {
        double tempRadius = -1;
        double tempHeight = -1;

        // Loop to gather a valid double for radius
        while (true) {
            System.out.print("What is the radius?:    ");
            String userInput = sc.nextLine(
            );

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

        // Loop to gather a valid double for height
        while (true) {
            System.out.print("What is the height?:    ");
            String userInput = sc.nextLine(
            );

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
        this.radius = tempRadius;
        this.height = tempHeight;
        this.volume = new Volume(calculateVolume());
    }// end - method - promptForVolume
}// end - class - Cone
