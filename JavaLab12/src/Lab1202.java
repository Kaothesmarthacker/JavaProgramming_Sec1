import java.util.*;
import java.io.*;
public class Lab1202 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("D://txtFile//MemberLogin.txt"));
		Scanner input = new Scanner(System.in);
		System.out.print("Input your e-mail: ");
		String inputemail = input.next();
		boolean found = false;
		while(scan.hasNext()) {
			scan.next();
			scan.next();
			String password = scan.next();
			String email = scan.next();
			if(email.toLowerCase().equals(inputemail.toLowerCase())) {
				System.out.println("Your password is "+password);
				found = true;
			}
		}
		if(found==false) {
		System.out.println("The data not found...");
		}
		scan.close();

	}

}
