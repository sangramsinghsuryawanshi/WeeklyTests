/*
 *  Input: S = "Hello"
 Output: Svool
 Explanation: 'H' is the 8th letter from the
 beginning of alphabets, which is replaced by
 'S' which comes at 8th position in reverse order
 of alphabets. Similarly, all other letters are
 replaced by their respective upper or lower case
 letters accordingly.

 */
package weeklt.test8;

import java.util.Scanner;

public class FrontBackString 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string : ");
		String s = sc.nextLine();
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(Character.toLowerCase((char)(((int)'Z')-((int)
					(Character.toUpperCase(ch[i]))-65))));
		}
	}
}
