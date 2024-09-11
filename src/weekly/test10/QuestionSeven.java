/*
 * Q7. Check if two given Strings are Isomorphic to each other

Input:  str1 = “aab”, str2 = “xxy”
Output: True
Explanation: ‘a’ is mapped to ‘x’ and ‘b’ is mapped to ‘y’.

 */
package weekly.test10;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionSeven 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
        String s = sc.next();
        System.out.println("Enter a string: ");
        String s1 = sc.next();
        char ch[]=s.toCharArray();
        char ch1[]=s1.toCharArray();
        int c[]=new int[2];
        int c1[]=new int[2];
        int x=0,y=0;
        for(int i=0;i<ch.length;i++)
        {
        	int cnt=1;
        	for(int j=i+1;j<ch.length;j++)
        	{
        		if(ch[i]==ch[j])
        		{
        			cnt++;
        			ch[j]='\0';
        		}
        	}
        	if(ch[i]!='\0')
        	{
        		c[x++]=cnt;
        	}
        }
        for(int i=0;i<ch1.length;i++)
        {
        	int cnt=1;
        	for(int j=i+1;j<ch1.length;j++)
        	{
        		if(ch1[i]==ch1[j])
        		{
        			cnt++;
        			ch1[j]='\0';
        		}
        	}
        	if(ch1[i]!='\0')
        	{
        		c1[y++]=cnt;
        	}
        }
        int t=0;
        for(int i=0;i<2;i++)
        {
        	for(int j=0;j<2;j++)
        	{
        		if(c[i]==c1[j])
        		{
        			t++;
        		}
        	}
        }
        if(t>0)
        {
        	System.out.println("True");
        }
        else
        {
        	System.out.println("False");
        }
	}
}
