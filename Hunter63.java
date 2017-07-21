package guvi;
import java.util.ArrayList;
import java.util.Scanner;
public class Hunter63 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size:");
	int n=sc.nextInt();
	System.out.println("Enter array elements:");
	int a[]=new int[n];
	for(int i=0;i<n;i++){
		a[i]=sc.nextInt();}int temp=0;
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			if(a[i]<=a[j]){
				a[i]=a[j];
			}
		}}
	//String a1[]=new String[n];String a21[]=new String[n];
		//String a11="";
		//String a12="";
		//String a11[]=new String[n];
		//String a12[]=new String[n];
		
		
		//for(int i=0;i<n-1;i++){
		//if(a[i]<=a[i+1]){
	//	a1[i]=String.valueOf(a[i]);
		//a11[i]=String.valueOf(a[i]);
		//a12[i]=String.valueOf(a[i+1]);
			//a21[i]=a1[i].replace(a11[i],a12[i]);
ArrayList<Integer> as=new ArrayList<Integer>();
for(int i=0;i<n;i++){ 
as.add(a[i]);
}
int k=0;
as.add(0);
System.out.println(as);
}
}