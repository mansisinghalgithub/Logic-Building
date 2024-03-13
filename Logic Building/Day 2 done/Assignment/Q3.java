class Box{

	float h;
	float l;
	float b;
	float volume;
	float surfacearea;

	Box(float height, float length, float breadth){
		h=height;
		l=length;
		b=breadth;
	}

	float getVolume(){
		volume=h*l*b;
		return volume;
	}


	float getArea(){
		surfacearea=((2*b*l)+(2*b*h)+(2*h*l));
		return surfacearea;
	}


	public static void main(String args[]){

		Box obj=new Box(5.5f,1.5f,5.5f);
		float volume=obj.getVolume();
		System.out.println("Volume of the box is:" +volume);
		float surfacearea=obj.getArea();
		System.out.println("Surface area of the box is" +surfacearea);

	}

}





