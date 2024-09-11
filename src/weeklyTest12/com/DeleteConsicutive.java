/*
 * 5. Delete consecutive same words in a sequence

Input : ab aa aa bcd ab
Output : 3
As aa, aa destroys each other so, 
ab bcd ab is the new sequence.

Input :  tom jerry jerry tom
Output : 0

 */
package weeklyTest12.com;

import java.util.Stack;

public class DeleteConsicutive 
{
	public static int isDel(String in)
	{
		String s[]=in.split(" ");
		Stack<String> s1 = new Stack<String>();
		for (String s2 : s) 
		{
			if(!s1.isEmpty() && s1.peek().equals(s2))
			{
				s1.pop();
			}
			else
			{
				s1.push(s2);
			}
		}
		
		return s1.size();
	}
	public static void main(String[] args) 
	{
		 String input = "ab aa aa bcd ab";
		 System.out.println("given lentgh is: "+isDel(input));
		 
		 String input1 = "tom jerry jerry tom";
		 System.out.println("given lentgh is: "+isDel(input1));
	}

}

