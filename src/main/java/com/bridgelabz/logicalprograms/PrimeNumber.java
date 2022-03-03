package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {


    public int isPrime(int number){

        int count=0;
        for(int i=2; i<number/2; i++){
            if(number%i==0)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number to check If that number is prime Or not: ");
        int number=scanner.nextInt();
        PrimeNumber primeNumber=new PrimeNumber();
        int count=primeNumber.isPrime(number);
        if(count == 0)
        {
            System.out.println("The Number is Prime Number.");
        }else {
            System.out.println("The Number is not Prime Number.");
        }
    }
}
