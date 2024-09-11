/*
 * Q10. Find largest word in dictionary
Example 1:
Input: d = {"ale", "apple", "monkey", "plea"}
S = "abpcplea"

Output: "apple"
Explanation: After deleting "b", "c"
"a" S became "apple" which is present
in d.


 */
package weekly.test10;

import java.util.Scanner;

public class QuestionTen 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String d[] = {"ale", "apple", "monkey", "plea"};
		System.out.println("Enter given string: ");
		String s=sc.next();
		int max=0;
		String main=null;
		for(int i=0;i<d.length;i++)
		{
			char ch[]=d[i].toCharArray();
			char ch1[]=d[i].toCharArray();
			int cnt=0;
			for(int m=0;m<ch.length;m++)
			{
				for(int j=0;j<s.length();j++)
				{
					if(ch[m]==s.charAt(j))
					{
						cnt++;
						break;
					}
				}
				//System.out.print(cnt);
				if(cnt>max)
				{
					max=cnt;
					//System.out.println(max);
					main = new String(ch1);
				}
			}
		}
		System.out.println(main);
	}
}
