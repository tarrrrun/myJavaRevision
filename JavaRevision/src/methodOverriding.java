class vehicle{
	public void horn() {
		System.out.println("normal horn");
	}
}
class car extends vehicle{

	public void horn() {
		System.out.println("honk");
	}
}


public class methodOverriding {

	public static void main(String[] args) {
		vehicle cc = new car();
		cc.horn();
	}

}
