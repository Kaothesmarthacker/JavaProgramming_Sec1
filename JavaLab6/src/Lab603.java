import java.util.*;
public class Lab603 {
	static String fullname,firstname,yorname ;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space\n:");
		fullname = input.nextLine();
		int space = fullname.trim().indexOf(" ");
		firstname=fullname.substring(0,space);
		String yname = abbreviatName(fullname);
		System.out.println(yname+firstname);
	}

	public static String  abbreviatName(String fname) {
		for(int i=0;i<fname.length();i++) {
			if(fname.charAt(i)==' ') {
				yorname = fname.charAt(i+1)+".";
			}
		}
		return yorname;
	}
	
}
