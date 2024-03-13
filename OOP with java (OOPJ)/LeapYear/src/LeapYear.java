
public class LeapYear {

	public static void main(String[] args) {
		int year=2010;
		
			if(year%4==0 || year%100==0 || year%400==0)
			{
				System.out.println("Given year is Leap");
			
			}
			else
			{
				System.out.println("Given year is not leap");
			}

	}

}
