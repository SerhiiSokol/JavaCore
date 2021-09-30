package main.java.com.SerhiiSokol.javacore.chapter10;

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42 / a;
        } catch (Exception e) {
            System.out.println("Перехват исключений общего класса Exception.");
        }//catch (ArithmeticException e) {
//          System.out.println("Этот код вообще недостижим.");
//        }
    }
}
