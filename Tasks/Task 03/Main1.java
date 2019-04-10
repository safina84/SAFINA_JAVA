package ru.itpark;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int multOfNumbers = 1;
        int currentNumber = scanner.nextInt();
        int position = 0;
        while (currentNumber != -1) {
            //    position++;
            //  System.out.println("Position number = " + position);
            int number = currentNumber;
            int digitsSum = 0;
            while (number != 0) {
                int currentDigit;
                currentDigit = number % 10;
                digitsSum = digitsSum + currentDigit;
                number = number / 10;
            }
            //System.out.println("digits sum = " + digitsSum);
            int candidate = digitsSum;
            if (candidate == 1) {
                // System.out.println("Not prime");
                multOfNumbers = 1;
                return;
            }
            //int multOfNumbers = 1;
            if (candidate == 2 || candidate == 3) {
                multOfNumbers = multOfNumbers * currentNumber;
            }
            for (int divider = 2; divider * divider <= candidate; divider++) {
                // System.out.println("For divider = " + divider);
                if (candidate % divider == 0) {
                    //System.out.println("Not prime");
                    multOfNumbers = multOfNumbers * 1;
                   return;
                }
                // System.out.println("Bad divider");
            
            // System.out.println("Prime");
            multOfNumbers = multOfNumbers * currentNumber;
        }
            currentNumber = scanner.nextInt();
        }
        System.out.println("Multiplication of numbers = " + multOfNumbers);
    }
}
