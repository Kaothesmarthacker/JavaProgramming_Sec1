import javax.swing.*;

import java.text.DecimalFormat;
import java.util.*;
public class Withdrawal {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###");
		Random rand = new Random();
		int balance = rand.nextInt(9)*100000;
		int num_1000=0,num_500=0,num_100=0,total=0;
		
		int withdrawMoney = Integer.parseInt(JOptionPane.showInputDialog("Your balance : "+frm.format(balance)
				+"\nInput money to withdraw"));
		total = withdrawMoney;
		if(withdrawMoney>balance)JOptionPane.showMessageDialog(null, "Error:Cannot withdraw more than balance",
				"ERROR",JOptionPane.ERROR_MESSAGE);
		else if(withdrawMoney>20000)JOptionPane.showMessageDialog(null, "Error:Cannot withdraw more than 20,000",
				"ERROR",JOptionPane.ERROR_MESSAGE);
		else if(withdrawMoney%100!=0) {
			int withdrawerror =withdrawMoney%100;
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw "+withdrawerror+" baht.",
					"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else {
			num_1000=total/1000;
			total-=num_1000*1000;
			num_500=total/500;
			total-=num_500*500;
			num_100=total/100;
			total-=num_100*100;
			JOptionPane.showMessageDialog(null, "You withdraw "+frm.format(withdrawMoney)+" baht."+
			"\n1,000 = "+num_1000+"\n500 = "+num_500+"\n100 = "+num_100);
		}
		

	}

}
