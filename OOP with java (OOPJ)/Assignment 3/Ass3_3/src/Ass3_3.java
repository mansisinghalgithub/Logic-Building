
public class Ass3_3 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		int num1=Integer.parseInt(args[0]);
		float num2=Float.parseFloat(args[1]);
		double num3=Double.parseDouble(args[2]);
		double result=num1+num2+num3;
		System.out.println("Result: "+result);
		
		double result1=num1*num2*num3;
		System.out.println("Result: "+result1);
		
		double result2=(num1/num2)/num3;
		System.out.println("Result: "+result2);
		
		double result3=(num1-num2)-num3;
		System.out.println("Result: "+result3);
		
		
	}

}
