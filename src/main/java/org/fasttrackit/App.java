package org.fasttrackit;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addition(15,23);
        calculator.decreases(8,5);
        calculator.multiplication(15,21);

        calculator.addition(1.5, 3.17);
        calculator.decrease(9.58,4.76);
        calculator.multiplication(1.25, 1.78);

        calculator.addition(1.76,5);
        calculator.decrease(5.88,2);
        calculator.multiplication(3.68,4);

        calculator.addition(123,65.76);
        calculator.decrease(85,35.275);
        calculator.multiplication(13,15.55);

    }
}