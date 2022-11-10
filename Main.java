package org.example.cinema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Сеанс на 18:00
        RegularHall regularHall18 = new RegularHall("Star wars", "12.12.2022 18:00", true, true, 10, 10);
        Hall4D hall4D18 = new Hall4D("Spider man", "12.12.2022 18:00", true, true, 8, 8, true, true);
        MiniHall miniHall18 = new MiniHall("Deadpool", "12.12.2022 18:00", false, false, 4, 6, true, true);
        // Сеанс на 20:00
        RegularHall regularHall20 = new RegularHall("Star wars", "12.12.2022 20:00", true, true, 10, 10);
        Hall4D hall4D20 = new Hall4D("Spider man", "12.12.2022 20:00", true, true, 8, 8, true, true);
        MiniHall miniHall20 = new MiniHall("Deadpool", "12.12.2022 20:00", false, false, 4, 6, true, true);
        //Сеанс на 22:00
        RegularHall regularHall22 = new RegularHall("Star wars", "12.12.2022 22:00", true, true, 10, 10);
        Hall4D hall4D22 = new Hall4D("Spider man", "12.12.2022 22:00", true, true, 8, 8, true, true);
        MiniHall miniHall22 = new MiniHall("Deadpool", "12.12.2022 22:00", false, false, 4, 6, true, true);

        do {
            System.out.println("Добро пожаловать в кинотеатр \"Midnight Owl\" ! ");
            System.out.println("Выберите фильм для просмотра:");
            System.out.println("1. " + regularHall18.getTitleOfMovie() + ". В главном зале");
            System.out.println("2. " + hall4D18.getTitleOfMovie() + ". В зале 4D");
            System.out.println("3. " + miniHall18.getTitleOfMovie() + ". В VIP мини зале");
            System.out.println("4. Забронировать место на случайный фильм, сеанс и место.");
            System.out.println("5. Выход из меню");
            System.out.println("Нажмите цифру соответсвующую вашему выбору:");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("В цену билета включен попкорн и напиток!");
                do {
                    System.out.println("На какой сеанс бронируем билет? Введите, пожалуйста, число.");
                    System.out.println("1. " + regularHall18.getDateOfSession() + "\n2. " + regularHall20.getDateOfSession() + "\n3. " + regularHall22.getDateOfSession());
                    int session = scanner.nextInt();
                    if (session == 1) {
                        System.out.println("В каком ряду и какое место бронируем?");
                        regularHall18.getReserved(scanner.nextInt(), scanner.nextInt());
                        System.out.println("Если хотите забронировать еще билет: нажмите 4. Если хотите вернутся в главное меню: нажмите любую клвишу");
                    } else if (session == 2) {
                        System.out.println("В каком ряду и какое место бронируем?");
                        regularHall20.getReserved(scanner.nextInt(), scanner.nextInt());
                        System.out.println("Если хотите забронировать еще билет: нажмите 4. Если хотите вернутся в главное меню: нажмите любую клвишу");
                    } else if (session == 3) {
                        System.out.println("В каком ряду и какое место бронируем?");
                        regularHall22.getReserved(scanner.nextInt(), scanner.nextInt());
                        System.out.println("Если хотите забронировать еще билет: нажмите 4. Если хотите вернутся в главное меню: нажмите любую клвишу");
                    }
                } while (scanner.next().equalsIgnoreCase("4"));
            }

            if (choice == 2) {
                System.out.println("В цену билета включен попкорн, напиток, 3D очки и дождевик");
                do {
                    System.out.println("На какой сеанс бронируем билет? Введите, пожалуйста, число.");
                    System.out.println("1. " + hall4D18.getDateOfSession() + "\n2. " + hall4D20.getDateOfSession() + "\n3. " + hall4D22.getDateOfSession());
                    int session = scanner.nextInt();
                    if (session == 1) {
                        System.out.println("В каком ряду и какое место бронируем?");
                        hall4D18.getReserved(scanner.nextInt(), scanner.nextInt());
                        System.out.println("Если хотите забронировать еще билет: нажмите 4. Если хотите вернутся в главное меню: нажмите любую клвишу");
                    } else if (session == 2) {
                        System.out.println("В каком ряду и какое место бронируем?");
                        hall4D20.getReserved(scanner.nextInt(), scanner.nextInt());
                        System.out.println("Если хотите забронировать еще билет: нажмите 4. Если хотите вернутся в главное меню: нажмите любую клвишу");
                    } else if (session == 3) {
                        System.out.println("В каком ряду и какое место бронируем?");
                        hall4D22.getReserved(scanner.nextInt(), scanner.nextInt());
                        System.out.println("Если хотите забронировать еще билет: нажмите 4. Если хотите вернутся в главное меню: нажмите любую клвишу");
                    }
                } while (scanner.next().equalsIgnoreCase("4"));
            }
            if (choice == 3) {
                System.out.println("В цену билета включен безлимитный доступ к бару и шведский стол");
                do {
                    System.out.println("На какой сеанс бронируем билет? Введите, пожалуйста, число.");
                    System.out.println("1. " + miniHall18.getDateOfSession() + "\n2. " + miniHall20.getDateOfSession() + "\n3. " + miniHall22.getDateOfSession());
                    int session = scanner.nextInt();
                    if (session == 1) {
                        System.out.println("В каком ряду и какое место бронируем?");
                        miniHall18.getReserved(scanner.nextInt(), scanner.nextInt());
                        System.out.println("Если хотите забронировать еще билет: нажмите 4. Если хотите вернутся в главное меню: нажмите любую клвишу");
                    } else if (session == 2) {
                        System.out.println("В каком ряду и какое место бронируем?");
                        miniHall20.getReserved(scanner.nextInt(), scanner.nextInt());
                        System.out.println("Если хотите забронировать еще билет: нажмите 4. Если хотите вернутся в главное меню: нажмите любую клвишу");
                    } else if (session == 3) {
                        System.out.println("В каком ряду и какое место бронируем?");
                        miniHall22.getReserved(scanner.nextInt(), scanner.nextInt());
                        System.out.println("Если хотите забронировать еще билет: нажмите 4. Если хотите вернутся в главное меню: нажмите любую клвишу");
                    }
                } while (scanner.next().equalsIgnoreCase("4"));
            }
            if (choice == 4) {
                do {
                    if (regularHall18.randomReserve()) break;
                    if (regularHall20.randomReserve()) break;
                    if (regularHall22.randomReserve()) break;
                    if (miniHall18.randomReserve()) break;
                    if (miniHall20.randomReserve()) break;
                    if (miniHall22.randomReserve()) break;
                    if (hall4D18.randomReserve()) break;
                    if (hall4D20.randomReserve()) break;
                    if (hall4D22.randomReserve()) break;
                } while (true);
            }
            if (choice == 5) {
                System.out.println("Приходите еще :) ");
                return;
            }

        } while (true);
    }
}