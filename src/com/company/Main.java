package com.company;

import java.util.Random;

public class Main {

    //Best: 0(n)
    //Worst: omega(n^2)
    public static int[] bubbleSort(int[] intArray)
    {
        for (int i = 0; i < intArray.length-1; i++)
        {
            for (int j = intArray.length-1; j > 0; j--)
            {
                if(intArray[j] < intArray[j-1])
                {
                    //swap intArray[j] with intArray[j-1]
                    int temp = intArray[j];
                    intArray[j] = intArray[j-1];
                    intArray[j-1] = temp;
                }
            }
        }
        return intArray;
    }

    //Best: O(n log(n))
    //Worst: omega(n log(n))
    //better than insertion sort for large datasets
    public static int[] mergeSort(int[] intArray,int p,int q, int r) {

        int n1 = q - p;
        int n2 = r - q;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++)
        {
            left[i] = intArray[p + i];
        }

        for (int i = 0; i < n1; i++)
        {
            right[i] = intArray[q + i];
        }

        int i = 0;
        int j = 0;

//        for (int k = p; k < r; k++)
//        {
//            if(left[i] <= right[j])
//            {
//                intArray[k] = left[i];
//                i++;
//            }
//            else{
//                intArray[k] = right[j];
//                j++;
//            }
//        }
        return intArray;
    }



    public static void main(String[] args) {

        int[] A = new int[] {2,1,4,5,6,3,8,9};

        InsertionSort insertionSort = new InsertionSort(A);
    }
}
