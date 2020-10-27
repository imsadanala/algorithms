package com.sorting;

import java.util.Arrays;

/**
 * 
 * @author Suresh Sadanala
 *
 */
public class QuickSort {
	static int array[] = { 10, 30, 67, 12, 32, 68, 12, 24, 9 };

	public static void main(String[] args) {
		sort(0, array.length - 1);
		System.err.println(Arrays.toString(array));

	}
	
	/**
	 * 1. Quick sort is "in-place" algorithm
	 * 2. is a divide and conquer algorithm
	 * 3. tim complexity is O(nlog^n)
	 * 4. Data is grouped into 2 parts: one set of elements that are lower order than
	 * pivot element and other set of elements that are higher than the pivot
	 * element and sort the elements recursively
	 * 
	 * @param low
	 * @param high
	 */
	static void sort(int low, int high) {
		int pivot;
		if (low >= high) {
			return;
		}
		if (array == null || array.length == 0) {
			return;
		}
		pivot = partition(low, high);
		partition(low, pivot - 1);
		partition(pivot + 1, high);
	}

	/**
	 * select pivot element, generally will be middle element but not necessary here
	 * 
	 * @param low
	 * @param high
	 * @return
	 */
	static int partition(int low, int high) {
		// pivot can start, mid or end of the array elements
		int pivot = array[(high + low) / 2];
		while (low <= high) {
			while (array[low] < pivot) {
				low++;
			}
			while (array[high] > pivot) {
				high--;
			}
			if (low <= high) {
				// to swap elements
				array[low] = array[high] + array[low] - (array[high] = array[low]);
				low++;
				high--;
			}
		}
		return low;
	}

}
