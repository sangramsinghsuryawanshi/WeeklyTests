/*
 * Q2. Write a method that takes a sentence as input and returns the count of words in the sentence. 
 * Assume that words are separated by spaces. Use the Stream API to solve this problem.
 */
package weeklyTest15.com;

import java.util.Arrays;
import java.util.List;

public class CountOfWord {
	public static long isWordCount(List<String> li) {
		long count = li.stream().flatMap(s -> Arrays.stream(s.split(" "))).count();
		return count;
	}

	public static void main(String[] args) {
		List<String> li = Arrays.asList("java is simple language and java is robust language");
		System.out.println("Count Of Word: " + isWordCount(li));
	}

}
