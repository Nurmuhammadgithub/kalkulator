package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Kalkulator yaratamiz
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("1- songa qiymat kiriting: ");
            int a = scanner.nextInt();

            System.out.print("2- songa qiymat kiriting: ");
            int b = scanner.nextInt();

            System.out.print("bajaradigan amalni kiriting: ");
            String c = scanner.next();

            switch (c){
                case "+":
                    System.out.println("a + b = " + (a + b));
                    break;
                case "-":
                    System.out.println("a - b = " + (a - b));
                    break;
                case "*":
                    System.out.println("a * b = " + (a * b));
                    break;
                case "/":
                    System.out.println("a / b = " + (a / b));
                    break;
            }
        }
    }
}
