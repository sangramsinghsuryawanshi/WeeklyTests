/*
 * Q1.Given an array of integers of size n. Convert the array in such 
 * a way that if next valid number is same as current number, 
 * double its value and replace the next number with 0. 
 * After the modification, rearrange the array such that all 0’s
 *  are shifted to the end.

Input : arr[] = {2, 2, 0, 4, 0, 8}
Output : 4 4 8 0 0 0

Input : arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8}
Output : 4 2 12 8 0 0 0 0 0 0

 */
package weekly.test10;

import java.util.Scanner;

public class QuestionOne 
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
		System.out.print("\nGiven element is: ");
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		for (int i=0;i<size-1;i++) 
		{
            if (a[i]!=0 && a[i]==a[i+1]) 
            {
                a[i]=a[i]*2;
                a[i+1]=0;
                i++;
            }
        }
       
        int count=0;
        for (int i=0;i<size;i++) 
        {
            if (a[i]!=0) 
            {
                a[count++]=a[i];
            }
        }
        
        while(count<size) 
        {
            a[count++]=0;
        }
        
        System.out.print("\nModified array is: ");
        for (int i=0; i<size;i++) 
        {
            System.out.print(a[i]+" ");
        }
	}
}
