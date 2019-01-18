package com.company;

public class Sort
{

	public static void print(String name, int[] unsortedArray, int[] sortedArray)
	{
		System.out.println(name);
		System.out.println(buildString(unsortedArray));
		System.out.println(buildString(sortedArray));
		System.out.println();
	}

	public static String buildString(int[] A)
	{
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < A.length; i++)
		{
			sb.append(String.valueOf(A[i]));
			sb.append(" ");
		}
		return sb.toString();
	}

	public int[] insertionSort(int[] A)
	{
		//copy array
		int[] tempArray = A.clone();

		String name = "Insertion Sort";

		// i is the current position being evaluated
		// j is the (current position being evaluated - 1)
		for (int i = 1; i < tempArray.length; i++)
		{
			int current = tempArray[i];
			int j = i - 1;

			//to make insertion sort non-increasing swap "array[j] > current" -> "array[j] < current"
			while (j >= 0 && tempArray[j] > current)
			{
				// swap values for array[j + 1] and array[j]
				int temp = tempArray[j];//
				tempArray[j] = tempArray[j + 1];
				tempArray[j + 1] = temp;

				//move to the left in the sorted array
				j--;
				tempArray[j + 1] = current;
			}
		}

		print(name,A,tempArray);
		return tempArray;
	}

	//Best: 0(n)
	//Worst: omega(n^2)
	public int[] bubbleSort(int[] A)
	{
		int[] tempArray = A.clone();
		String name = "Bubble Sort";

		for (int i = 0; i < tempArray.length-1; i++)
		{
			for (int j = tempArray.length-1; j > 0; j--)
			{
				if(tempArray[j] < tempArray[j-1])
				{
					//swap tempArray[j] with tempArray[j-1]
					int temp = tempArray[j];
					tempArray[j] = tempArray[j-1];
					tempArray[j-1] = temp;
				}
			}
		}
		print(name,A,tempArray);
		return tempArray;
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
}
