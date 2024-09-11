package weeklyTest12.com;

import java.util.Arrays;

public class Anagram 
{
	 public static void main(String[] args)
	   {
	        String[] str1 = {"cat", "dog", "tac", "god", "act"};
	        System.out.println("Given Array: --> " + Arrays.toString(str1));

	        for(int i = 0; i < str1.length; i++)
	        {
	            char[] ch = str1[i].toCharArray();
	            Arrays.sort(ch);
	            String temp = new String(ch);

	            for(int j = i + 1; j < str1.length; j++)
	            {
	                char[] ch1 = str1[j].toCharArray();
	                Arrays.sort(ch1);
	                String temp1 = new String(ch1);

	                if(temp.equals(temp1))
	                {
	                    String temp5 = str1[i + 1];
	                    str1[i + 1] = str1[j];
	                    str1[j] = temp5;
	                }
	            }
	        }
	        System.out.println(Arrays.toString(str1));
	    }
	}