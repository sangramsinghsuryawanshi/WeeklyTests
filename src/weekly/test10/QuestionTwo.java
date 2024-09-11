/*
 * Q2. Draw Given pattern :

INPUT : 12345:
OUTPUT : 
1   1
 2 2	
  3
 4 4
5   5

input : welcome

 w     w
  e   e
   l l
    c 
   o o
  m   m
 e     e

 */
package weekly.test10;

import java.util.Scanner;

public class QuestionTwo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter given size: ");
//		int size = sc.nextInt();
//		System.out.println("---------------------------");
//		for(int i=1;i<size;i++)
//		{
//			for(int j=1;j<size;j++)
//			{
//				if(i==j || j==size-i)
//				{
//					System.out.print(j);
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		System.out.println("Enter a string: ");
        String input = sc.next();
        int l = input.length()-1;
        for(int i=0;i<input.length();i++)
        {
        	  for(int j=0;j<input.length();j++)
              {
        		  if(i==j || j==l-i)
  				{
  					System.out.print(input.charAt(i));
  				}
  				else
  				{
  					System.out.print(" ");
  				}
              }
        	  System.out.println();
        }
	}
}
