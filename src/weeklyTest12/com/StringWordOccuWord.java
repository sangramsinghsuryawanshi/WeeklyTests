/*
 * Q6. Calculate the frequency of each word in the given string using HashMap.
 */
package weeklyTest12.com;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class StringWordOccuWord 
{
	public static HashMap<String, Integer> isWord(String s)
	{
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			if(hm.containsKey(s1[i]))
			{
				hm.put(s1[i], hm.get(s1[i])+1);
			}
			else
			{
				hm.put(s1[i], 1);
			}
		}
		return hm;
	}
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String str = sc.nextLine();
		System.out.println("----------------------------");
		System.out.println("key\tvalue");
		for(Entry<String, Integer> ent: isWord(str).entrySet())
		{
			System.out.println(ent.getValue()+"\t"+ent.getKey());
		}
	}

}
