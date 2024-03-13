import java.util.Scanner;

class Q15{

	public static int getnumber(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		return num;
		}


	public static void main(String args[]){
	
		int num=getnumber();
		int sumOfDigits=0;
		

		do{
			int digit = num%10;//9362%10==2
			sumOfDigits += digit;
   			num = num/10;

		   }while(num!=0);
		
		System.out.println("Sum of digits" +sumOfDigits);

		

	}



}