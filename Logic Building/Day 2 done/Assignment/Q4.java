class Vehicle{

	int price;
	String color;
	String model;

	Vehicle(int p, String c, String m){
		price=p;
		color=c;
		model=m;
	}

	void display(){
		System.out.println("Price of the car is:" +price);
		System.out.println("Color of the car is:" +color);
		System.out.println("Model of the car is:" +model);

	}


	public static void main(String args[]){

		Vehicle obj=new Vehicle(850000,"Blue", "XUV300");
		obj.display();
	
	}

}

