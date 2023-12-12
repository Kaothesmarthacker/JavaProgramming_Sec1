import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		//ทำเองทุกข้อครับ
		Scanner input = new Scanner(System.in);
		String name,fname,lname;
		System.out.print("Full Name: ");
		name = input.nextLine();
		int space = name.trim().indexOf(" ");
		if(space==-1) {
			System.out.println("Incorrect Name");
		}else {
			fname=name.substring(0,space).toUpperCase();
			lname=name.substring(space+1).toLowerCase();
			System.out.println("First Name: "+fname);
			System.out.println("Last Name: "+lname);
		}
	}

}
