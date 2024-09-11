/*
 * Q1. Write a method that takes a list of integers as input 
 * and returns the sum of all even numbers in the list. Use the Stream API to solve this problem.
 */
package weeklyTest15.com;

import java.util.Arrays;
import java.util.List;

public class SumOfAllEvenNumInList {
	public static int isEvenSum(List<Integer> al) {
		int a1 = al.stream().filter(a -> a % 2 == 0).mapToInt(Integer::intValue).sum();
		return a1;

	}

	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("List Element: " + al);
		System.out.println("Even sum: " + isEvenSum(al));
	}
}
