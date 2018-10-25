package com.nauka.Kamien_Papier_Nozyce_3;

import java.util.Random;
import java.util.Scanner;

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
                    options();
                    break;
                case 3:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nMenu: ");
        System.out.println("\t0 - Nowa gra przeciw komputerowi");
        System.out.println("\t1 - Nowa gra dla dwóch graczy");
        System.out.println("\t2 - Opcje");
        System.out.println("\t3 - Wyjście");
    }

    public static void options(){
        System.out.println("Opcje: ");
        }

    public static void gameVsComputer () {
        int resultDraw = 0;
        int resultUser = 0;
        int resultComputer = 0;
        System.out.println("\n");
        System.out.println("Nowa gra przeciw komputerowi!");

        System.out.println("\n");
        System.out.println("Do ilu zwycięstw będzie trwała gra? ");
        Scanner input = new Scanner(System.in);
        int finalResult = input.nextInt();

        while ((resultUser < finalResult) && (resultComputer < finalResult)) {
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

            Random random = new Random();
            int choiseComputer = random.nextInt(3) + 1;
            System.out.println("Komputer wybiera: ");
            if (choiseComputer == 1) {
                System.out.println("Kamien");
            } else if (choiseComputer == 2) {
                System.out.println("Papier");
            } else if (choiseComputer == 3) {
                System.out.println("Nozyce");
            }
            System.out.println("=========================================");
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
            System.out.println("\n");
        }
        System.out.println("Koniec gry");
        System.out.print("Wciśnij enter by przejść do menu");
        scanner.nextLine();
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
            System.out.println("Wybierz: kamien (wybierz 1), papier (wybierz 2), nozyce (wybierz 3) lub powrót do głownego menu (wybierz 4).");
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

            Random random = new Random();
            int choiseComputer = random.nextInt(3) + 1;
            System.out.println("Komputer wybiera: ");
            if (choiseComputer == 1) {
                System.out.println("Kamien");
            } else if (choiseComputer == 2) {
                System.out.println("Papier");
            } else if (choiseComputer == 3) {
                System.out.println("Nozyce");
            }
            System.out.println("=========================================");
            if (choiseFirstPlayer - choiseComputer == 0) {
                resultDraw += 1;
                System.out.println("Remis. Sprobuj ponownie");
                System.out.println("Stan gry: " + "Remisy = " + resultDraw + " Wygrane Gracza = " + resultFirstPlayer + " Wygrane Komputera = " + resultSecondPlayer);
            } else if (choiseFirstPlayer - choiseComputer == -2) {
                resultFirstPlayer += 1;
                System.out.println("Wygrales! Gratulacje!");
                System.out.println("Stan gry: " + "Remisy = " + resultDraw + " Wygrane Gracza = " + resultFirstPlayer + " Wygrane Komputera = " + resultSecondPlayer);
            } else if (choiseFirstPlayer - choiseComputer == 1) {
                resultFirstPlayer += 1;
                System.out.println("Wygrales! Gratulacje!");
                System.out.println("Stan gry: " + "Remisy = " + resultDraw + " Wygrane Gracza = " + resultFirstPlayer + " Wygrane Komputera = " + resultSecondPlayer);
            } else {
                resultSecondPlayer += 1;
                System.out.println("Niestety, przegrales! Moze nastepnym razem sie uda!");
                System.out.println("Stan gry: " + "Remisy = " + resultDraw + " Wygrane Gracza = " + resultFirstPlayer + " Wygrane Komputera = " + resultSecondPlayer);
            }
            System.out.println("\n");
            System.out.println("\n");
        }
        System.out.println("Koniec gry");
        System.out.print("Wciśnij enter by przejść do menu");
        scanner.nextLine();
        menu();
    }
}
