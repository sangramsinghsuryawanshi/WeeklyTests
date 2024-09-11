/*
 * 10. print the following pattern.
    1
   B C
  1   3
 D     E
1       5
 D     E
  1   3
   B C
    1

 */
package weeklyTest11.com;

import java.util.Scanner;

public class MixPattern {

	public static void isPat(int n)
	{
		int c=1;
		int ascii=66;
		for(int i=1;i<n;i++)
		{
			for(int k=n;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1 || j==i)
				{
					if(i%2!=0)
					{
						System.out.print(j+" ");
					}
					else
					{
						System.out.print((char)ascii+++" ");
					}
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		ascii=69;
		for(int i=n;i>=1;i--)
		{
			for(int k=i;k<=n;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1 || j==i)
				{
					if(i%2!=0)
					{
						System.out.print(j+" ");
					}
					else
					{
						System.out.print((char)ascii--+" ");
					}
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N number: ");
		int n = sc.nextInt();
		System.out.println("------------------------");
		MixPattern.isPat(n);
	}
}
