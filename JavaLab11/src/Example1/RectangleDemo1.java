package Example1;
import javax.swing.*;
public class RectangleDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double widthInput = Double.parseDouble(JOptionPane.showInputDialog("Input width"));
		double lengthInput = Double.parseDouble(JOptionPane.showInputDialog("Input length"));
		String colorInput = JOptionPane.showInputDialog("Input color");
		Rectangle obj1 = new Rectangle(widthInput,lengthInput,colorInput);
		JOptionPane.showMessageDialog(null, obj1+"\nArea of Rectangle="+obj1.getArea());
	}

}
