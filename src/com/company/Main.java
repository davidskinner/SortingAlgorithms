package com.company;

public class Main {

    public static void mergeSort(int[] B) {


    }


    public static void insertionSortNonDecreasing(int[] B ){

        System.out.println("Insertion Sort");
        System.out.print("unsorted: ");

        for (int bB:
             B)
        {
            System.out.print(bB + " ");
        }
        System.out.println();

        // i is the position of the current position being evaluated
        // j is the position of the (current position being evaluated - 1)

        for (int i = 1; i < B.length; i++)
        {
            int key = B[i];

            // insert A[i] into the sorted sequence A[1..i - 1]
            int j = i -1;

            //to make insertion sort non-increasing swap "B[j] > key" -> "B[j] < key"
            while(j >= 0 && B[j] > key)
            {
                // swap values for B[j + 1] and B[j]
                int temp0 = B[j];
                B[j] = B[j +1];
                B[j +1] = temp0;

                j--;
                B[j + 1] = key;
            }
        }

        System.out.print("sorted: ");

        for (int aB : B)
        {
            System.out.print(aB + " ");
        }
    }

    public static void main(String[] args) {

        //Insertion Sort

        //swap the position of 2 numbers all the way to the correct position

        //integer array

        int A[] =  {2,1,4,5,6,3};

        insertionSortNonDecreasing(A);
//
//        if(A[1] < A[0])
//        {
//            int temp0 = A[0];
//            A[0] = A[1];
//            A[1] = temp0;
//        }
//
//        for (int j = 0; j < A.length; j++)
//        {
//            System.out.println(A[j]);
//        }
    }
}
