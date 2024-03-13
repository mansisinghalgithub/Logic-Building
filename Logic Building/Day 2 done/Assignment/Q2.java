class Student{

	int initialValues(){

		int marks1=90;
		int marks2=100;
		int marks3=100;
		int total= marks1+marks2+marks3;
		return total;
		
	}

	void totalAverage(int totalMarks){		
		int avg=totalMarks/3;
		System.out.println(avg);
	
	}


	void display(String studentName,int totalMarks){
		System.out.println("Total Marks of the student is:" +totalMarks);
		System.out.println("Name of the student is:" +studentName);

	}


	public static void main(String args[]){
		Student obj=new Student();
		int totalMarks=obj.initialValues();
		String studentName="Mansi";
		obj.totalAverage(totalMarks);
		obj.display(studentName,totalMarks);


	

	}

}
