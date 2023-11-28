import java.util.*;
public class Example1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input number : ");
		int previousnumber = scan.nextInt();
		while(true) {
			System.out.print("Input number : ");
			int currentnumber = scan.nextInt();
			if(currentnumber<previousnumber) {
				System.out.println("BYE BYE");
				break;
			}
			previousnumber = currentnumber;
		}
	}

}
