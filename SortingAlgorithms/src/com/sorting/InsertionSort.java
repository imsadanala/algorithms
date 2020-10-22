package com.sorting;

import java.util.Arrays;
import java.util.List;

/**
 * @author Suresh Sadanala
 *
 */
public class InsertionSort {

	public static void main(String[] args) {
		System.err.println(sort(Arrays.<Integer>asList(10, 30, 67, 12, 32, 68, 12, 24, 9)));
	}

	/**
	 * will sort the elements using insertion sort technique Time Complexity is
	 * O(n^2)
	 * 
	 * @param sortingList
	 * @return
	 */
	private static List<Integer> sort(List<Integer> sortingList) {
		Integer key, j, temp = 0;
		for (int i = 1; i < sortingList.size(); i++) {
			key = sortingList.get(i);
			j = i - 1;
			while (j >= 0 && key < sortingList.get(j)) {
				temp = sortingList.get(j);
				sortingList.set(j, sortingList.get(j + 1));
				sortingList.set(j + 1, temp);
				j--;
			}
		}
		return sortingList;
	}

}
