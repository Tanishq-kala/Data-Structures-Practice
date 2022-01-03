// Take name as input and print a greeting message for that name.

package com.Tanishq;

import java.util.Scanner;
public class greeting_message {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR NAME- ");
        String name = input.nextLine();

        System.out.println("Dear " + name + ", you are amazing.");
    }

}
