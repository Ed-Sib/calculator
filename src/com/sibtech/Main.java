package com.sibtech;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    double num1 = 6;
	    double num2 = 8;
	    String sign = "/";
	    String[] allowedSigns = {"+","-","*","/"};

        //System.out.print("Enter the first number: ");
        //num1 = scanner.nextDouble();
        //System.out.print("Enter the operator sign: ");
        //sign = scanner.next();
        //System.out.print("Enter the second number: ");
        //num2 = scanner.nextDouble();

        System.out.println("The equation is: " + num1 + " " + sign + " " + num2);

        if (Arrays.asList(allowedSigns).contains(sign)) {
            double answer = 0;
            switch (sign) {
                case "+":
                    answer = num1 + num2;
                    break;
                case "-":
                    answer = num1 - num2;
                    break;
                case "*":
                    answer = num1 * num2;
                    break;
                case "/":
                    answer = num1 / num2;
                    break;
            }
            System.out.println("The answer is: " + answer);
        } else {
            System.out.println("Invalid sign");
        }
    }
}
