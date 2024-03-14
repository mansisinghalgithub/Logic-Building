import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Height in meters");
		int height=sc.nextInt();
		System.out.println("Enter Weight in kilograms");
		int weight=sc.nextInt();
		float bmi=weight/height;
		System.out.println(bmi);
		
		if(bmi<18.5)
		{
			System.out.println("Underweight");
		}
		else if(bmi>=18.5 && bmi<=24.9)
		{
			System.out.println("Normal Weight");
		}
		else if(bmi>=25 && bmi<=29.9)
		{
			System.out.println("Overweight");
		}
		else
		{
			System.out.println("Obesity");
		}
		sc.close();

	}

}
