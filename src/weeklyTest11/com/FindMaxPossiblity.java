/*
 * 8. Given an array arr[] of size N, the task is to find the 
 * maximum possible sum of i*arr[i] when the array can be 
 * rotated any number of times.

  Examples :  

 Input: arr[] = {1, 20, 2, 10}
 Output: 72.We can get 72 by rotating array twice.
 {2, 10, 1, 20}
 20*3 + 1*2 + 10*1 + 2*0 = 72

 Input: arr[] = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9}
 Output: 330
 We can get 330 by rotating array 9 times.
 {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
 0*1 + 1*2 + 2*3 … 9*10 = 330

 */
package weeklyTest11.com;

import java.util.Scanner;

public class FindMaxPossiblity 
{
	public static int isMax(int a[],int size)
	{
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			max+=i*a[i];
			
		}
		return max;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter given element: ");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Output: "+isMax(a,size));
	}

}
