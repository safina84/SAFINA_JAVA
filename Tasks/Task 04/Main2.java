package ru.itpark;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfNumbers = 0;
        int numbers;
        int position = 0;
        while (position != 999) {
            position++;
            numbers = scanner.nextInt();
        sumOfNumbers = sumOfNumbers + numbers;}
        if (sumOfNumbers != 500500) {
            int missedNumber = 500500 - sumOfNumbers;
            System.out.println("Missed number = " + missedNumber);
        }
    }
}

