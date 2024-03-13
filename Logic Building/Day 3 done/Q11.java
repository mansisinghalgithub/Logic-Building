import java.util.Scanner;

class Q11{

		public static int getnumber(){
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number(0 to exit):");
		int num=sc.nextInt();
		return num;

		}


	public static void main(String args[]){

		int i= getnumber();

		while(i>0){
		System.out.println("You entered:" +i);
		i=getnumber();
		
	 } 


		System.out.println("Exiting program");	
	
	}
			

}
