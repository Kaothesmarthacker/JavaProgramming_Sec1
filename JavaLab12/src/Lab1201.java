import java.util.*;
import java.io.*;
public class Lab1201 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("D://txtFile//MemberLogin.txt"));
		while(scan.hasNext()) {
			String fname = scan.next(); //read fname
			String lname = scan.next().substring(0,1); //read lname
			scan.next(); // read password
			String email = scan.next().toUpperCase(); //read email
			System.out.println(lname+"."+fname+" ("+email+")");
		}
		scan.close();
	}

}
