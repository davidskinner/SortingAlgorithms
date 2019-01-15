package com.company;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Insertion Sort

        //swap the position of 2 numbers all the way to the correct position

        //integer array

        int A[] =  {2,1};
        int current;

        for (int j = 1; j < A.length ; j++)
        {
            current = A[j];

            int i = j -1;

            while(current < A[i])
            {
                //swap current and A[i];
            }
        }

        for (int j = 0; j < A.length; j++)
        {
            System.out.println(A[j]);
        }

        if(A[1] < A[0])
        {
            int temp0 = A[0];
            A[0] = A[1];
            A[1] = temp0;
        }

        for (int j = 0; j < A.length; j++)
        {
            System.out.println(A[j]);
        }
    }
}
