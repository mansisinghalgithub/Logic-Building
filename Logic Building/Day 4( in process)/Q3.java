import java.util.Scanner;

class Q3{

	public static void main(String args[]){
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		
		int array[];

		for(int i=1;i<n;i++){
			int t=2*(i-1);

				if(t%3==0)
				sum=t;
				continue;

		}
			
		System.out.println("The value of sum is:" +sum);

	}


}

// to calculate sum of multiple of 3