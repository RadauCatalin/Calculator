package org.fasttrackit;

public class Calculator {
    String unserName;
    int num1;
    int num2;

    public int addition(int num1, int num2) {
        int addition = num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" + addition);
        int decreases = num1 - num2;
        System.out.println(num1 + "-" + num2 + "=" + decreases);
        int multiplication = num1 * num2;
        System.out.println(num1 + "*" + num2 + "=" + multiplication);
        return addition;
    }
}
