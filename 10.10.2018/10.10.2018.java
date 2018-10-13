package pl.infoshare;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {


         /*
            ZADANIE 1
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj dowolna liczbe: ");

        String ageFromKeyboard = scanner.nextLine();

        System.out.println("Podales: " + ageFromKeyboard);
    }


}
