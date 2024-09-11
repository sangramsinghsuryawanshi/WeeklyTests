/*
 * Q5. Write a method that takes a list of Student objects as input, where each Student has a 
 * name and a grade. The method should return a map where the keys are the distinct grades 
 * and the values are lists of students who have that grade. Use the Stream API to solve this problem.

 */
package weeklyTest15.com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
	private String name;
	private String grade;

	public String getName() {
		return name;
	}

	public String getGrade() {
		return grade;
	}

	public Student(String name, String grade) {
		super();
		this.name = name;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + "]";
	}

}

public class DistinctGradeAndValueReturnInMap {
	public static Map<String, List<Student>> isReturn(List<Student> li){
		return li.stream().collect(Collectors.groupingBy(Student::getGrade));
		
	}

	public static void main(String[] args) {
		List<Student> ls = Arrays.asList(
		new Student("sangram", "A"), 
		new Student("Harshad", "B"),
		new Student("Omkar", "B"),
		new Student("Aditya", "A"));
		System.out.println(""+isReturn(ls));
	}

}
