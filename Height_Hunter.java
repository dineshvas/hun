package guvi;
import java.util.Scanner;
public class Height_Hunter {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter 50 students height:");
	float h[]=new float[50];
	for(int i=0;i<10;i++){
		h[i]=sc.nextFloat();
	} 
	float temp=0;
	
	for(int i=0;i<50;i++){
		for(int j=i+1;j<50;j++){
			if(h[i]<h[j]){
				temp=h[i];
				h[i]=h[j];
				h[j]=temp;
						}
		}
		System.out.println(h[i]);
	}
	System.out.println("THE fourth height is:"+h[3]);
System.out.println("Enter the rank of height:");
int r=sc.nextInt();
System.out.println("Height is:"+h[r-1]);
	}
	}
