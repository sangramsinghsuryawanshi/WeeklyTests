/*
 * Q 3. Given a sorted array with possibly duplicate elements. 
 * The task is to find indexes of first and last occurrences of an element X in the given array.

Note: If the element is not present in the array return {-1,-1} as pair.

Example 1:

Input:
N = 9
v[] = {1, 3, 5, 5, 5, 5, 67, 123, 125}
X = 5
Output:
2 5
Explanation:
Index of first occurrence of 5 is 2
and index of last occurrence of 5 is 5.


 */
package weeklt.test8;

import java.util.Scanner;

public class FindFirstAndLastOccurenceOfArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		int firstIndex=-1;
		int lastIndex=-1,x=5;
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==x)
				{
					if(firstIndex==-1)
					{
						firstIndex=i;
					}
					lastIndex=i;
				}
			}
		}
		System.out.println("First index is: "+firstIndex);
		System.out.println("last index is: "+lastIndex);
	}
}
