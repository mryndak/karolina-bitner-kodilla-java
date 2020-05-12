package com.kodilla.testing.calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator score = new Calculator();
        int result = score.add(5, 3);

        if (result == 8) {
            System.out.println("Great work!! The add method works.\n");
        } else {
            System.out.println("Error!!");
        }

        int result2 = score.substract(6, 3);
        if (result2 == 3) {
            System.out.println("Great work again! The substract method works.");
        } else {
            System.out.println("Error!!");
        }
    }
}
