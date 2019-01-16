package com.company;


public class InsertionSort extends Sort
{
	int[] array = null;
	String sortedArrayString = null;
	String unsortedArrayString;
	String name = "Insertion Sort";

	InsertionSort(int[] intArray)
	{
		this.array = new int[intArray.length];

		for (int i = 0; i < intArray.length; i++)
		{
			this.array[i] = intArray[i];
		}
		unsortedArrayString = buildString(intArray);

		sort();
	}

	//Best:  O(n)
	//Worst: omega(n^2)
	@Override
	public int[] sort()
	{
		// i is the current position being evaluated
		// j is the (current position being evaluated - 1)
		for (int i = 1; i < array.length; i++)
		{
			int current = array[i];
			int j = i - 1;

			//to make insertion sort non-increasing swap "array[j] > current" -> "array[j] < current"
			while (j >= 0 && array[j] > current)
			{
				// swap values for array[j + 1] and array[j]
				int temp = array[j];//
				array[j] = array[j + 1];
				array[j + 1] = temp;

				//move to the left in the sorted array
				j--;
				array[j + 1] = current;
			}
		}
		this.sortedArrayString = super.buildString(array);
		super.print(name,unsortedArrayString, sortedArrayString);
		return array;
	}
}
