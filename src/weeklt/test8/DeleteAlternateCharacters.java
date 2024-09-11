/*
 * Q1.Delete alternate characters.
 Input: S = "Geeks"
 Output: "Ges"
 Explanation: Deleted "e" at index 1
 and "k" at index 3.

 */
package weeklt.test8;

import java.util.Scanner;

public class DeleteAlternateCharacters 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		StringBuffer s = new StringBuffer(sc.nextLine());
		for(int i=0;i<s.length();i++)
		{
			if(i==1)
			{
				s.deleteCharAt(i);
			}
			else if(i==2)
			{
				s.deleteCharAt(i);
				
			}
		}
		System.out.println("Given string is: "+s);
	}

}
