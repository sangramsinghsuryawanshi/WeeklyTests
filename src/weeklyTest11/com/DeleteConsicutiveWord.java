/*
 * 1. Delete consecutive same words in a sequence

Input : ab aa aa bcd ab
Output : 3
As aa, aa destroys each other so, 
ab bcd ab is the new sequence.

Input :  tom jerry jerry tom
Output : 0

As first both jerry will destroy each other.
Then sequence will be tom, tom they will also destroy
each other. So, the final sequence doesn’t contain any
word.

 */
package weeklyTest11.com;

import java.util.Scanner;
import java.util.Stack;

public class DeleteConsicutiveWord 
{
	public static int isLength(String str)
	{
		String st[]=str.split(" ");
		Stack s = new Stack();
		s.add(st[0]);
		for(int i=1;i<st.length;i++)
		{
			if(s.peek().equals(st[i]))
			{
				s.pop();
			}
			else
			{
				s.push(st[i]);
			}
		}
		return s.size();
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String str = sc.nextLine();
		System.out.println("Given length is: "+DeleteConsicutiveWord.isLength(str));
	}
}
