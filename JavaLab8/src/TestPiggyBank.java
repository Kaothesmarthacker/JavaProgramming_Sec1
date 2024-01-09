import java.util.*;
public class TestPiggyBank {
	static Scanner scan = new Scanner(System.in);
	static PiggyBank pb = new PiggyBank();
	public static void main(String[] args) {
		/*pb.setPiggyBank(500);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTwo (34);
		System.out.println("Add 2 Baht Money : " + 34);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTen (13);
		System.out.println("Add 10 Baht Money : " + 13);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addFive(100);*/
		inputCoin();
 }
	public static void inputCoin() {
		System.out.println("Money Total : " + pb.getTotal());
		System.out.print("Please define size of PiggyBank:");
		int sizeofPiggyBank=scan.nextInt();
		pb.setPiggyBank(sizeofPiggyBank);
		System.out.println("Size of your PiggyBank:" + pb.getPiggyBank());
		MainMenu();
		
	}
	
	public static void MainMenu() {
		while(true){
			System.out.println();
			System.out.println("==================================");
			System.out.println("Menu of PiggyBank");
			System.out.println("==================================");
			System.out.println("[1] one baht.");
			System.out.println("[2] two baht.");
			System.out.println("[3] five baht.");
			System.out.println("[4] ten baht.");
			System.out.println("[5] Exit");
			System.out.println("==================================");
			System.out.print("Please Select Menu[1-5]: ");
			int selectMenu=scan.nextInt();
			if(selectMenu==1) {
				System.out.print("Insert 1 Bath Money: ");
				int insertOne=scan.nextInt();
				pb.addOne (insertOne);
				System.out.println("Money Total : " + pb.getTotal());
			}else if(selectMenu==2) {
				System.out.print("Insert 2 Bath Money: ");
				int insertTwo=scan.nextInt();
				pb.addTwo (insertTwo);
				System.out.println("Money Total : " + pb.getTotal());
			}else if(selectMenu==3) {
				System.out.print("Insert 5 Bath Money: ");
				int insertFive=scan.nextInt();
				pb.addFive (insertFive);
				System.out.println("Money Total : " + pb.getTotal());
			}else if(selectMenu==4) {
				System.out.print("Insert 10 Bath Money: ");
				int insertTen=scan.nextInt();
				pb.addTen (insertTen);
				System.out.println("Money Total : " + pb.getTotal());
			}else if(selectMenu==5) {
				System.out.println("Bye Bye");
				break;
			}
			
		}
	}
}