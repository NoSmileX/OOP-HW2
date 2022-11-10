package org.example.cinema;

import java.util.Arrays;

public class RegularHall extends Movies {
    private boolean popcorn;
    private boolean drinks;

    private int maxRow;
    private int maxSeats;
    private boolean[][] seats;

    public RegularHall(String titleOfMovie, String dateOfSession, boolean popcorn, boolean drinks, int maxRow, int maxSeats) {
        super(titleOfMovie, dateOfSession);
        this.popcorn = popcorn;
        this.drinks = drinks;
        this.maxRow = maxRow;
        this.maxSeats = maxSeats;

        this.seats = new boolean[maxRow][maxSeats];
    }

    public RegularHall() {
    }

    public void getReserved(int row, int place) {
        if (row <= maxRow && place <= maxSeats && row > 0 && place > 0) {
            if (!seats[row - 1][place - 1]) {
                seats[row - 1][place - 1] = true;
                System.out.println("Вы забронировали место");
                System.out.println("Место: " + place + " Ряд: " + row + ". Фильм " + getTitleOfMovie() + ". Сеанс " + getDateOfSession());
            } else {
                System.out.println("Место заднято, попробуйте другое место");
            }
        } else
            System.out.println("Вы ввели не коректный ряд или место");
    }

    public boolean randomReserve() {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats.length; j++) {
                if (!seats[i][j]) {
                    getReserved((i + 1), (j + 1));
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isPopcorn() {
        return popcorn;
    }

    public void setPopcorn(boolean popcorn) {
        this.popcorn = popcorn;
    }

    public boolean isDrinks() {
        return drinks;
    }

    public void setDrinks(boolean drinks) {
        this.drinks = drinks;
    }

    public int getMaxRow() {
        return maxRow;
    }

    public void setMaxRow(int maxRow) {
        this.maxRow = maxRow;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public boolean[][] getSeats() {
        return seats;
    }

    public void setSeats(boolean[][] seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "MiniHall{" +
                "openBar=" + popcorn +
                ", food=" + drinks +
                ", maxRow=" + maxRow +
                ", maxSeats=" + maxSeats +
                ", seats=" + Arrays.toString(seats) +
                "} " + super.toString();
    }
}
