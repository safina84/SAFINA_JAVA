package ru.itpark;


public class MainSort {
    public static void main(String[] args) {
        int array[] = {4,2,6,5,8,9};
        int minIndex = array[0];
        for (int i = 0; i < array.length; i++) {
            int iMin;
            if (array[i] < minIndex) {
                minIndex = array[i];
                iMin = i;
                array[iMin] = array[0];
            }
            array[0] = minIndex;
        }

        System.out.println("a [" + 0 + "] =" + array[0]);
        int minIndex1 = array[1];
        for (int a = 1; a < array.length; a++) {
            int aMin;
            if (array[a] < minIndex1) {
                minIndex1 = array[a];
                aMin = a;
                array[aMin] = array[1];
            }
            array[1] = minIndex1;
        }

        System.out.println("a [" + 1 + "] =" + array[1]);
        int minIndex2 = array[2];
        for (int b = 2; b < array.length; b++) {
            int bMin;
            if (array[b] < minIndex2) {
                minIndex2 = array[b];
                bMin = b;
                array[bMin] = array[2];
            }
            array[2] = minIndex2;
        }

        System.out.println("a [" + 2 + "] =" + array[2]);
        int minIndex3 = array[3];
        for (int c = 3; c < array.length; c++) {
            int cMin;
            if (array[c] < minIndex3) {
                minIndex3 = array[c];
                cMin = c;
                array[cMin] = array[3];
            }
            array[3] = minIndex3;
        }

        System.out.println("a [" + 3 + "] =" + array[3]);
        int minIndex4 = array[4];
        for (int d = 4; d < array.length; d++) {
            int dMin;
            if (array[d] < minIndex4) {
                minIndex4 = array[d];
                dMin = d;
                array[dMin] = array[4];
            }
            array[4] = minIndex4;
        }

        System.out.println("a [" + 4 + "] =" + array[4]);
        int minIndex5 = array[5];
        int eMin;
        for (int e = 5; e < array.length; e++) {
            if (array[e] < minIndex5) {
                minIndex5 = array[e];
                eMin = e;
                array[eMin] = array[5];
            }
            array[5] = minIndex5;
        }
                System.out.println("a [" + 5 + "] =" + array[5]);
        System.out.println("a [" + 6 + "] =" + array[6]);
    }
}
