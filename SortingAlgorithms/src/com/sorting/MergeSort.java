package com.sorting;

import java.util.Arrays;

/**
 * @author Suresh Sadanala
 *
 */
public class MergeSort {
	static int array[] = new int[] { 10, 30, 67, 12, 32, 68, 12, 24, 9 };

	public static void main(String[] args) {
		System.err.println("Original Array is " + Arrays.toString(array));
		sort(0, array.length - 1);
		System.err.println("Sorted Array is " + Arrays.toString(array));

	}

	/**
	 * to divide the elements until reaches to one element
	 * 
	 * @param low
	 * @param high
	 */
	private static void sort(int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			sort(low, mid);
			sort(mid + 1, high);
			merge(low, mid, high);
		}
	}

	/**
	 * merge to form sorted array
	 * 
	 * @param start
	 * @param mid
	 * @param end
	 */
	private static void merge(int start, int mid, int end) {

		int temp[] = new int[end-start+1];

		// crawlers for both intervals and for temp
		int i = start, j = mid + 1, k = 0;

		/**
		 * traverse both left and right arrays and in each iteration add smaller of both
		 * elements in temp
		 */
		while (i <= mid && j <= end) {
			if (array[i] <= array[j]) {
				temp[k] = array[i];
				k += 1;
				i += 1;
			} else {
				temp[k] = array[j];
				k += 1;
				j += 1;
			}
		}

		// copy left over elements from left array to temp array
		while (i <= mid) {
			temp[k] = array[i];
			k += 1;
			i += 1;
		}

		// copy left over elements from right array to temp array
		while (j <= end) {
			temp[k] = array[j];
			k += 1;
			j += 1;
		}

		// copy temp to original array
		for (i = start; i <= end; i += 1) {
			array[i] = temp[i-start];
		}
	}
}
