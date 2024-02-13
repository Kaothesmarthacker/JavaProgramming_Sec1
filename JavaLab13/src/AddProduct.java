import java.util.*;
import java.io.*;
public class AddProduct {

	public static void main(String[] args) throws IOException {
		PrintStream writeFile = new PrintStream(new File("d://txtFile//sentence.txt"));
		Scanner scan = new Scanner(System.in);
		System.out.print("Product Id: ");
		String productId = scan.next();
		System.out.print("Product Name: ");
		String productName = scan.next();
		System.out.print("Product Unit: ");
		int productUnit = scan.nextInt();
		System.out.print("Product Price: ");
		float productPrice = scan.nextFloat();
		
		writeFile.println(productId+","+productName+","+productUnit+","+productPrice);
		System.out.println("File save....");
		
		
		writeFile.close();
	}

}
