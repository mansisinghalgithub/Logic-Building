import java.util.Scanner;

class Q14{

	public static int getnumber(){
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		return num;

	}


	public static void main(String args[]){
	int num=getnumber();

	System.out.println("Factorial of the given number:");

	int fact=1;
	while(num>0){
	fact=fact*num;
	num--;

	}
	System.out.println(fact);	
	
	}
			

}