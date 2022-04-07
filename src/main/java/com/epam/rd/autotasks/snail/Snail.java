package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int h = scan.nextInt();
        int numberOfDays = 0;
        int toEnd = h;
        if (a > b){
            do {
            toEnd -= a;
            numberOfDays++;
            if (toEnd > 0) {
                toEnd += b;
            }
            } while (toEnd > 0);
            System.out.println(numberOfDays);
        } else if (h <= a) {
            System.out.println(1);
        } else {
            System.out.println("Impossible");
        }
    }
}
