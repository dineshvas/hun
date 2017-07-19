package pro;
import java.util.Scanner;
public class pro50 {
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				int num=sc.nextInt();
				int quot=0;  
     			int Div=sc.nextInt();
				while(num>=Div){
					num-=Div;
					quot++;
				}
				System.out.println("remainder="+num);
				System.out.println("Quot="+quot);
}
}