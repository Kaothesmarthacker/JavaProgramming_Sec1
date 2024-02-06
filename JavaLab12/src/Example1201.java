import java.util.*;
import java.io.*;
public class Example1201 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(new File("D://txtFile//MemberLogin.txt"));
		while(scan.hasNext()) {
			String fname = scan.next(); //read fname
			scan.next(); //read lname
			scan.next(); // read password
			String email = scan.next().toUpperCase(); //read email
			System.out.println(fname+"("+email+")");
		}
		scan.close(); // close file
		
	}

}
