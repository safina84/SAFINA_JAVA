package ru.itpark;

import java.util.Scanner;

public class MainArrayOut {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println();
        int n = a.length;
        int temp;
        for (int i = 0; i < n / 2; i++) {
            temp = a[n - i - 1];
            a[n - i - 1] = a[i];
            a[i] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}