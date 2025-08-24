/*
Ronnie Allen
CMSC 335 Project 1
23-AUG-2025

This abstract class is used to provide guidelines for all
subclasses to follow.
 */
import java.util.Scanner;

public abstract class TwoDimensionalShape extends Shape {
    protected Area area;

    public TwoDimensionalShape(){
        this.dimensions = new NumberofDimensions(2);
    }

    public double getArea() {
        return area.getArea();
    }

    public abstract double calculateArea();

    public abstract void promptForArea(Scanner sc);
}
