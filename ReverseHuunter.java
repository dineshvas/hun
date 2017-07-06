package guvi;
import java.util.Scanner;
public class ReverseHuunter {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String get=sc.nextLine();
		StringBuffer sb=new StringBuffer(get);
		sb.reverse();
		System.out.println(sb);
	}

}
