package com.sorting;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Suresh Sadanala
 *
 */
public class SortingTest {

	public static void main(String[] args) {

		System.err.println(bubbleSort(Arrays.<Integer>asList(7, 6, 9, 6, 2, 8)));
	}

	/**
	 * will sort the elements using Bubble sort technique
	 * @param sortingList
	 * @return
	 */
	private static List<Integer> bubbleSort(List<Integer> sortingList) {
		Integer temp;
		Integer reachesLoop = 0;
		while (reachesLoop <= sortingList.size()) {
			for (int i = 0; i < sortingList.size() - 1; i++) {
				if (sortingList.get(i) > sortingList.get(i + 1)) {
					temp = sortingList.get(i + 1);
					sortingList.set(i + 1, sortingList.get(i));
					sortingList.set(i, temp);
				}
			}
			reachesLoop++;
		}
		return sortingList;
	}

}
