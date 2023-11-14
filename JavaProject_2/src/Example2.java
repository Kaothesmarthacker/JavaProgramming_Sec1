import java.text.*;
public class Example2 {

	public static void main(String[] args) {
		final double BUFFET=299;
		int number_customer = 5;
		double total = BUFFET*number_customer,totalVAT = total+(total*0.03);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		System.out.println("Buffet of "+number_customer
				+"customers  is "+frm.format(total));
		System.out.println("Add Service Charge 3% is "+frm.format(totalVAT));
		

	}

}
