import java.util.*;
public class Lab503 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String message;
		System.out.print("Message : ");
		message = input.nextLine();
		int check = message.toLowerCase().indexOf("nichi");
		if(check>=0) {
			System.out.println("Nichi is a sentence");
		}else {
			System.out.println(message);
		}
	}

}
