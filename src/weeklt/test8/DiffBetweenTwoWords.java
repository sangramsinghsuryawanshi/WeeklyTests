/*
 * Q5. Find the minimum distance between the given two words

Input: S = { “the”, “quick”, “brown”, “fox”, “quick”}, word1 = “the”, word2 = “fox”
Output: 3
Explanation: Minimum distance between the words “the” and “fox” is 3

Input: S = {“geeks”, “for”, “geeks”, “contribute”,  “practice”}, word1 = “geeks”, word2 = “practice”
Output: 2
Explanation: Minimum distance between the words “geeks” and “practice” is 2

 */
package weeklt.test8;

import java.util.Scanner;

public class DiffBetweenTwoWords 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s[] = {"the", "quick", "brown", "fox", "quick"};
		String s1="the";
		String s2="fox";
		int cnt=0,c=0,c1=0;
		for(int i=0;i<s.length;i++)
		{
			if(s[i].equals(s1))
			{
				cnt=i;
			}
			else if(s[i].equals(s2)) 
			{
				c=i;
			}
		}
		for(int i=cnt;i<c;i++)
		{
			c1++;
		}
		System.out.println("Minimum distance is:"+c1);
	}
}
