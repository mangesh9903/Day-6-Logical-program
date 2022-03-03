package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {

    public  int isPerfectNumber(int number) {

        int sum = 1;
        System.out.print("Addition of Factors is  " + sum + " ");
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
                System.out.print(i + " ");

            }

        }
        System.out.print(" = " + sum);
        return sum;
    }

    public static void main(String[] args) {

        PerfectNumber perNum=new PerfectNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check is that Perfect Number or Not : ");
        int number = scanner.nextInt();
        System.out.println("Orignal Number: " + number);
        int temp = number;
        int sum = perNum.isPerfectNumber(number);
        System.out.println();
        if (temp == sum) {
            System.out.println(" The Number is Perfect Number");
        } else {
            System.out.println(" The Number is not Perfect Number");
        }

    }
}
