/*
 * Q 2. Move all negative numbers to beginning and positive to end with
 *  constant extra space
Input: -12, 11, -13, -5, 6, -7, 5, -3, -6    
Output: -12 -13 -5 -7 -3 -6 11 6 5

 */
package weekly.test7;

import java.util.Scanner;

public class PrintAllNegativesNumbersToFirstAndPosiToLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		int x=0;
		System.out.println("Enter given array: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				b[x]=a[i];
				x++;
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]>0) {
				b[x++]=a[i];
			}
		}
		System.out.println("Given array is: ");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
	}

}
