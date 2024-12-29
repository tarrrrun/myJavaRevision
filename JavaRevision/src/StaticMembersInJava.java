class HondaCity{
	static long price=10;
	static int a,b;
	public static int getA() {
		return a;
	}
	public static void setA(int a) {
		HondaCity.a = a;
	}
	static double onRoadPrice(String n) {
		switch(n) {
		case "delhi":
			return price+price*0.1;
		case "mumbai":
			return price+price*0.13;
		default :
			return price;
		}
	}
}
public class StaticMembersInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(HondaCity.price);
		//HondaCity hc = new HondaCity();
		  System.out.println(HondaCity.onRoadPrice("mumbai"));
		  HondaCity.setA(14);
		  System.out.println(HondaCity.a);
		  HondaCity hc = new HondaCity();
		  System.out.println(hc.a);
	}

}
