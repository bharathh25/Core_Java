package com.day15.bharath;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * // Task:
// 1. Sort a list of integers by the last digit (e.g., 27 -> 7)

List<Integer> numbers = Arrays.asList(27, 14, 35, 21, 18);

Comparator<Integer> sortByLastDigit = (a, b) -> (a % 10) - (b % 10);
Collections.sort(numbers, sortByLastDigit);
System.out.println(numbers);

 */
public class SortByCustomLogic {
	public static void main(String[] args) {
		

		List<Integer> numbers = Arrays.asList(27, 14, 35, 21, 18);

		Comparator<Integer> sortByLastDigit = (a, b) -> (a % 10) - (b % 10);
		Collections.sort(numbers, sortByLastDigit);
		System.out.println(numbers);

	}

}
