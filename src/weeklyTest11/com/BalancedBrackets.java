/*
 * 2.Check for Balanced Brackets in an expression (well-formedness)

Given an expression string exp, write a program to examine whether the pairs and the orders of “{“, “}”, “(“, “)”, “[“, “]” are correct in the given expression.

Example: 

Input: exp = “[()]{}{[()()]()}” 
Output: Balanced
Explanation: all the brackets are well-formed

Input: exp = “[(])” 
Output: Not Balanced 
Explanation: 1 and 4 brackets are not balanced because 
there is a closing ‘]’ before the closing ‘(‘

 */
package weeklyTest11.com;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets 
{
	
	public static boolean isBal1(String str)
	{
		Stack s = new Stack();
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[')
			{
				s.push(str.charAt(i));
			}
			else
			{
				if(s.isEmpty())
				{
					return false;
				}
				else
				{
					char top=(char) s.pop();
					if((str.charAt(i)==')' && top!='(') || (str.charAt(i)=='}' 
							&& top!='{') || (str.charAt(i)==']' && top!='[') )
					{
						return false;
					}
				}
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String str = sc.nextLine();
		if(isBal1(str))
		{
			System.out.println("Not Balanced");
		}
		else
		{
			System.out.println("Balanced");
		}
	}
}
