import java.util.*;
public class Lab502 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence;
		System.out.print("Input some sentence : ");
		sentence = input.nextLine();
		while(!sentence.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			sentence = input.nextLine();
		}
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				System.out.println();
			}else {
			System.out.print(sentence.charAt(i));
			}
		}
		
	}

}
