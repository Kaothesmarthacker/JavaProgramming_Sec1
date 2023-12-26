import javax.swing.*;
public class Lab601 {

	public static void main(String[] args) {
		String youremail = JOptionPane.showInputDialog("Input your e-mail");
		while(youremail.startsWith("@")||youremail.startsWith(" ")) {
			youremail = JOptionPane.showInputDialog("Input your e-mail again");
		}
		boolean validateEmail = checkEmail(youremail);
		JOptionPane.showMessageDialog(null, (validateEmail==true?"your e-mail is "+youremail:"your e-mail is not hotmail or gmail dot com"));
		

	}
	
	public static boolean checkEmail(String email) {
		email = email.toLowerCase();
		if(email.endsWith("@hotmail.com")||email.endsWith("@gmail.com")) {
			return true;
		}else {
			return false;

		}
	}

}
