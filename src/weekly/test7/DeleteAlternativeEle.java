package weekly.test7;

import java.util.Scanner;

public class DeleteAlternativeEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str=sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
		for(int i=0;i<sb.length();i++) {
			if(i==1 || i==3)
			sb.deleteCharAt(i);
		}
		for(int i=0;i<sb.length();i++) {
			System.out.println(sb.charAt(i));
		}
	}

}
