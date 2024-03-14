import java.util.Scanner;

public class Grade {
		
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the numerical grade");
		float a=sc.nextFloat();
		
		
		if(a>=85)
		{
			System.out.println("Grade A+");
		}
		
		else if(a>=70 && a<=84.99)
		{
			System.out.println("Grade A");
		}
		
		else if(a>=60 && a<=69.99)
		{
			System.out.println("Grade B");
		}
		else if(a>=50 && a<=59.99)
		{
			System.out.println("Grade C");
		}
		else if(a>=40 && a<=49.99)
		{
			System.out.println("Grade D");
		}
		else 
		{
			System.out.println("Grade E");
		}
		
		sc.close();
				

	}

}
