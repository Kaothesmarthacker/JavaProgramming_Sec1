import java.util.*;
import java.io.*;
public class Lab1205 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("D://txtFile//student.txt"));
		int i=1;
		Header();
		while(scan.hasNext()) {
			String id = scan.next();
			scan.next();
			String fname = scan.next().substring(0,1).toUpperCase();
			String lname = scan.next();
			double grade = scan.nextDouble();
			scan.next();
			System.out.println(i+"."+"\t"+id+"\t"+Level(id)+"\t"+fname+"."+lname+"\t"+grade+"\t"+Status(grade));
			i++;
		}scan.close();
	}
	public static String Level(String id) {
		int stuLevel = Integer.parseInt(id.substring(0,2));
		int stuYear=22-stuLevel;
		return stuYear+"th";
	}
	public static String Status(double grade){
		if(grade>=2.00)return "PASS";
		else if(grade<2.00&&grade>=1.00)return"CRITICAL";
		else return "RETIRED";
	}
	public static void Header() {
		System.out.println("No.\tID\t\tLevel\tname\t\tGrade\tStatus");
		System.out.println("********************************************************************");
	}

}
