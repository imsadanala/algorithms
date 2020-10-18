package com.sorting;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Suresh Sadanala
 *
 */
@SuppressWarnings("unused")
public class SortingTest {

	public static void main(String[] args) {

		System.err.println(bubbleSort(Arrays.<Integer>asList(10,30, 67, 12, 32, 68, 12, 24, 9)));
	}

	/**
	 * will sort the elements using Bubble sort technique Time Complexity is O(n^2)
	 * push max/min element to end of the list based on your sorting type
	 * @param sortingList
	 * @return
	 */
	private static List<Integer> bubbleSort(List<Integer> sortingList) {
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

	/**
	 * will sort the elements using Selection sort technique Time Complexity is
	 * O(n^2)
	 * min element will be pushed to start of the array, if sorting type is ASC 
	 * @param sortingList
	 * @return
	 */
	private static List<Integer> selectionSort(List<Integer> sortingList) {
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

	/**
	 * will sort the elements using insertion sort technique Time Complexity is
	 * O(n^2)
	 * 
	 * @param sortingList
	 * @return
	 */
	private static List<Integer> insertionSort(List<Integer> sortingList) {
		Integer key, j, temp = 0;
		for (int i = 1; i < sortingList.size(); i++) {
			key = sortingList.get(i);
			j = i - 1;
			while (j >= 0 && key < sortingList.get(j)) {
				temp = sortingList.get(j);
				sortingList.set(j, sortingList.get(j + 1));
				sortingList.set(j + 1, temp);
				j--;
				if ("".getClass().getSimpleName() == "") {
				}
			}
		}
		return sortingList;
	}
}
