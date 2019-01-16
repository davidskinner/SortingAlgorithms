package com.company;

public class Main {

    // A: unsorted array
    // B: return value of sorting algorithm
    // name: name of sorting algorithm
    public static void printSort(int[] A, int[] B, String name){
        System.out.print(name+"\nunsorted: ");

        for (int i: A)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("sorted: ");

        for (int aB : B)
        {
            System.out.print(aB + " ");
        }
    }

    //Best: 0(n)
    //Worst: omega(n^2)
    public static int[] bubbleSort(int[] A)
    {
        for (int i = 0; i < A.length-1; i++)
        {
            for (int j = A.length-1; j > 0; j--)
            {
                if(A[j] < A[j-1])
                {
                    //swap A[j] with A[j-1]
                    int temp = A[j];
                    A[j] = A[j-1];
                    A[j-1] = temp;
                }
            }
        }
        return A;
    }

    //Best: O(n log(n))
    //Worst: omega(n log(n))
    //better than insertion sort for large datasets
    public static int[] mergeSort(int[] A,int p,int q, int r) {

        int n1 = q - p;
        int n2 = r - q;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++)
        {
            left[i] = A[p + i];
        }

        for (int i = 0; i < n1; i++)
        {
            right[i] = A[q + i];
        }

        int i = 0;
        int j = 0;

        for (int k = p; k < r; k++)
        {
            if(left[i] <= right[j])
            {
                A[k] = left[i];
                i++;
            }
            else{
                A[k] = right[j];
                j++;
            }
            
        }

        return A;
    }

    //Best:  O(n)
    //Worst: omega(n^2)
    private static int[] insertionSort(int[] intArray){

        // i is the position of the current position being evaluated
        // j is the position of the (current position being evaluated - 1)
        for (int i = 1; i < intArray.length; i++)
        {
            int current = intArray[i];
            int j = i -1;

            //to make insertion sort non-increasing swap "intArray[j] > current" -> "intArray[j] < current"
            while(j >= 0 && intArray[j] > current)
            {
                // swap values for intArray[j + 1] and intArray[j]
                int temp = intArray[j];//
                intArray[j] = intArray[j +1];
                intArray[j + 1] = temp;

                //move to the left in the sorted array
                j--;
                intArray[j + 1] = current;
            }
        }
        return intArray;
    }

    public static void main(String[] args) {

        //arrays are reference types
        int[] A = new int[] {2,1,4,5,6,3,8,9};

//        printSort(A,insertionSort(B),"Insertion Sort");
//        printSort(B,mergeSort(B,0,B.length/2,B.length),"Merge Sort");
        printSort(A,bubbleSort(A),"Bubble Sort");
    }
}
