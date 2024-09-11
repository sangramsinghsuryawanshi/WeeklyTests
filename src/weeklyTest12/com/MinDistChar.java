/*
 * Q8. Maximum number of characters between any two same character
Given a string containing lower and uppercase alphabets, the task is to find the maximum
number of characters between any two same characters in the string.
Example 1:
Input:
S = "socks"
Output: 3
Explanation: There are 3 characters between
the two occurrences of 's'.


 */
package weeklyTest12.com;


public class MinDistChar 
{
	public static void isLen(String in)
	{
	
		for(int i=0;i<in.length();i++)
		{
			for(int j=i+1;j<in.length();j++)
			{
				if(in.charAt(i)==in.charAt(j))
				{
					int c=0;
					for(int k=i+1;k<j;k++)
					{
						c++;
					}
					System.out.println("Distance: "+in.charAt(i)+" is: "+c);
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		 String input = "socks";
		 isLen(input);
	}

}

