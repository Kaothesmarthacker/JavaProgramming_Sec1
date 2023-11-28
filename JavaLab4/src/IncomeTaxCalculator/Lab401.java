package IncomeTaxCalculator;

import java.util.*;

public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numX,numY;
		System.out.print("Input value of X : ");
		numX = scan.nextInt();
		System.out.print("Input value of Y : ");
		numY = scan.nextInt();
		while(numY<numX) {
			System.out.print("Input value of Y, again : ");
			numY = scan.nextInt();
		}
		System.out.println();
		int sum=numX;
		while(numX<numY) {
			numX++;
			int total = sum+numX;
			System.out.println(sum+" + "+numX+" = "+total);
			sum=total;
		}
	}

}
