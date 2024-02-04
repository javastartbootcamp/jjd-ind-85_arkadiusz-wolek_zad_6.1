package pl.javastart.task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        boolean vaildNumber;
        while (number < 100 || number > 200 || number % 3 != 0) {
            try {
                vaildNumber = true;
                System.out.println("Podaj liczbę");
                number = scanner.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Podaj liczbę całkowitą");
                scanner.nextLine();
                vaildNumber = false;
            }
            if (vaildNumber) {
                if (number < 100) {
                    System.out.println("Podana liczba jest za mała");
                } else if (number > 200) {
                    System.out.println("Podana liczba jest za duża");
                } else if (number % 3 != 0) {
                    System.out.println("Liczba nie jest podzielna przez 3");
                }
            }
        }
        System.out.println("Twoja liczba jest ok");
    }
}
