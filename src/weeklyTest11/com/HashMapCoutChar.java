/*
 * 3.Java program to count the occurrence of each character in a string using Hashmap

Given a string, the task is to write a program in Java which prints the number of occurrences of each character in a string.

Examples: 

Input: str = "GeeksForGeeks"
Output:
r 1
s 2
e 4
F 1
G 2
k 2
o 1

 */
package weeklyTest11.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapCoutChar 
{
	public static HashMap<Character, Integer> isCahr(String str)
	{
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++)
		{
			if(hm.containsKey(str.charAt(i)))
			{
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
			}
			else
			{
				hm.put(str.charAt(i), 1);
			}
		}
		return hm;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String str = sc.nextLine();
		System.out.println("-----------------------------");
		System.out.println("Character\tCount ");
		for(Map.Entry<Character, Integer> ent :isCahr(str).entrySet())
		{
			System.out.println(ent.getKey()+"\t\t"+ent.getValue());
		}
	}
}