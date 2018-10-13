package infoshare10_10_2018;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {

        // ZADANIE 1

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj dowolna liczbe ");

        double numberFromKeyboard = scanner.nextInt();

        double a = (double) numberFromKeyboard;

        System.out.println("Podales: " + a );


        // DODATKOWE

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbe ");

        String FromKeyboard = scanner.nextLine();

        Long b = Long.parseLong(FromKeyboard);

        System.out.println("Podales: " + b );



        // ZADANIE 2


        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swoj wiek: ");

        int age = scanner.nextInt();

        if(age >= 18) {
            System.out.println("Jestes pelnoletni.");
        } else {
            System.out.println("Nie jestes pelnoletni.");
        }


        // ZADANIE DODATKOWE


        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swoj wiek: ");

        int age = scanner.nextInt();

        if(age < 0 || age > 123) {
            System.out.println("BLAD !!");
        } else if (age >= 18) {
            System.out.println("Jestes pelnoletni.");
        } else {
            System.out.println("Nie jestes pelnoletni.");
        }



        // ZADANIE 3

        Scanner scanner = new Scanner(System.in);
        String login = "login1";
        String haslo = "haslo2";

        System.out.print("Podaj login: " );

        String wpisanylogin = scanner.nextLine();

        if(wpisanylogin.equals(login)) {
            System.out.println("OK!");
        } else {
            System.out.println("Bledny login");
        }

        System.out.print("Podaj haslo: ");

        String wpisanehaslo = scanner.nextLine();

        if(wpisanehaslo.equals(haslo)){
            System.out.print("Zalogowanie powiodlo się! ");
        } else {
            System.out.println("Bledne haslo");
        }


        // ZADANIE DODATKOWE bez gwiazdek

        Scanner scanner = new Scanner(System.in);
        String loginadmin = "admin";
        String hasloadmin = "haslo1";

        String loginuser = "user";
        String haslouser = "haslo2";

        System.out.print("Podaj login: " );

        String wpisanylogin = scanner.nextLine();

        if(wpisanylogin.equals(loginadmin)  ) {
            System.out.print("Podaj hasło: ");
            String wpisanehaslo = scanner.nextLine();
            if (wpisanehaslo.equals(hasloadmin)) {
                System.out.print("Zalogowales sie jako admin! ");
            } else {
                System.out.println("Bledne haslo");
            }
        }
            else if (wpisanylogin.equals(loginuser))
            System.out.print("Podaj hasło: ");
            String wpisanehaslo = scanner.nextLine();
             if (wpisanehaslo.equals(haslouser)) {
            System.out.print("Zalogowales sie jako user! ");
             } else {
            System.out.println("Bledne haslo");
        }


            }  //
 }



