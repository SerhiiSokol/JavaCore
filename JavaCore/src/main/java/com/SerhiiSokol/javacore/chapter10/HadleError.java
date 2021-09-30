package main.java.com.SerhiiSokol.javacore.chapter10;

import java.util.Random;

public class HadleError {
    public static void main(String[] args) {
        int a, b, c;
        Random r = new Random();

        for (int i = 0; i < 32000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                System.out.println("Деление на нуль.");
                a = 0;
            }
            System.out.println("a:" + a);
        }
    }
}
