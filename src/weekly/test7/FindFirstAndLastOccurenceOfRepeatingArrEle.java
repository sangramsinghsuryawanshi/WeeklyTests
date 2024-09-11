/*
 *  
Q 3. Given a sorted array with possibly duplicate elements. The task is to find indexes of first and last occurrences of an element X in the given array.

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
package weekly.test7;

import java.util.Scanner;

public class FindFirstAndLastOccurenceOfRepeatingArrEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		int x=-1,y=-1,g=5;
		System.out.println("Enter given array: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==g) {
					if(x==-1) {
						x=i;
					}
					y=i;
				}
			}
		}
		System.out.println("First occurrence-->"+x+" Last occurrence-->"+y);
	}

}
