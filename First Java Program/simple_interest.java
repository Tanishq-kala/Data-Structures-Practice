// Write a program to input principle, time and rate (P, T, R) from user and find Simple Interest.

package com.Tanishq;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class simple_interest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the principle amount: ");
        int Principle = input.nextInt();
        System.out.print("Please enter the rate of interest: ");
        int Rate = input.nextInt();
        System.out.print("Please enter the time: ");
        int Time = input.nextInt();

        System.out.println("The simple interest is " + (Principle*Rate*Time)/100);
        
    }


}

