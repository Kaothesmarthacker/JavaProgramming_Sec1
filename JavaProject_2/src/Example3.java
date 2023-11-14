import java.util.*; //for input data from keboard
import java.text.*;
public class Example3 {

	public static void main(String[] args) {
		//รับข้อมูล
		Scanner input = new Scanner(System.in);
		//จัดรูปแบบ
		DecimalFormat frm = new DecimalFormat("#,###.00");
		System.out.print("Input product name     : ");
		String product_name = input.nextLine();
		System.out.print("Input product unit     : ");
		int product_unit = input.nextInt();
		System.out.print("Input product per unit : ");
		float product_perunit = input.nextFloat();
		System.out.println();
		double totalprice = product_unit*product_perunit;
		System.out.println("Total Price is "+frm.format(totalprice)+" baht.");
		double totalVAT = totalprice + (totalprice*0.07);
		System.out.println("Add VAT 7%  is "+frm.format(totalVAT)+" baht.");
	}

}
