import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		
		System.out.println("Enter the operator which you want to perform");
		System.out.println("+ For Addition");
		System.out.println("- For Subtraction");
		System.out.println("* For Multiplication");
		System.out.println("/ For Division");
		
		String operator=sc.next();
		
		
		
		int add,sub,mul,div;
		
		if(operator.equals("+"))
		{
			add=num1+num2;
			System.out.println(add);
		}
		else if(operator.equals("-"))
		{
			if(num1>num2)
			{
				sub=num1-num2;
				System.out.println(sub);
			}
			else
			{
				sub=num2-num1;
				System.out.println(sub);
			}
		}
		else if(operator.equals("*"))
		{
			mul=num1*num2;
			System.out.println(mul);
		}
		
		else if (operator.equals("/"))
		{
			if(num1>num2)
			{
				div=num1/num2;
				System.out.println(div);
			}
			else
			{
				div=num2/num1;
				System.out.println(div);
			}
		}
		
		else
		{
			System.out.println("Wrong input entered by the user");
		}
			
		
		sc.close();

	}

}
