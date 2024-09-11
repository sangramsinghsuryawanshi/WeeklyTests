/*
 * Q9.
 WAP to remove and return the max sum palindrome element from array
int[] arr={11,121,33,909}
output: 909
Explanation: sum of 909=18 that is the max sum palindrome in array

 */
package weekly.test10;

import java.util.Scanner;

public class QuestionNine 
{
	public int isMax(int a[],int size)
	{
		int s=0,max=0,smax=0;
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
				int temp=rev;
				int r=temp%10;
				s+=r;
				if(s>max && a[i]>smax)
				{
					max=s;
					smax=a[i];
				}
			}
		}
		return smax;
	}
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
		QuestionNine q = new QuestionNine();
		int m=q.isMax(a,size);
		System.out.println("removed and return the max sum palindrome element from array: "+m);
	}
}
