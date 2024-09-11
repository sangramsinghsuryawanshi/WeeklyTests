/*
 * Q3. Write a program to remove duplicates from a LinkedList.
 */
package weekly.test10;

import java.util.LinkedList;
import java.util.Scanner;

public class QuestionThree {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> l = new LinkedList<Integer>();
		System.out.println("Enter size: ");
		int s=sc.nextInt();
		System.out.println("Enter element: ");
		for(int i=0;i<s;i++)
		{
			l.add(sc.nextInt());
		}
		for(int i=0;i<l.size();i++)
		{
			for(int j=i+1;j<l.size();j++)
			{
				if(l.get(i).equals(l.get(j)))
				{
					l.remove(i);
				}
			}
		}
		System.out.println("Given element is: "+l);
		
	}

}
