package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class nRegClass {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE SIZE");
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		String k="";
	for(int i=n-1;i>=0;i--){
	k=k+Integer.toString(a[i]);
	}
System.out.println(k);
	}
}