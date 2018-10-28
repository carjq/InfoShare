package infoshare15_10_2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws IOException {


        URL url = new URL("https://www.w3.org/TR/PNG/iso_8859-1.txt");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(url.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();


        PrintWriter numbers = new PrintWriter("ZAD5_1.txt");
        PrintWriter letters = new PrintWriter("ZAD5_2.txt");


        Scanner scanner = new Scanner(url.openStream());
        String line;



        while (scanner.hasNextLine()) {
            line = scanner.nextLine();


            if (Character.isDigit(line.charAt(0))) {
                numbers.println(numbers);


            } else {
                letters.println(letters);

            }

        }

        letters.close();
        numbers.close();
    }
}















