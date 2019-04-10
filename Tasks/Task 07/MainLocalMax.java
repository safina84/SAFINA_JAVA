package ru.itpark;

public class MainLocalMax {
    public static void main(String[] args) {
        int array[] = {5,1,2,5,3,6,7};
      //  int LocalMax=0;
        int localMaxAmount=0;
        for (int i = 1; i < array.length-1 ; i++) {
            if (array[i] > array[i - 1]){
                if (array[i] > array[i + 1]) {
                   // LocalMax = array[i];
                    //System.out.println("Local maximum = " + LocalMax);
                    localMaxAmount++;
                }
            }
                    }

        System.out.println("Local maximum's amount = "+localMaxAmount);
            }
            }

