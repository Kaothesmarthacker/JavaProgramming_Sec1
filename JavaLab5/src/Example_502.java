import javax.swing.*;
public class Example_502 {

	public static void main(String[] args) {
		String youremail = JOptionPane.showInputDialog("Input your e-mail");
		while(youremail.startsWith("@")||youremail.startsWith(" ")) {
			youremail = JOptionPane.showInputDialog("Input your e-mail again");
		}
		youremail = youremail.toLowerCase();
		if(youremail.endsWith("@hotmail.com")||youremail.endsWith("@gmail.com")) {
			JOptionPane.showMessageDialog(null, "your e-mail is "+youremail);
		}else {
			JOptionPane.showMessageDialog(null, "your e-mail is not hotmail or gmail dot com");

		}
	}

}
