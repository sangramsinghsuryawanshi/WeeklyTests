/*
 * Q4. Write a method that takes a list of integers as input and returns a pair 
 * of the maximum and minimum values in the list. Use the Stream API to solve this problem.
 */
package weeklyTest15.com;

import java.util.Arrays;
import java.util.List;

public class MaxAndMinInList {
	public static String isMaxAndMin(List<Integer> li) {
		int min=li.stream().mapToInt(Integer::intValue).min().orElse(0);
		int max=li.stream().mapToInt(Integer::intValue).max().orElse(0);
		return min+"<>-Min :: Max-<>"+max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("List Element: " + al);
		System.out.println("Max And Min is: "+isMaxAndMin(al));
	}

}
