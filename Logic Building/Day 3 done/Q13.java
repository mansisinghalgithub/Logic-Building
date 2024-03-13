import java.util.Scanner;

class Q13{

	public static int getnumber(){
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		return num;

	}


	public static void main(String args[]){
	int num=getnumber();

	System.out.println("Table of the given number:");

	int j;
	
	for(int i=1;i<=10;i++){
	j=num * i;;
	System.out.println(j);	
	
	}

}
			

}



