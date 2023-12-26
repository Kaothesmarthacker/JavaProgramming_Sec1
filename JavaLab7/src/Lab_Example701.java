
public class Lab_Example701 {

	public static void main(String[] args) {
		int[]nums= {12,50,93,45,75,52,80};
		for(int i=0;i<nums.length;i++) {
			System.out.println("nums["+i+"] = "+nums[i]);
		}
		System.out.println("usig foreach to display value of array");
		int j = 0;
		for(int _nums:nums) {
			System.out.println("nums["+j+"] = "+_nums);
			j++;
		}
		printarrayNumber(nums);
	}
	
	public static void printarrayNumber(int[] number) {
		System.out.println("usig method to display value of array");
		for(int i=0;i<number.length;i++) {
			System.out.println("nums["+i+"] = "+number[i]);
		}
	}

}
