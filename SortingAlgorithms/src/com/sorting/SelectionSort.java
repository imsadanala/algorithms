package com.sorting;

import java.util.Arrays;
import java.util.List;

/**
 * @author Suresh Sadanala
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		System.err.println(sort(Arrays.<Integer>asList(10, 30, 67, 12, 32, 68, 12, 24, 9)));
	}

	/**
	 * will sort the elements using Selection sort technique Time Complexity is
	 * O(n^2) min element will be pushed to start of the array, if sorting type is
	 * ASC
	 * 
	 * @param sortingList
	 * @return
	 */
	private static List<Integer> sort(List<Integer> sortingList) {
		Integer minValIndex = 0;
		Integer temp = 0;
		for (int i = 0; i < sortingList.size(); i++) {
			minValIndex = i;
			for (int j = i + 1; j < sortingList.size(); j++) {
				if (sortingList.get(j) < sortingList.get(minValIndex)) {
					minValIndex = j;
				}
			}
			temp = sortingList.get(minValIndex);
			sortingList.set(minValIndex, sortingList.get(i));
			sortingList.set(i, temp);
		}
		return sortingList;
	}

}
