package ru.itpark;

import java.util.Scanner;

public class MainMinMax {
    public static void main(String[] args) {
        //  Scanner scanner=new Scanner(System.in);
        int array[] = {9,10,11,14,15,17,4};
        int maxIndex = array[0];
        int minIndex =array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxIndex) {
                maxIndex = array[i];
            }
            if (array[i] < minIndex) {
                                minIndex = array[i];
            }
        }
        System.out.println("Maximum = " + maxIndex);
        System.out.println("Minimum =" + minIndex);
    }

}