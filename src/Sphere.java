/*
Ronnie Allen
CMSC 335 Project 1
23-AUG-2025

This class represents a sphere and is used to create and instance and
calculate the volume of the sphere instance.
 */
import java.util.Scanner;

public class Sphere extends ThreeDimensionalShape {
    private double radius;

    public Sphere() {
        super();
    }

    @Override
    public double calculateVolume () {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public void promptForVolume (Scanner sc) {
        double tempRadius = -1;

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

        // Assign class variables
        this.radius = tempRadius;
        this.volume = new Volume(calculateVolume());
    }// end - method - promptForVolume
}// end - class - Sphere
