import java.util.Scanner;

class Q16{

	public static int getnumber(){
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		return num;

	}


	public static void main(String args[]){
	
		int num=getnumber();
		int i=2;

		do{

			if(num%i!=0 && num%num==0)
				System.out.println("Number is not prime");
				
		

			else
				System.out.println("Number is prime");
				num=getnumber();
        
	
		}while(i<=num);

	}

}


