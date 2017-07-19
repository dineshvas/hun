package pro;
import java.util.Scanner;
public class pro_13 {
/*public void stack(int d,String start,String runs,String end){
	if(d==1){
		System.out.println(start +"<==>"+end );
	}else{
		stack(d-1,start,runs,end);*/
		
	 public void solve(int f, String begin, String runs, String complete) 
	 {
	       if (f== 1) 
	       {
	           System.out.println(begin + "<==>" + complete);
	       } 
	       else 
	       {
	           solve(f-1, begin,complete,runs);
	           System.out.println(begin+ " <==>" +complete);
	           solve(f-1,runs,begin,complete);
	       }
	   }
	 public static void main(String[] args) {
	       pro_13 towers= new pro_13();
	       System.out.print("Enter number of discs: ");
	       Scanner scanner = new Scanner(System.in);
	       int discs = scanner.nextInt();
	       towers.solve(discs, "strt", "concl", "end");
	   }
	}

   
