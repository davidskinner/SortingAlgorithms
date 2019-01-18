package com.company;

import java.util.Random;

public class Main {
        public static void main(String[] args) {

        int[] A = new int[] {1,3,2,4,2,3,4,1,5,5};
        Sort sort = new Sort();

        sort.insertionSort(A);
        sort.bubbleSort(A);
        sort.mergeSort(A);
    }
}
