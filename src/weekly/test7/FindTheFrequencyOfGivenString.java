/*
 * Q1.write java program to calculate the frequency of each character 
 * in given string.

 */
package weekly.test7;

import java.util.Scanner;

public class FindTheFrequencyOfGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String s = sc.nextLine();
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int cnt=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					cnt++;
					ch[j]='\0';
				}
			}
			if(ch[i]!='\0' && ch[i]!=' ') {
				System.out.println(ch[i]+" count--> "+cnt);
			}
		}
	}

}
