import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any character");
		char character= sc.next().charAt(0);
		
		
		if(character=='A' || character=='E' || character=='I' || character=='O' || character=='U'|| character=='a' || character=='e' || character=='i' || character=='o' || character=='u')
		{
			System.out.println("Vowel");
		
		}
		else
		{
			System.out.println("Consonant");
		}

		sc.close();
	}

}
