package guvi;
import java.util.Arrays;
import java.util.Scanner;
public class UniqueInteger {
	public static void main(String[] arr){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int s=sc.nextInt();
		System.out.println("Enter the array elements:");
		int a[]=new int[s];
		for(int i=0;i<s;i++){
             a[i]=sc.nextInt();
             	}
		Arrays.sort(a);
		int count=0;
		int flag=0;
        for(int i = 0; i < s; i++)
        {
           for(int j = 0; j < s; j++)
            {
                if(i != j)
                {
                    if(a[i] != a[j])
                    {
                        flag = 1;
                    }
                    else
                    {
                        flag = 0;
                       break;
                    }
                }
            }
            if(flag == 1)     
            {
                count++;
                System.out.print("The Unique Elements is:"+a[i]);
}
            else{
            	System.out.println("NO UNIQUE ELEMENTS:");
            }
}
}
	}