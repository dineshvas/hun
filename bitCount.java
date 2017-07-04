package guvi;
import java.util.Scanner;
public class bitCount {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size:");
		int size=sc.nextInt();
		int i=0;
		int j=0;
		int num[]=new int[size];
        int bitcount[]=new int[size];
        System.out.println("Enter the Number:");
		for(i=0;i<size;i++){
			num[i]=sc.nextInt();
			bitcount[i]=Integer.bitCount(num[i]);
		System.out.println(num[i]);
	}}}
		
		/*for(i=0;i<size;i++){
			for(j=i+1;i<size;j++){
				if(num[i]<num[j]){
					int temp=0;
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
					temp=bitcount[i];
					bitcount[i]=bitcount[j];
					bitcount[j]=temp;
				}
			}
		}
		for(i=0;i<size;i++){
			for(j=i+1;j<size;j++){
				if(bitcount[i]<bitcount[j]){
					int temp=0;
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
					temp=bitcount[i];
					bitcount[i]=bitcount[j];
					bitcount[j]=temp;
					}
				
				for(i=0;i<size;i++){
					System.out.println("IN ORDER: "+num[i]+" ");
				}
			}
		}
	}
}*/
