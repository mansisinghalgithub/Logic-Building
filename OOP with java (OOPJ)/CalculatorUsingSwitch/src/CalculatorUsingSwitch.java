import java.util.Scanner;

public class CalculatorUsingSwitch {

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
				
				switch(operator) {
				case "+": 
					add=num1+num2;
					System.out.println(add);
					break;
					
				case "-":
					if(operator.equals("-"))
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
					break;
					
				case "*":
					mul=num1*num2;
					System.out.println(mul);
					break;
					
				case "/":
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
					break;
				
				
				default:
				{
					System.out.println("Wrong input entered by the user");
				}
					
			}
				sc.close();

	}

}
