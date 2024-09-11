/*
 * Q6. Write a program to shuffle a given ArrayList Without using method.
 */
package weekly.test10;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class QuestionsSix 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int s=sc.nextInt();
		System.out.println("Enter element: ");
		for(int i=0;i<s;i++)
		{
			a1.add(sc.nextInt());
		}
		Random r = new Random();
		for(int i=a1.size()- 1;i>=0;i--)
		{
			int ind = r.nextInt(i+1);
			int t=a1.get(i);
			a1.set(i, a1.get(ind));
			a1.set(ind, t);
		}
		System.out.println("Shffule element: "+a1);
	}

}
