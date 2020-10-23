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
		int mid;
		if (low < high) {
			mid = (low + high) / 2;
			sort(low, mid);
			sort(mid + 1, high);
			merge(low, mid, high);
		}
	}

	/**
	 * merge to form sorted array
	 * 
	 * @param low
	 * @param mid
	 * @param high
	 */
	private static void merge(int low, int mid, int high) {

		int temp[] = new int[high - low + 1];

		// crawlers for both intervals and for temp
		int i = low, j = mid + 1, k = 0;

		/**
		 * traverse both left and right arrays and in each iteration add smaller of both
		 * elements in temp
		 */
		while (i <= mid && j <= high) {
			if (array[i] <= array[j]) {
				temp[k] = array[i];
				i++;
			} else {
				temp[k] = array[j];
				j++;
			}
			k++;
		}

		// copy left over elements from left array to temp array
		while (i <= mid) {
			temp[k] = array[i];
			k += 1;
			i += 1;
		}

		// copy left over elements from right array to temp array
		while (j <= high) {
			temp[k] = array[j];
			k += 1;
			j += 1;
		}

		// copy temp to original array
		for (i = 0; i < temp.length; i += 1) {
			array[low] = temp[i];
			low++;
		}
	}
}
