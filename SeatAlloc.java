package seat;
import java.util.Scanner;
public class SeatAlloc{
	public static void main(String[] args) {
		String a[][]=new String[5][6];
		for(int i=0;i<5;i++){
			for(int j=0;j<6;j++){
				a[i][j]="S"+i+j;
			}
		}
		System.out.println("WELCOME TO MEIYARASU TRANSPORT");
	String seatnumber="";
    
	//System.out.println(column);
	char c=0; 
	int count=0;
    do{  	Scanner sc=new Scanner(System.in);
    for(int i=0;i<5;i++){
		for(int j=0;j<6;j++){
			System.out.print(a[i][j]+" ");
		}
	System.out.println();
	 }
   	System.out.println("Enter details:"); 
    System.out.println("Enter your Name:");
    String name=sc.nextLine();
    System.out.println("Chooose your seat:");
	  String seat=sc.nextLine();
	int row=Integer.parseInt(seat.substring(1,2));
	int column=Integer.parseInt(seat.substring(2,3));
    	do{
    		if((seat.substring(0,1).equals("S")||seat.substring(0,1).equals("s"))&&(row<10)&&(column<6)){
    	 if((a[row][column].equals("R"))){
    		 System.out.println(" SEAT IS ALREADY BOOKED ");
    		 System.out.println("ENTER A ANOTHER SEAT:");
    	 }else{
    	 	System.out.println("SUCCESSFULLY SEAT BOOKED");
    		seatnumber=a[row][column];
    	 	a[row][column]="R";
    	  	count++;
     }}
     else{
    	 System.out.println("Enter valid seat:");
     }	}while(count==0);

System.out.println("Do yo want to book another seat:");
System.out.println("Press y or press any key to exit");
 c=sc.next().charAt(0);
//System.out.println(c);	
    
    }while(c=='y'||c=='Y');
    System.out.println("YOUR SEAT NUMBER "+seatnumber+" IS SUCCESFULLY REGISTERED FOR U");
    System.out.println("HAVE A JOYFULL JOURNEY");
	}  	
	}




	