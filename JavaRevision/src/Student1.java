
class Student{
	private String name,course;
	private int rollNo;
	private float m1,m2,m3;
	
	public float total()
	{
		return m1+m2+m3;
	}
	public void infoPrint() {
		System.out.println("Name --> "+name);
		System.out.println("Course --> "+course);
		System.out.println("Roll Number --> "+rollNo);
		System.out.println("Marks:");
		System.out.println("	 Science -> "+m1 +" Maths -> "+m2+" English -> "+m3);
		System.out.println("	 Your Grade is: "+grade());
		System.out.println(" 	 Your average is: "+ average());
		System.out.println(" 	 Your total marks are: "+total());
	}
	public float average() {
		return (m1+m2+m3)/3;
	}
	public String grade() {
		float m = ((m1+m2+m3)/30)*100;
		if (m>80){
			return "A";
		}else if(m>=70 && m<80){
			return "B";
		}else if(m>60 && m<70) {
			return "C";
		}else if (m>50 && m<60) {
			return "D";
		}else if (m>33 && m<50) {
			return "E";
		}else {
			return "	You failed"; 
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.name="Tarun";
		s1.course="B.Tech";
		s1.rollNo=54;
		s1.m1=7;
		s1.m2=8;
		s1.m3=5;
		s1.infoPrint();

	}

}
