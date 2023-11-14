
public class Example1 {

	public static void main(String[] args) {
		String ISBN ="IB2-6325-85-4-1",title="Basic Java Programming";
		int unit = 5;
		float price = 225.75f;
		
		System.out.println("Book ISBN  : "+ISBN);
		System.out.println("Book Title : "+title);
		System.out.println("Book Unit  : "+unit);
		System.out.println("Book Price :"+price);
		System.out.println("----------------------------------");
		double totalPrice = unit*price;
		System.out.println("total Price is "+totalPrice);
		//double vat = totalPrice+(totalPrice*7/100);
		System.out.println("Add VAT 7%  is "+(totalPrice+(totalPrice*0.07)));
	}

}
