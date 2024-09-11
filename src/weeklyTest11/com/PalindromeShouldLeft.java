/*
 * 7. All the palindrome element should be in left side and Armstrong number should be in right side. 

int[] arr={153,121,131,11}
output: {121,131,11,153}

 */
package weeklyTest11.com;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeShouldLeft 
{
	static  int smax=0;
	int b[];
	public void isPal(int a[],int size)
	{
		
		b=new int[a.length];
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
				b[smax++]=a[i];
			}
		}
	}
	public int[] isArm(int a[],int size)
	{
		
		for(int i=0;i<size;i++)
		{
			int rem=0,rev=0;
			int tmp=a[i];
			while(tmp!=0)
			{
				rem=tmp%10;
				rev+=(rem*rem*rem);
				tmp=tmp/10;
			}
			if(rev==a[i])
			{
				this.b[this.smax++]=a[i];
			}
		}
	
		return this.b;
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
		PalindromeShouldLeft p = new PalindromeShouldLeft();
		p.isPal(a, size);
		int a1[]=p.isArm(a, size);
		System.out.println(Arrays.toString(a1));
	}
}
