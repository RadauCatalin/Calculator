package org.fasttrackit;

public class Calculator {
    String unserName;

    public int addition(int num1, int num2) {
        int addition = num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" + addition);
        return addition;
    }

    public int decreases(int num1, int num2) {
        int decreases = num1 - num2;
        System.out.println(num1 + "-" + num2 + "=" + decreases);
        return decreases;
    }

    public int multiplication(int num1, int num2) {
        int multiplication = num1 * num2;
        System.out.println(num1 + "*" + num2 + "=" + multiplication);
        return multiplication;
    }
}

