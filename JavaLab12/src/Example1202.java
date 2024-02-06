import java.util.*;
import java.io.*;
public class Example1202 {

	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Section: ");
		int inputSec = scan.nextInt();
		Header(inputSec);
		showListStudent(inputSec);
	}
	
	public static void showListStudent(int inputSection) throws IOException{
		BufferedReader readFile = new BufferedReader(new FileReader("D://txtFile//List107.txt"));
		String temp = "";
		while((temp=readFile.readLine())!=null) {
			String []data = temp.split("\t");
			String stuId = data[0];
			String stuName  = data[2];
			int stuSec = Integer.parseInt(data[3]);
			double stuMidscore = Double.parseDouble(data[4]);
			double stuFinalscore = Double.parseDouble(data[5]);
			if(stuSec==inputSection) {
				System.out.println(stuId+"\t"+stuName+"\t"+stuMidscore+"\t"+stuFinalscore+"\t"
			+findResult(stuMidscore,stuFinalscore));
			}
		}readFile.close();
	}
	public static String findResult(double midscore,double finalscore) {
		double sum = midscore+finalscore;
		if(sum>=40)return "PASS";
		else return "FAIL";
	}
	public static void Header(int sec) {
		System.out.println("********************************************************");
		System.out.println("\tList of Data for Section "+sec);
		System.out.println("********************************************************");
	}
	

}
