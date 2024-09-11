package weekly.test7;

import java.util.Scanner;

public class NumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n number: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=n;j>=i;j--){
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--){
				System.out.print(k+"");
			}
			for(int z=2;z<=i;z++){
				System.out.print(z+"");
			}

		System.out.println();
		}

	}

}
