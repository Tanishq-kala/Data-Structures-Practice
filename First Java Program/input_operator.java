// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

package com.Tanishq;

import java.util.Scanner;
public class input_operator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("ENTER THE FIRST NUMBER");
        long a = input.nextInt();
        System.out.println("ENTER THE SECOND NUMBER");
        long b = input.nextInt();
        System.out.println(" TO ADD THE NUMBERS ENTER 1, \n TO SUBTRACT FIRST NUMBER FROM SECOND ENTER 2, \n TO SUBTRACT SECOND NUMBER FROM FIRST ENTER 3, \n TO MULTIPLY THE TWO NUMBERS ENTER 4, \n TO DIVIDE FIRST NUMBER FROM SECOND ENTER 5, \n TO DIVIDE SECOND NUMBER FROM FIRST ENTER 6 ");
        int operator = input.nextInt();

        if (operator==1){
            System.out.println(a+b);
        } else if(operator==2){
            System.out.println(b-a);
        } else if (operator==3){
            System.out.println(a-b);
        } else if (operator==4){
            System.out.println(a*b);
        }else if (operator==5){
            System.out.println(a/b);
        }else if (operator==6){
            System.out.println(b/a);
        }
    }
}
