/*
 * Q5. Write a program to convert a Vector to an ArrayList.
 */
package weekly.test10;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class QuestionFive {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Vector<Integer> v1 = new Vector<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int s=sc.nextInt();
		System.out.println("Enter element: ");
		for(int i=0;i<s;i++)
		{
			v1.add(sc.nextInt());
		}
		System.out.println("Vector element: "+v1);
		ArrayList<Integer> a1 = new ArrayList<Integer>(v1);
		System.out.println("Vector To ArrayList: "+a1);
	}

}
