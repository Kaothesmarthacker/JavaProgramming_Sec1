package Practice1;

public class Customer {
	private int id;
	private String name;
	private int discount;
	
	Customer(int id,String name,int discount){
		this.id = id;
		this.name = name;
		this.discount = discount;
	}
	public int getID() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public int getDiscount() {
		return this.discount;
	}
	public void setDiscount(int discount) {
		this.discount=discount;
	}
	public String toString() {
		return name+"("+id+")"+"("+discount+"%)";
		//return "id is: "+id+"\nname is:"+name+"\ndiscount is:"+discount;
	}
}
