package guvi;
import java.util.Scanner;
public class hun55 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		a[i]=sc.nextInt();		
	}
			System.out.println("Enter the number:");
			int d=sc.nextInt();
			for(int i=0;i<n;i++){
				if(a[i]==d){
					for(int x=i;x<n-1;x++){
						System.out.println(a[x+1]);
					}
					for(i=0;i!=d;i++){
						System.out.println(a[i]);
	}							
}
}
}
}
