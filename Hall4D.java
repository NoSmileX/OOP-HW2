package org.example.cinema;

import java.util.Arrays;

public class Hall4D extends RegularHall {
    private boolean glasses;
    private boolean raincoat;
    private boolean[][] seats;

    public Hall4D(String titleOfMovie, String dateOfSession, boolean popcorn, boolean drinks, int maxRow, int maxSeats, boolean glasses, boolean raincoat) {
        super(titleOfMovie, dateOfSession, popcorn, drinks, maxRow, maxSeats);
        this.glasses = glasses;
        this.raincoat = raincoat;
        this.seats = new boolean[maxRow][maxSeats];
    }

    public Hall4D() {
    }

    public boolean isGlasses() {
        return glasses;
    }

    public void setGlasses(boolean glasses) {
        this.glasses = glasses;
    }

    public boolean isRaincoat() {
        return raincoat;
    }

    public void setRaincoat(boolean raincoat) {
        this.raincoat = raincoat;
    }

    @Override
    public boolean[][] getSeats() {
        return seats;
    }

    @Override
    public void setSeats(boolean[][] seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Hall4D{" +
                "glasses=" + glasses +
                ", raincoat=" + raincoat +
                ", seats=" + Arrays.toString(seats) +
                "} " + super.toString();
    }
}
