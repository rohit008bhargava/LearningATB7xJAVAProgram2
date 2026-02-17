package ex_20072024;

import java.util.Scanner;

public class Lab103 {
    public static void main(String[] args) {
        // Program to check
        // If a number is positive
        // , Negative,
        // or Zero.


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number!");
        int num = sc.nextInt();

        if (num > 0){
            System.out.println("Positive number");
        } else if (num < 0) {
            System.out.println("Negative number");

        } else
            System.out.println("Zero");
    }
}
