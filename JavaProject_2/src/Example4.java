import javax.swing.*; //import libraly for input data form dialog box
import java.text.*;
public class Example4 {

	public static void main(String[] args) {
		String productName = JOptionPane.showInputDialog("Input Product Name : ");
		String strUnit = JOptionPane.showInputDialog("Input product unit : ");
		int productUnit = Integer.parseInt(strUnit);
		String strperUnit = JOptionPane.showInputDialog("Input Price per unit : ");
		double productperUnit = Double.parseDouble(strperUnit);
		
		double totalprice = productUnit*productperUnit;
		double totalVAT = totalprice + (totalprice*0.07);
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		JOptionPane.showMessageDialog(null,
									"Total Price   is "+frm.format(totalprice)+" baht."+
									"\nAdd VAT 7% is "+frm.format(totalVAT)+" baht.");
	}

}
