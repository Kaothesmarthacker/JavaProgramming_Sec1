
public class Testcircle {

	public static void main(String[] args) {
		circle_1 c1 = new circle_1();
		circle_1 c2 = new circle_1();
		circle_1 c3 = new circle_1();
		circle_1 c4 = new circle_1();
		
		c1.setRadius(2.0);
		c1.setColor("blue");
		System.out.print("The Area of object c1 is "+c1.getArea());
		System.out.println(", and color is "+c1.getColor());

		c2.setRadius(2.0);
		c2.setColor("red");
		System.out.print("The Area of object c1 is "+c2.getArea());
		System.out.println(", and color is "+c2.getColor());
		
		System.out.println(showColor("red"));
	}
	
	public static String showColor(String color) {
		return "The color is "+color;
	}

}
