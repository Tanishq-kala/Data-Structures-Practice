// Take 2 numbers as input and print the largest number.

package com.Tanishq;

import java.util.Scanner;
public class largest_number {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("ENTER THE FIRST NUMBER: ");
        long number1 = input.nextInt();
        System.out.println("ENTER THE SECOND NUMBER: ");
        long number2 = input.nextInt();

        if (number1>number2){
            System.out.println(number1+" is greater than "+number2);
        } else if (number1==number2){
            System.out.println(number2 + " and " + number1 + " are equal ");
        } else{
            System.out.println(number2+ " is greater than" +number1);
        }
    }
}
