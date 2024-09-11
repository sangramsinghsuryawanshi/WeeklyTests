/*
 * 2.

Find the minimum distance between the given two words

Input: S = { “the”, “quick”, “brown”, “fox”, “quick”}, word1 = “the”, word2 = “fox”
Output: 3
Explanation: Minimum distance between the words “the” and “fox” is 3

Input: S = {“geeks”, “for”, “geeks”, “contribute”,  “practice”}, word1 = “geeks”, word2 = “practice”
Output: 2
Explanation: Minimum distance between the words “geeks” and “practice” is 2

 */
package weeklyTest12.com;

public class MinimumDistance 
{
	public static int isMin(String[]s,String w1,String w2)
	{
		int c=-1,c1=-1;
		for(int i=0;i<s.length;i++)
		{
			if(s[i].equals(w1))
			{
				c=i;
			}
			else if(s[i].equals(w2))
			{
				c1=i;
			}
		}
		return c1-c;
	}
	public static void main(String[] args) 
	{
		 String[] S = { "geeks", "for", "geeks", "contribute", "practice" };
		 String w1 = "geeks";
	     String w2 = "practice";
	     System.out.println("Given minimum distance is: "+isMin(S, w1, w2));
	}

}
