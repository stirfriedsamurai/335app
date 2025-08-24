/*
Ronnie Allen
CMSC 335 Project 1
23-AUG-2025

This class represents a torus and is used to create and instance and
calculate the volume of the torus instance.
 */
import java.util.Scanner;

public class Torus extends ThreeDimensionalShape {
    private double centerRadius;
    private double tubeRadius;

    public Torus() {
        super();
    }

    @Override
    public double calculateVolume () {
        return 2 * Math.PI * Math.PI * centerRadius * Math.pow(tubeRadius, 2);
    }

    @Override
    public void promptForVolume (Scanner sc) {
        double tempCenterRadius = -1;
        double tempTubeRadius = -1;

        // Loop to gather a valid double for center radius
        while (true) {
            System.out.print("What is the center radius?:    ");
            String userInput = sc.nextLine(
            );

            try {
                tempCenterRadius = Double.parseDouble(userInput);
                if (tempCenterRadius < 0) {
                    System.out.println("Invalid Input. Enter a positive number.");
                } else {
                    break;
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid Input. Enter a positive number.");
            }
        }

        // Loop to gather a valid double for tube radius
        while (true) {
            System.out.print("What is the tube radius?:    ");
            String userInput = sc.nextLine(
            );

            try {
                tempTubeRadius = Double.parseDouble(userInput);
                if (tempTubeRadius < 0) {
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
        this.centerRadius = tempCenterRadius;
        this.tubeRadius = tempTubeRadius;
        this.volume = new Volume(calculateVolume());
    }// end - method - promptForVolume
}// end - class - Cone
