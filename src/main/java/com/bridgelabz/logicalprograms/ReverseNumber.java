package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class ReverseNumber {

    public static int getReverseNumber(int number) {

        int remainder, rev = 0;
        while (number != 0) {

            remainder = number % 10;
            rev = rev * 10 + remainder;
            number = number / 10;
        }
        return rev;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number that you want to reverse: ");
        int number = scanner.nextInt();
        System.out.println("Orignal Number: " + number);
        ReverseNumber reverseNumber = new ReverseNumber();
        int revNum = getReverseNumber(number);

        System.out.println("Reverse Number: " + revNum);


    }
}
