package Practice1;

public class Invoice {
	private int id;
	private Customer customer;
	private double amount;
	
	Invoice(int id,Customer customer,double amont){
		this.id = id;
		this.customer = customer;
		this.amount = amont;
	}
	
	public int getID() {
		return this.id;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer=customer;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public int getCustomerID() {
		return getCustomer().getID();
	}
	
	public String getCustomerName() {
		return getCustomer().getName();
	}
	
	public int getCustomerDiscount() {
		return getCustomer().getDiscount();
	}
	
	public double getAmountAfterDiscount() {
		return getAmount()-(getAmount()*getCustomerDiscount()/100);
	}
	
	public String toString() {
		return "Innovice["+"id="+id+",customer="+getCustomerName()+"("+getCustomerID()+")"+"("+getCustomerDiscount()+"%)"+",amount="+getAmountAfterDiscount();
	}
}
