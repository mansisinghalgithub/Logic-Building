import java.util.Scanner;

class Q18{

	public static int getnumber(){
		Scanner sc= new Scanner(System.in);
		//System.out.println("Enter any two numbers");
		int num=sc.nextInt();
		return num;
		}


	public static void main(String args[]){

		int result=0;

		System.out.println("Enter first number");
		int num1=getnumber();
		System.out.println("Enter second number");
		int num2=getnumber();

		System.out.println("Choose an operation");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("Enter you choice");
		int choice=getnumber();

		
switch(choice)
	{


	case 1:
		result= num1+num2;
		break;

	case 2:
		if(num1>num2)
		result= num1-num2;
		else
		result=num2-num1;
		break;


	case 3:
		result= num1*num2;
		break;

	case 4:
		if(num1>num2)
		result= num1/num2;
		else
		result=num2/num1;
		break;
	
	default:
		System.out.println("Wrong choice");
	}

	System.out.println("Result:" +result);

}
}


