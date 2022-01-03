// Write a program to print whether a number is even or odd, also take input.

package com.Tanishq;

import java.util.Scanner;
public class even_or_odd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER: ");
        int number = input.nextInt();

        if (number%2==0){
            System.out.println(number + " is a even number");
        } else if (number==0){
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

    }
}
