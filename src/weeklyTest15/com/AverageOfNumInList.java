/*
 * Q3. Write a method that takes a list of doubles as input and 
 * returns the average of the numbers in the list. Use the Stream API to solve this problem.
 */
package weeklyTest15.com;

import java.util.Arrays;
import java.util.List;

public class AverageOfNumInList {
	public static double isAvg(List<Double> li) {
		double average = li.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
		return average;
	}

	public static void main(String[] args) {
		List<Double> li = Arrays.asList(1.2, 33.44, 56.5, 67.5);
		System.out.println("Average of list element: " + isAvg(li));
	}
}
