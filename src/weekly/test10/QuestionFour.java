/*
 * Q4. Write a program to check if a LinkedList is a palindrome.
 */
package weekly.test10;
import java.util.LinkedList;
import java.util.Scanner;
public class QuestionFour 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> l = new LinkedList<Integer>();
		System.out.println("Enter size: ");
		int s=sc.nextInt();
		System.out.println("Enter element: ");
		for(int i=0;i<s;i++)
		{
			l.add(sc.nextInt());
		}
		int f=0;
		int b=l.size()-1;
		boolean t =true;
		while(f<b)
		{
			if(!l.get(f).equals(l.get(b)))
			{
				t=false;
				break;
			}
			f++;
			b--;
		}
		if(t)
		{
			System.out.println("Given element is palindrome");
		}
		else
		{
			System.out.println("Given element is not palindrome");
		}
	}
}
