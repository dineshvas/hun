package pro;

import java.util.Scanner;

public class pro48 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String s1:");
			String s1=sc.nextLine();
			System.out.println("Enter the String s2:");
			String s2=sc.nextLine();
			if(s1.contains(s2)){
				System.out.println(s1.indexOf(s2));
			}else{
				System.out.println("-1");
			}
		}
}
