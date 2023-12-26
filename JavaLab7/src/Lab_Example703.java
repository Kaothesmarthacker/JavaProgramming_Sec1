import java.util.*;
public class Lab_Example703 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int []nums = new int[5];
		for(int i=0;i<nums.length;i++) {
			System.out.print("Input number "+(i+1)+" : ");
			nums[i] = scan.nextInt();
		}
		int total = sumOfPos(nums);
		System.out.print("Summaton of positive number is "+total);

		
	}
	public static int sumOfPos(int[] number) {
		int sum=0;
		for(int _number:number) {
			if(_number>0) {
				sum +=_number;
			}
		}
		return sum;
	}

}
