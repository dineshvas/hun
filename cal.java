package tem;
import java.util.Scanner;
public class cal {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start time");
		int t=sc.nextInt();int st=t;
        System.out.println("Enter time:");
		int n=sc.nextInt();
		int i=1;
	    int k=t;
	    int op[]=new int[n];
	    int os[]=new int[n];
	    System.out.println("");	 
		for(int j=1;j<n;j++){
			if(t==1){
				t=k*2;
				k=t;
			}
			else{
				t--;				
			}
		op[i]=t;
		i++;
		}
		
	for(int s=0;s<n;s++){
		op[0]=st;
			System.out.println((s+1)+"="+op[s]);
			os[s]=op[s];
		}
		System.out.println("Enter ur time");
	int u=sc.nextInt();
	
	System.out.println("the value for enter time"+os[u]);
	 
	}
	}

