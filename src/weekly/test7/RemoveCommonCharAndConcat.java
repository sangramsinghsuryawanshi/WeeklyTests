/*
 *  Q6. Remove common characters and concatenate 
 Input:
 s1 = aacdb
 s2 = gafd
 Output: cbgf
 Explanation: The common characters of s1
 and s2 are: a, d. The uncommon characters
 of s1 and s2 are c, b, g and f. Thus the
 modified string with uncommon characters
 concatenated is cbgf
 */
package weekly.test7;

import java.util.Scanner;

public class RemoveCommonCharAndConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 String: ");
		String s = sc.nextLine();
		System.out.println("Enter 2 String: ");
		String s1 = sc.nextLine();
		char ch[]=s.toCharArray();
		char ch1[]=s1.toCharArray();
		for(int i=2;i<ch.length;i++) {
			for(int j=0;j<ch1.length;j++) {
				if(ch[i]==ch1[j]) {
					ch[i]='\0';
				}
			}
			if(ch[i]!='\0') {
				System.out.println(ch[i]);
			}
		}
		for(int i=0;i<ch1.length-1;i++) {
			for(int j=0;j<ch.length;j++) {
				if(ch1[i]==ch[j]) {
					ch1[i]='\0';
				}
			}
			if(ch1[i]!='\0') {
				System.out.println(ch1[i]);
			}
		}
	}
}
