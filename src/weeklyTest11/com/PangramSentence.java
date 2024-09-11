/*
 * 6. Write a program to check if a given string is a pangram 
 * or not. A pangram is a sentence that contains every letter of the alphabet at least once.
 */
package weeklyTest11.com;

import java.util.Scanner;
import java.util.Stack;

public class PangramSentence 
{
	public static String isPan(String str)
	{
		String sp[]=str.split(" ");
		int c=0;
		for(int i=0;i<sp.length;i++)
		{
			for(int j=0;j<sp[i].length();j++)
			{
				for(int k=j+1;k<sp[i].length();k++)
				{
					if(sp[i].charAt(j)==sp[i].charAt(k))
					{
						c=1;
						break;
					}
				}
			}
		}
		if(c==1)
		{
			return "Given is not pangram";
		}
		else
		{
			return "Given is pangram";
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String str = sc.nextLine();
		System.out.println("-----------------------");
		System.out.println(PangramSentence.isPan(str));
	}
}
