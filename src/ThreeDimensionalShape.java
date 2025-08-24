/*
Ronnie Allen
CMSC 335 Project 1
23-AUG-2025


 */
import java.util.Scanner;

public abstract class ThreeDimensionalShape extends Shape {
    protected Volume volume;

    public ThreeDimensionalShape(){
        this.dimensions = new NumberofDimensions(3);
    }

    public double getVolume() {
        return volume.getVolume();
    }

    public abstract double calculateVolume();

    public abstract void promptForVolume(Scanner sc);
}
