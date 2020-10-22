
package com.sorting;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Suresh Sadanala
 *
 */
@SuppressWarnings("unused")
public class BubbleSort {

	public static void main(String[] args) {
		System.err.println(sort(Arrays.<Integer>asList(10, 30, 67, 12, 32, 68, 12, 24, 9)));
	}

	/**
	 * will sort the elements using Bubble sort technique Time Complexity is O(n^2)
	 * push max/min element to end of the list based on your sorting type
	 * 
	 * @param sortingList
	 * @return
	 */
	private static List<Integer> sort(List<Integer> sortingList) {
		Integer temp;
		Integer pointer = 0;
		while (pointer < sortingList.size()) {
			for (int i = 0; i < sortingList.size() - 1; i++) {
				if (sortingList.get(i) > sortingList.get(i + 1)) {
					temp = sortingList.get(i + 1);
					sortingList.set(i + 1, sortingList.get(i));
					sortingList.set(i, temp);
				}
			}
			pointer++;
		}
		return sortingList;
	}
}
