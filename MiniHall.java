package org.example.cinema;

import java.util.Arrays;

public class MiniHall extends RegularHall {
    private boolean openBar;
    private boolean unlimitedFood;

    private boolean[][] seats;

    public MiniHall(String titleOfMovie, String dateOfSession, boolean popcorn, boolean drinks, int maxRow, int maxSeats, boolean openBar, boolean unlimitedFood) {
        super(titleOfMovie, dateOfSession, popcorn, drinks, maxRow, maxSeats);
        this.openBar = openBar;
        this.unlimitedFood = unlimitedFood;

        this.seats = new boolean[maxRow][maxSeats];
    }

    public MiniHall() {
    }

    public boolean isOpenBar() {
        return openBar;
    }

    public void setOpenBar(boolean openBar) {
        this.openBar = openBar;
    }

    public boolean isUnlimitedFood() {
        return unlimitedFood;
    }

    public void setUnlimitedFood(boolean unlimitedFood) {
        this.unlimitedFood = unlimitedFood;
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
        return "MiniHall{" + "openBar=" + openBar + ", unlimitedFood=" + unlimitedFood + ", seats=" + Arrays.toString(seats) + "} " + super.toString();
    }
}
