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

        // j is the position of the current position being evaluated
        // i is the position of the (current position being evaluated - 1)

        for (int j = 1; j < B.length; j++)
        {
            int key = B[j];

            // insert A[j] into the sorted sequence A[1..j - 1]
            int i = j -1;

            //to make insertion sort non-increasing swap "B[i] > key" -> "B[i] < key"
            while(i >= 0 && B[i] > key)
            {
                // swap values for B[i + 1] + B[i]
                int temp0 = B[i];
                B[i] = B[i +1];
                B[i +1] = temp0;

                i--;
                B[i + 1] = key;
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
