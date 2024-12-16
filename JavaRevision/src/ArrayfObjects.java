class Subject{
	
	private String subId,name;
	private int maxMarks,marksObtained;
	public String getSubId() {
		return subId;
	}
	public String getName() {
		return name;
	}
	public void setMarks(int n) {
		if (n<0) {
			System.out.println("Invalid entry.");
		}else {
			marksObtained=n;
			System.out.println("Marks in this subject succcessfully set to "+marksObtained);
		}
	}
	boolean isQualified() {
		 return marksObtained >= maxMarks * (1/3);
	}
	public int getMarks() {
		return marksObtained;
	}
	public int getMaxMarks() {
		return maxMarks;
	}
	public Subject(String subId,String name) {
		this.subId=subId;
		this.name=name;
		this.maxMarks=100;
	}
	public String toString() {
		return "\nSubject ID: "+subId+"\nName: "+name+"\nMarks Obtained: "+marksObtained;
	}
}

public class ArrayfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Subject subs[] = new Subject[3];
		 subs[0]=new Subject("s101","DS");
		 subs[1]=new Subject("s102","OS");
		 subs[2]=new Subject("s103","C l anguage");
		 subs[0].setMarks(25);
		 subs[1].setMarks(45);
		 subs[2].setMarks(79);
		 
		 
		 for (Subject s:subs)
			 System.out.println(s);


	}

}
