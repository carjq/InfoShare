package pl.infoshare;


//


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

import java.util.Scanner;

public class App
{
    public static <Print> void main(String[] args ) throws IOException {

        //ZAD 1
//
//        int[] array = new int[6];
//
//        array[0] =5;
//        array[1] =7;
//        array[2] =0;
//        array[3] =3;
//        array[4] =5;
//        array[5] =6;
//
//        System.out.println("Elementy: "+ array[0] + " " + array[2] + " " + array[4]);
//
//                System.out.println(array[6]);


              //  ZAD 2
//
//        int[] array = new int[10];
//        array[0] = 1;
//        array[1] = 2;
//        array[2] = 3;
//        array[3] = 4;
//        array[4] = 5;
//        array[5] = 6;
//        array[6] = 7;
//        array[7] = 8;
//        array[8] = 9;
//        array[9] = 10;

//        System.out.println(;
//
//        for(int i =1 ; i < 1001 ; i++){
//            System.out.println( i );
//        }
//
//        int i = 1;
//        while ( i < 1001 ){
//            System.out.println( i );
//            i++;
 //zad

//        int[] array = new int[11];
//        Random random = new Random();
//        int randomInt - random.nextInt ( 100) +1;
//
//
//        for(int i = 0; i < array.length ; i++){
//            array[i] = random.nextInt (100) + 1;
//
//        }
//        for(int i = 0; i < array.length; i++) {
//            if(i) % 2 != 0); System.out.println(array[i]);
//
//        }

       //  ZADANIE 2


// char [][] array2D = new char [10][10];
//
// for (int i = 0; i < array2D.length; i ++) {
//      for (int j = 0; j < array2D.length; j++) {
//
//          array2D[i][j] = '*';
//
//      }
// }
//    for(int i = 0 ; i < array2D.length ; i++){
//        for (int j = 0 ; j < array2D.length ; j++){
//            if(i % 2 == 0) System.out.print(array2D[i][j]);
//            else System.out.print(" ");
//        }
//        System.out.println();
////    }
//
// // ZADANIE 3
//        int winningNumber = new Random().nextInt(10) +1;
//
//
//                Scanner scanner = new Scanner(System.in);
//        while(true) {
//            System.out.println("Podaj liczbe od 1 do 10: "");
//
//        }
//
//        int[] array = new int[10];
// 22.10.2018

//        Path path = Paths.get("./pliktestowy.txt");
//        Files.createFile(path);


        //wczytywanie pliku
//
//        List<String> lines = Files.readAllLines(Paths.get("./pliktestowy.txt"));
//
//
//        for (String lineInFile:
//        lines) {
//            System.out.println(lineInFile);
//        }
//
//
//        Files.copy(
//                Paths.get("./pliktestowy.txt");
//                Paths.get("home/karolina/Desktop/kopia.txt");


        // ZAD 1
//
//        String[] array = {"Zenek", "Karolina", "Asia", "Grazyna", "Janusz"};
//
//        System.out.println(array);
//
//        for (String name:
//             array) {
//            System.out.println(name);
//        }
//
//        PrintWriter write = new PrintWriter("./pliktestowy.txt");
//        write.print(array);
//
//        for (String name: array ) {
//            write.print(name + "\n");
//        }

        //ZAD 2

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Podaj imie i nazwisko: ");
//
//        String fullname = scanner.nextLine();
//
//        System.out.println("Podales: " + fullname);
//
//
//        PrintWriter write = new PrintWriter("./ZAD2.txt");
//
//        write.print(fullname);
//
//        write.close();


        // ZAD 3

//        int[] los1 = new int[100];
//        int[] los2 = new int[100];
//
//        Random random = new Random();
//
//
//        PrintWriter pwLos1= new PrintWriter("./ZAD3_1.txt");
//        PrintWriter pwLos2= new PrintWriter("./ZAD3_2.txt");
//
//        for(int i =0; i < 100 ; i++) {
//            pwLos1.append((random.nextInt(100)+1 ) + "\n" );
//            pwLos2.append((random.nextInt(100)+1 ) + "\n" );
//
//        }
//
//
//        pwLos1.close();
//        pwLos2.close();
//
//        List<String> listLos1 = Files.readAllLines(Paths.get("./ZAD3_1.txt"));
//        List<String> listLos2 = Files.readAllLines(Paths.get("./ZAD3_2.txt"));
//
//        int hits = 0;
//
//        for(String elementLos1 : listLos1){
//            for(String elementLos2 : listLos2){
//                if(Integer.parseInt(elementLos1) == Integer.parseInt(elementLos2)){
//                    hits++;
//                }
//            }
//        }
//        System.out.println("Tych samych liczb jest:  " + hits);

            //ZAD 4

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj teskt: ");

        String text = scanner.nextLine();

        PrintWriter text = new PrintWriter("./ZAD4.txt");

        String = text;

        for(String text : ){
            for(String elementLos2 : listLos2){
                if(Integer.parseInt(elementLos1) == Integer.parseInt(elementLos2)){
                    text--;
                }


    }
}
