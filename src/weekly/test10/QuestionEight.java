/*
 * Q8.Wap to remove the 2nd palindrome element from array

int[] arr={11,30,33,12,121}
output: {11,30,12,121}

 */
package weekly.test10;

import java.util.Scanner;
public class QuestionEight 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter given element: ");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("removed the 2nd palindrome element from array: ");
		for(int i=0;i<size;i++)
		{
			int rem=0,rev=0;
			int tmp=a[i];
			while(tmp!=0)
			{
				rem=tmp%10;
				rev=(rev*10)+rem;
				tmp=tmp/10;
			}
			if(rev==a[i])
			{
				if(i==2)
				{
					continue;
				}
				System.out.print(a[i]+" ");
			}
		}
	}
}
