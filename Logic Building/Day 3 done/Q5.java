import java.util.Scanner;

class Q5{

	public static int getnumber(){
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		return num;

	}


	public static void main(String args[]){

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int i=sc.nextInt();
		i= getnumber();

	while(i<10){//5<10t
		i++;//6

			int j=sc.nextInt();
			j=getnumber();

			if(j==0){
			break;
			}

			else if(j==1){
			continue;
			}

			System.out.println(i);
		}
			System.out.println("finished");
	
	}
			

}