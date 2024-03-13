class Person{

	float height;
	float weight;
	int age;

	Person(float h, float w, int a){
		height=h;
		weight=w;
		age=a;
	}

	Person(float h, float w){
		height=h;
		weight=w;
		age=0;
	}

	void display(){
		System.out.println("Height of the person is:" +height);
		System.out.println("Weight of the person is:" +weight);
		System.out.println("Age of the person is :" +age);

	}

	public static void main(String args[]){

	Person obj=new Person(5.5f,1.5f,22);
	obj.display();

	Person obj1=new Person(6.0f, 2.0f);
	obj1.display();
	}

}

