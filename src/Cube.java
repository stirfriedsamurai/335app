/*
Ronnie Allen
CMSC 335 Project 1
23-AUG-2025

This class represents a cube and is used to create and instance and
calculate the volume of the cube instance.
 */
import java.util.Scanner;

public class Cube extends ThreeDimensionalShape {
    private double side;

    public Cube() {
        super();
    }

    @Override
    public double calculateVolume () {
        return Math.pow(side, 3);
    }

    @Override
    public void promptForVolume (Scanner sc) {
        double tempSide = -1;

        // Loop to gather a valid double for side length
        while (true) {
            System.out.print("What is the side length?:    ");
            String userInput = sc.nextLine(
            );

            try {
                tempSide = Double.parseDouble(userInput);
                if (tempSide < 0) {
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
        this.side = tempSide;
        this.volume = new Volume(calculateVolume());
    }// end - method - promptForVolume
}// end - class - Sphere
