import java.util.*;
public class Lab604 {
	static Scanner input = new Scanner(System.in); //ใส่staticเพื่อเอาไว้ใช้methodอื่นด้วย
	static String studentID,subjectID;
	static int subID;
	static boolean stuIT,subIT;
	public static void main(String[] args) {
		inputStudent();
	}
	
	public static void inputStudent() {
		System.out.print("Enter Student Id : ");
		studentID = input.next();
		System.out.print("Enter Subject Id : ");
		int subID = input.nextInt();
		subjectID = subID + ""; // convert integer to string
		while(!isLength(studentID,subjectID)) {
			System.out.print("Enter Student Id(10) : ");
			studentID = input.next();
			System.out.print("Enter Subject Id(7) : ");
			subID = input.nextInt();
			subjectID = subID + "";
		}
		System.out.println();
		stuIT = isITStudent(studentID);
		subIT = isITSubject(subjectID);
		displayData(stuIT,subIT);
	}
	
	public static boolean isLength(String stuid,String subid) {
		if(stuid.length()==10&&subid.length()==7)
		return true;
		else return false;
	}

	public static boolean isITStudent(String stuid) {
		if(stuid.substring(0,3).equals("211")&&stuid.substring(3,6).equals("311"))
		return true;
		else return false;
	}
	
	public static boolean isITSubject(String subid) {
		if(subid.substring(0,2).equals("21")&&subid.substring(4,5).equals("1"))
			return true;
			else return false;
	}
	
	public static void displayData(boolean stuIT,boolean subIT) {
		System.out.println(stuIT==true?"Student id: "+studentID+" 1st year student in IT":"Student id: "+studentID+" is not 1st year student in IT");
		System.out.println(subIT==true?"Enroll in courses for Year 1":"not enroll in courses for Year 1");
	}
}
