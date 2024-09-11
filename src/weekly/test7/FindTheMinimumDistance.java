/*
 * Q5. Find the minimum distance between the given two words

Input: S = { “the”, “quick”, “brown”, “fox”, “quick”}, word1 = “the”, word2 = “fox”
Output: 3
Explanation: Minimum distance between the words “the” and “fox” is 3

Input: S = {“geeks”, “for”, “geeks”, “contribute”,  “practice”}, word1 = “geeks”, word2 = “practice”
Output: 2
Explanation: Minimum distance between the words “geeks” and “practice” is 2
the quick brown fox quick

 */
package weekly.test7;

import java.util.Scanner;

public class FindTheMinimumDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given word: ");
		String s=sc.nextLine();
		String str[]=s.split(" ");
		System.out.println("Enter 1 String: ");
		String s1 = sc.nextLine();
		System.out.println("Enter 2 String: ");
		String s2 = sc.nextLine();
		int temp=0,temp1=0;
		for(int i=0;i<str.length;i++) {
			if(str[i].equals(s1)) {
				temp=i;
			}
			if(str[i].equals(s2)) {
				temp1=i;
			}
		}
		int cnt=0;
		for(int i=temp;i<temp1;i++) {
			cnt++;
		}
		System.out.println(cnt);
	}
}
