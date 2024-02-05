package pl.javastart.task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        boolean validNumber = false;
        while (!validNumber) {
            try {
                validNumber = true;
                System.out.println("Podaj liczbę");
                number = scanner.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Podaj liczbę całkowitą");
                scanner.nextLine();
                validNumber = false;
            }
            if (validNumber) {
                if (number < 100) {
                    System.out.println("Podana liczba jest za mała");
                    validNumber = false;
                } else if (number > 200) {
                    System.out.println("Podana liczba jest za duża");
                    validNumber = false;
                } else if (number % 3 != 0) {
                    System.out.println("Liczba nie jest podzielna przez 3");
                    validNumber = false;
                }
            }
        }
        System.out.println("Twoja liczba jest ok");
    }
}
