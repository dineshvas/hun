package guvi;

public class Hunter_45 {
	public static void main(String[] args){
		int num=4;
		int i=0;
		int count=0;
		int k=0;
		String t=null;
		
		while(count!=num){
			t=""+i;
		
			if(t.matches("^[3-4]+$")){
				k=i;
				count++;
				
			}i++;
		}
		System.out.println(k);
	if(count==0){
		System.out.println("invalid");
	}
	}
}
