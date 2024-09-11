/*
 * 4.  Take a sentance as a String input, and find anagrams in the string.
   for eg "peek up the call and keep the roses "
           anagram strings : peek keep
 */
package weeklyTest11.com;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString 
{
	public static boolean isAnagram(String str,String str1)
	{
		char ch[]=str.toCharArray();
		char ch1[]=str1.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		if(str.equals(str1))
		{
			return false;
		}
		  return Arrays.equals(ch, ch1);
	}
	public static void findAnagrams(String sentence) 
	{
        String[] words=sentence.split(" ");
        
        for(int i =0;i<words.length;i++) 
        {
            for(int j=i+1;j<words.length; j++) 
            {
                if(isAnagram(words[i],words[j])) 
                {
                    System.out.println(words[i] +" "+words[j]);
                }
            }
        }
    }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String 1: ");
		String str = sc.nextLine();
		System.out.println("Given anagram pair is: ");
		findAnagrams(str);
	}
}