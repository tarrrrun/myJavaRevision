import java.time.Year;

class Studentt{
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String rollNo;
	private String name;
	private static int count=1;
	private String generateRollNo(){
		String rn = "Univ-"+String.valueOf(Year.now().getValue())+"-"+count;
		count++;
		return rn;
	}
	public Studentt(String name) {
		this.name=name;
		rollNo=generateRollNo();
	}
}
public class StaticMembersExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentt s1 = new Studentt("Tarun");
		Studentt s2 = new Studentt("Varun");
		Studentt s3 = new Studentt("Arun");
		System.out.println(s1.getRollNo());
		System.out.println(s2.getRollNo());
		System.out.println(s3.getRollNo());

	}

}
