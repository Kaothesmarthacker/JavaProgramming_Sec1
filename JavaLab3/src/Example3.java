import java.text.DecimalFormat;
import javax.swing.*;
public class Example3 {

	public static void main(String[] args) {
		//DecimalFormat frm = new DecimalFormat("#,###.00");
		double InputWeight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight:"));
		double InputHeight = Double.parseDouble(JOptionPane.showInputDialog("Input Height:"))/100;
		double BMI = InputWeight/(InputHeight*InputHeight);
		String bmiCategory;
		if(BMI<18.5) bmiCategory = "Under-Weight";
		else if(BMI<=24.9) bmiCategory = "Normal-Weight";
		else if(BMI<=29.9) bmiCategory = "Over-Weight";
		else bmiCategory = "Obesity";
		JOptionPane.showMessageDialog(null,"BMI = "+String.format("%.1f",BMI)+"\nYor're "+bmiCategory,"BMI",JOptionPane.WARNING_MESSAGE);
	}

}
