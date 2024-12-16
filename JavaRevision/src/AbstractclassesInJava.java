abstract class Super{
	Super(){
		System.out.println("Super Constructor called.");
	}
	void meth1() {
		System.out.println("meth1 of super class");
	}
	abstract void meth2();			// An abstract method in a abstract class 
}
class Sub extends Super{
	 void meth2() {
		System.out.println("Sub meth2 called.");
	}
	 void meth1(int x) {				//	Same signature method with a parameter
		 System.out.println(x);
	 }
}
// --------------------------	ANOTHER EXAMPLE BELOW	-------------------------------------------------
abstract class Hospital{
	abstract void emergency();
	abstract void appointment();
	abstract void admit();
	abstract void billing();
}


class myHospital extends Hospital{
	void emergency() {
		System.out.println("Emergency method is called");
	}
	void appointment() {
		System.out.println("Appointment method is called");
	}
	void admit() {
		System.out.println("Admit method");
	}
	void billing() {
		System.out.println("billing is done");
	}
}




public class AbstractclassesInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super sup=new Sub();
		sup.meth1();		// Calls mth1 method of Super
//		sup.meth1(55);		THIS METHOD CANNOT BE CALLED BECAUSE IT HAS REFERENCE OF PARENT CLASS IN WHICH THIS METHOD HAS NO PARAMETER
		sup.meth2(); 
		Sub sub=new Sub();	//Making object of Sub (Child) with reference of Same class
		sub.meth1();		// This object can call meth1() of parent class if no parameter is passed
		sub.meth1(23);		// And can call meth1() of child class if parameter is passed.
		System.out.println("------------------------------------------------------------");
		
		Hospital hh = new myHospital();
		myHospital hhh=new myHospital();
		hh.emergency();
		hh.appointment();
		hh.admit();
		hh.billing();
		
		
		
	}

}
