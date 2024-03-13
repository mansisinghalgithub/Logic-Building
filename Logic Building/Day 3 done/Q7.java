import java.util.Scanner;

class Q7{

	public static int getnumber(){
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		return num;

	}


	public static void main(String args[]){

		int i= getnumber();

	do{
		System.out.println(i);

	 } while(i!=0);
			
	
	}
			

}
