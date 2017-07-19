package pro;
import java.util.Scanner;
public class coins18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the coin value 1:");
		int coin1=sc.nextInt();
		System.out.println("Enter the coin value 2:");
		int coin2=sc.nextInt();
		System.out.println("Enter the coin value 3:");
		int coin3=sc.nextInt();
		System.out.println("Enter the total sum:");
		int sum=sc.nextInt();
	int coin11=sum%coin1;     
System.out.println(coin1+"rupees coin reqired:"+coin11);
	int coin22=sum%coin2;
	System.out.println(coin2+"rupees coin reqired:"+coin22);
	int coin33=sum%coin3;
	System.out.println(coin3+"rupees coin reqired:"+coin33);
		System.out.println(sum%coin1);
	}
}
