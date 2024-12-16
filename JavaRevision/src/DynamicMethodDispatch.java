class TV{
	public void switchOn() {
		System.out.println("TV is switch on");
		
	}
	public void changeChannel() {
		System.out.println("CTV has changed the channel");
	}
	
}
class smartTV extends TV{
	public void switchOn() {
		System.out.println("Smart tv is switched on");
	}
	public void changeChannel() {
		System.out.println("Smart TV hanged channel.");
	}
	public void browse() {
		System.out.println("Smart tv is browsing.");
	}
}
public class DynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tt = new TV();		
		tt.switchOn();				
		TV tt2=new smartTV();		//Making object of subclass(SmartTV) with reference of parent class (TV)
		tt2.switchOn();				//Overidden Method of subclass is called
		smartTV tt3=new smartTV();
		tt3.switchOn();
 		tt3.browse();
 //		tt2.browse();				Method that are not present in the referennced class (parent) cannot be called 
	}

}
