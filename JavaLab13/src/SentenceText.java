import java.util.*;
import java.io.*;
public class SentenceText {

	public static void main(String[] args) throws IOException {
		PrintStream writeFile = new PrintStream(new File("d://txtFile//sentence.txt"));
		Scanner scan = new Scanner(System.in);
		int i =1;
		while(true){
			System.out.print("Sentence: ");
			String word = scan.next();
			if(word.toLowerCase().equals("stop")) {
				System.out.println("stop");
				break;
			}
			writeFile.println(i+". "+word);
			i++;
		}
		System.out.println("File is save");
		writeFile.close();

	}

}
