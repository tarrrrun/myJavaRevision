class Product{
	private float price;
	private int quantity;
	private String name,itemNo;
	public Product(String itemNo,String name){
		this.itemNo=itemNo;
		this.name=name;
	}
	
	public void setQuantity(int n) {
		if (n<0){
			quantity=0;
			System.out.println("Invalid Entry.");
		}else {
			quantity=n;
			System.out.println("Quantity set to: "+quantity);
		}
	}
	public int getQuantity() {
		return quantity;
	}
	public String getItemNo() {
		return itemNo;
	}
	public String getName() {
		return name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float n) {
		if (n<0) {
			System.out.println("Invalid Entry!");
			
		}else {
			price=n;
			System.out.println("Price set to "+price+" successfully.");
		}
	}
	
}

class Customer{
	private String custId,name,address,phNo;
	
	public Customer(String custId,String name) {
		this.custId=custId;
		this.name=name;
	}
	
	
	public String getCustId() {
		return custId;
		
	}
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
		
	}
	public void setAddress(String s) {
		address=s;
		System.out.println("Address set to "+address+" successfully.");
	}
	public String getPhNo() {
		return phNo;
	}
	public void setPhNo(String no) {
		phNo=no;
		System.out.println("Phone number set to "+phNo+" successfully.");
	}

	
}

public class ProductConsumers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer("123Ta","Tarun");
		c1.setPhNo("5533");
		c1.setAddress("Nayabans");
		System.out.println("Customer ID-> "+c1.getCustId());
		System.out.println("Name-> "+c1.getName());
		System.out.println("Customer Address-> "+c1.getAddress());
		System.out.println("Phone number-> "+c1.getPhNo());
		System.out.println();
		System.out.println();

		
		
	}

}
