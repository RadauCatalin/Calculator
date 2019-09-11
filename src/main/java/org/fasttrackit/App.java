package org.fasttrackit;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        calculator.unserName = scanner.nextLine();
        System.out.println("Hello " + calculator.unserName + ",please insert first number:");
        calculator.num1 = scanner.nextInt();
        System.out.println("Please insert the second number");
        calculator.num2 = scanner.nextInt();
        System.out.println("These are your results:");
        calculator.addition(calculator.num1, calculator.num2);
        System.out.println("Goodbye " + calculator.unserName);
    }
}
