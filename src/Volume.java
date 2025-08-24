/*
Ronnie Allen
CMSC 335 Project 1
23-AUG-2025

This is a small supporting class that is used by the ThreeDimensionalShape
class to represent a volume.
 */
public class Volume {
    private double volume;

    public Volume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}
