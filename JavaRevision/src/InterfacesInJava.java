

//		INTERFACES are used for defining callback methods in java


interface IMusicPlayer{  // Standard notation for interfaces 
	public void play();
	public void stop();
}
class Phone{
	void call() {
		System.out.println("call sent");
	};
	void sms() {
		System.out.println(("sms sent"));
	};
}
interface ICamera{
	public void click();
	public void record();
}



 class SmartPhone extends Phone implements IMusicPlayer,ICamera{
	public void play() {
		System.out.println("Music playing");
	};
	public void stop() {
		System.out.println("Music stopped");
	}
	public void click() {
		System.out.println("Picture clicked");
	}
	public void record() {
		System.out.println("Video recording on");
	}
}

public class InterfacesInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone s=new SmartPhone();
		Phone p=s;
		ICamera c =s;
		IMusicPlayer m=s; 
		s.play(); 	//dynamic method dispatching is allowed for Interfaces
		p.call();
		c.click();
		m.play();
	}

}
