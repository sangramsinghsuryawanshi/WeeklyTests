package weekly.test7;

import java.util.Scanner;

public class FrontBackTransformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str =sc.nextLine();
		for(int i=0;i<str.length();i++) {
			System.out.println(Character.toLowerCase((char)((int)'Z'-((char)Character.toUpperCase(str.charAt(i))-65))));
		}
	}

}
