package Example3;
import javax.swing.*;
public class Shop100Baht {

	public static void main(String[] args) {
		Product sold = new Product();
			
		int buttonConfirm = JOptionPane.showConfirmDialog(null, "is the program run on Pattanakarn Branch?");
		if(buttonConfirm ==0) {
			sold = new PattanakarnBranch();
		}
		
		int NumberofProduct = Integer.parseInt(JOptionPane.showInputDialog("Input the number of product"));
		sold.setUnit(NumberofProduct);
		JOptionPane.showMessageDialog(null, sold);
		
	}

}
