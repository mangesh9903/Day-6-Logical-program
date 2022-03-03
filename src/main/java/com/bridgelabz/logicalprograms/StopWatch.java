package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class StopWatch {

    public long startTimer=0;
    public long endTimer=0;
    public long elapsed;

    public void start() {
        startTimer=System.currentTimeMillis();
        System.out.println("Starting timing is : "+startTimer);
    }

    public void stop(){
        endTimer=System.currentTimeMillis();
        System.out.println("Stoping timing is : "+endTimer);
    }

    public long getElapsedTime(){
        elapsed=endTimer-startTimer;
             return elapsed;
          }
    public static void main(String[] args) {

        StopWatch stopWatch=new StopWatch();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to Start the Time: ");
        sc.nextInt();
        stopWatch.start();
        System.out.println();
        System.out.println("Enter 2 to Stop the Time: ");
        sc.nextInt();
        stopWatch.stop();
        System.out.println();

        long elapsedTime=stopWatch.getElapsedTime();
        System.out.println("Total Time  Elasped in Milliseconds:  "+elapsedTime+" milliseconds");
        System.out.println();
        long sec=elapsedTime/1000;
        System.out.println("Total Time Elasped in Seconds :  "+sec+" sec");
        System.out.println();
        float min=(float)sec/60;
        System.out.println("Total Time Elasped in Minutes :  "+min+" min");


    }
}
