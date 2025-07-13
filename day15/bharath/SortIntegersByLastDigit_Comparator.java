package com.day15.bharath;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortIntegersByLastDigit_Comparator {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(27, 14, 35, 21, 18);

        // Sort by last digit
        Collections.sort(numbers, (a, b) -> (a % 10) - (b % 10));

        System.out.println(numbers);
    }
}

