package psyh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

//    static String ;
    static String star = "*";
    static String space = " ";
    static int number;

    public static void main(String[] args) throws IOException, NumberFormatException{
        request();
        nextMeasurement();
        rhombusDrawer(number);
        System.out.println("\nGood job! Wish you great rhombuses!!!");
    }

    public static void request () throws IOException, NumberFormatException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome, Rhombushunter! Here you can find your best rhombus. \n" +
                "For true rhombusmaking we need, as you know, not even side of rhombus area. \n" +
                "So, input any odd number, please:");
        number = Integer.parseInt(br.readLine());

        while (number % 2 == 0){
            System.out.println("May be you don't understand, junior Rhombushunter." +
                    " It can be ODD number only. Try again:");
            number = Integer.parseInt(br.readLine());
        }
        br.close();
    }

    public static void rhombusDrawer(int size){
        int y = size/2;
        int x = size-2*y;

        while (x<size) {
            stringPrinter(x, y);
            y--;
            x+=2;
        }
        while (x>0) {
            stringPrinter(x, y);
            y++;
            x-=2;
        }
    }

    public static void stringPrinter(int x, int y){
        yPartOfStringWriter(y);
        for (int s = x; s > 0 ; s--) {
            System.out.print(star);
        }
        yPartOfStringWriter(y);
        System.out.println();
    }

    public static String nextMeasurement(){
        return "Trust me! This String had made here specially for you.";
        //Level up programming. You are the 3 billion first device, that rules by java (;
    }

    public static void yPartOfStringWriter(int y){
        for (int p = y; p > 0; p--) {
            System.out.print(space);
        }
    }
}