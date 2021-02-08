package studio.jose.org;

import java.util.Scanner;

/**
 * Project: Java
 * Date: 25/01/2021 @ 21:31
 * Class: CalculatorCode
 */
public class Main {
    public static void main(String[] args){
        //You write a two number and 1 operator to make a simple operation!
        int num1;
        int num2;
        char operator;
        double answer = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculator-Java");
        System.out.println("Send a number 1.");
        num1 = scanner.nextInt();
        System.out.println("Send a number 2.");
        num2 = scanner.nextInt();
        //if you need more number you can need copy this
        /**
         * System.out.println("Msg")
         * name_int = scanner.nexInt();
         */
        //And need create a other int with "int name"
        System.out.println("Send the operator(+,-,*,/).");
        operator = scanner.next().charAt(0);

        switch (operator) {
            case '+' -> answer = num1 + num2;
            case '-' -> answer = num1 - num2;
            case '*' -> answer = num1 * num2;
            case '/' -> answer = num1 / num2;
        }
        System.out.println(num1 + "" + operator + "" + num2 + "=" + answer);
        System.out.println("This is a example code to make a calculator.");
    }
}
