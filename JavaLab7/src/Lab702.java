import java.util.*;
public class Lab702 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double []student = new double[5];
		double sum=0,average=0;
		for(int i=0;i<student.length;i++) {
			System.out.print("Input score of student "+(i+1)+" : ");
			student[i] = scan.nextDouble();
			sum+=student[i];
		}
		System.out.println();
		average=sum/(student.length);
		System.out.println("Average of "+student.length+" student is "+average);
		int j=1;
		for(double _student:student) {
			if(_student>average) {
				System.out.println("> student"+j+" ("+_student+")");
			}
			j++;
		}

	}

}
