package pro;
import java.util.Scanner;
public class cnady16 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no.of.1st rating child:");
	int frating=sc.nextInt();
	System.out.println("Enter the no.of.2nd rating child:");
	int srating=sc.nextInt();
	System.out.println("Enter the no.of childrens:");
	int child=sc.nextInt();
	int count=0;
	int count1=0;
	for(int i=1;i<=frating;i++){
	count=2*i;
			}
	for(int i=0;i<srating;i++){
		++count1;
	}
    int chocolate=(count+count1+child);


			System.out.println("The Minimum Chocolate required is:"+chocolate);
}
}
