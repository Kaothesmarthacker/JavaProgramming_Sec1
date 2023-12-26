import javax.swing.*;
public class Lab602 {

	public static void main(String[] args) {
		int inputyear=Integer.parseInt(JOptionPane.showInputDialog("Input year:"));
		while(!(checkYear(inputyear))) {
			inputyear=Integer.parseInt(JOptionPane.showInputDialog("Input year, again:"));
		}
		JOptionPane.showMessageDialog(null,
				isLeapYear(inputyear)
				?inputyear+" is Leap year"
						:inputyear+" is NOT Leap year");

	}
	
	public static boolean isLeapYear(int year) {
		if((year%4==0)&&((year%100!=0)||(year%400==0))) {
			return true;
		}
		return false;
	}
	
	public static boolean checkYear(int year) {
		if(year>=1000&&year<=3000) {
			return true;
		}else {
			return false;
		}
	}

}
