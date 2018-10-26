package com.nauka.Kamien_Papier_Nozyce_3;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Kamien_Papier_Nozyce_3 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean quit = false;
        int choice = 0;
        while (!quit) {
            System.out.println("=========================================");
            System.out.println("Witaj w grze \"Kamien, papier, nożyce\".");
            System.out.println("=========================================");
            dontMove();

            printInstructions();
            System.out.println("Wybierz: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    gameVsComputer();
                    break;
                case 1:
                    gameForTwoPlayers();
                    break;
                case 2:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nMenu: ");
        System.out.println("\t0 - Nowa gra przeciw komputerowi");
        System.out.println("\t1 - Nowa gra dla dwóch graczy");
        System.out.println("\t2 - Wyjście");
    }

    public static void dontMove() {
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void gameVsComputer () {
        int resultDraw = 0;
        int resultUser = 0;
        int resultComputer = 0;
        System.out.println("\n");
        System.out.println("Nowa gra przeciw komputerowi!");
        dontMove();

        System.out.println("\n");
        System.out.println("Do ilu zwycięstw będzie trwała gra? ");
        Scanner input = new Scanner(System.in);
        int finalResult = input.nextInt();

        while ((resultUser < finalResult) && (resultComputer < finalResult)) {
            System.out.println("\n");
            System.out.println("Wybierz: kamien (wybierz 1), papier (wybierz 2), nozyce (wybierz 3) lub powrót do głownego menu (wybierz 4).");
            int choiseUser = input.nextInt();
            if (choiseUser == 1) {
                System.out.println("Kamien");
            } else if (choiseUser == 2) {
                System.out.println("Papier");
            } else if (choiseUser == 3) {
                System.out.println("Nożyce");
            } else if (choiseUser == 4){
                menu();
            }

            dontMove();
            Random random = new Random();
            int choiseComputer = random.nextInt(3) + 1;
            System.out.println("Komputer wybiera: ");
            dontMove();
            if (choiseComputer == 1) {
                System.out.println("Kamien");
            } else if (choiseComputer == 2) {
                System.out.println("Papier");
            } else if (choiseComputer == 3) {
                System.out.println("Nozyce");
            }
            System.out.println("\n");
            System.out.println("=========================================");
            dontMove();
            System.out.println("\n");

            if (choiseUser - choiseComputer == 0) {
                resultDraw += 1;
                System.out.println("Remis. Sprobuj ponownie");
                System.out.println("Stan gry: " + "Remisy = " + resultDraw + " Wygrane Gracza = " + resultUser + " Wygrane Komputera = " + resultComputer);
            } else if (choiseUser - choiseComputer == -2) {
                resultUser += 1;
                System.out.println("Wygrales! Gratulacje!");
                System.out.println("Stan gry: " + "Remisy = " + resultDraw + " Wygrane Gracza = " + resultUser + " Wygrane Komputera = " + resultComputer);
            } else if (choiseUser - choiseComputer == 1) {
                resultUser += 1;
                System.out.println("Wygrales! Gratulacje!");
                System.out.println("Stan gry: " + "Remisy = " + resultDraw + " Wygrane Gracza = " + resultUser + " Wygrane Komputera = " + resultComputer);
            } else {
                resultComputer += 1;
                System.out.println("Niestety, przegrales! Moze nastepnym razem sie uda!");
                System.out.println("Stan gry: " + "Remisy = " + resultDraw + " Wygrane Gracza = " + resultUser + " Wygrane Komputera = " + resultComputer);
            }
            System.out.println("\n");

        }
        dontMove();
        System.out.println("Koniec gry");
        dontMove();
        System.out.print("Wciśnij enter by przejść do menu");
        scanner.nextLine();
        System.out.println("\n");
        menu();
    }
    public static void gameForTwoPlayers(){
        System.out.println("\n");
        System.out.println("Gra dla dwóch graczy!");
        int resultDraw = 0;
        int resultFirstPlayer = 0;
        int resultSecondPlayer = 0;

        System.out.println("\n");
        System.out.println("Podaj imię pierwszego gracza: ");
        Scanner input = new Scanner(System.in);
        String nameFirstPlayer = input.next();

        System.out.println("\n");
        System.out.println("Podaj imię drugiego gracza: ");
        String nameSecondPlayer = input.next();

        System.out.println("\n");
        System.out.println("Do ilu zwycięstw będzie trwała gra? ");
        int finalResult = input.nextInt();

        while ((resultFirstPlayer < finalResult) && (resultSecondPlayer < finalResult)) {
            System.out.println("\n");
            System.out.println(nameFirstPlayer +" Wybierz: kamien (wybierz 1), papier (wybierz 2), nozyce (wybierz 3) lub powrót do głownego menu (wybierz 4).");
            int choiseFirstPlayer = input.nextInt();
            if (choiseFirstPlayer == 1) {
                System.out.println("Kamien");
            } else if (choiseFirstPlayer == 2) {
                System.out.println("Papier");
            } else if (choiseFirstPlayer == 3) {
                System.out.println("Nozyce");
            } else if (choiseFirstPlayer == 4){
                menu();
            }
            System.out.println("\n");
            System.out.println(nameSecondPlayer +" Wybierz: kamien (wybierz 1), papier (wybierz 2), nozyce (wybierz 3) lub powrót do głownego menu (wybierz 4).");
            int choiseSecondPlayer = input.nextInt();
            if (choiseSecondPlayer == 1) {
                System.out.println("Kamien");
            } else if (choiseSecondPlayer == 2) {
                System.out.println("Papier");
            } else if (choiseSecondPlayer == 3) {
                System.out.println("Nozyce");
            } else if (choiseSecondPlayer == 4){
                menu();
            }
            dontMove();
            System.out.println("\n");
            System.out.println("=========================================");
            System.out.println("\n");
            dontMove();
            if (choiseFirstPlayer - choiseSecondPlayer == 0) {
                resultDraw += 1;
                System.out.println("Remis. Sprobuj ponownie");
                System.out.println("Stan gry: " + " Remisy = " + resultDraw + " Wygrane " + nameFirstPlayer + "= " + resultFirstPlayer + " Wygrane " + nameSecondPlayer + " = " + resultSecondPlayer);
            } else if (choiseFirstPlayer - choiseSecondPlayer == -2) {
                resultFirstPlayer += 1;
                System.out.println(nameFirstPlayer + " Wygrales! Gratulacje!");
                System.out.println(nameSecondPlayer +" Niestety, przegrales! Moze nastepnym razem sie uda!");
                System.out.println("Stan gry: " + " Remisy = " + resultDraw + " Wygrane " + nameFirstPlayer + "= " + resultFirstPlayer + " Wygrane " + nameSecondPlayer + " = " + resultSecondPlayer);
            } else if (choiseFirstPlayer - choiseSecondPlayer == 1) {
                resultFirstPlayer += 1;
                System.out.println(nameFirstPlayer + " Wygrales! Gratulacje!");
                System.out.println(nameSecondPlayer +" Niestety, przegrales! Moze nastepnym razem sie uda!");
                System.out.println("Stan gry: " + " Remisy = " + resultDraw + " Wygrane " + nameFirstPlayer + "= " + resultFirstPlayer + " Wygrane " + nameSecondPlayer + " = " + resultSecondPlayer);
            } else {
                resultSecondPlayer += 1;
                System.out.println(nameSecondPlayer + " Wygrales! Gratulacje!");
                System.out.println(nameFirstPlayer + " Niestety, przegrales! Moze nastepnym razem sie uda!");
                System.out.println("Stan gry: " + " Remisy = " + resultDraw + " Wygrane " + nameFirstPlayer + "= " + resultFirstPlayer + " Wygrane " + nameSecondPlayer + " = " + resultSecondPlayer);
            }
            System.out.println("\n");

        }
        System.out.println("Koniec gry");
        System.out.print("Wciśnij enter by przejść do menu");
        scanner.nextLine();
        System.out.println("\n");
        menu();
    }
}
