package practice1;
import java.util.*;
import java.io.*;
public class ATMBanking {

	public static void main(String[] args) throws IOException {
		Scanner readFile = new Scanner((new File("d://txtFile//ATMBookBank.txt")));
		Scanner input =new Scanner(System.in);
		System.out.print("Enter account number : ");
		String accNumber = input.next();
		/*while() {
			System.out.print("Input wrong type, Enter account number : ");
			accNumber = input.next();
		}*/
		System.out.print("Enter account password : ");
		String accPassword = input.next();
		while(!(accPassword.length()==4)) {
			System.out.print("Enter account password : ");
			accPassword = input.next();
		}
		int accMoney;
		do {
			System.out.print("Enter money : ");
			accMoney = input.nextInt();
		}while(accMoney<=0);

	}

}
