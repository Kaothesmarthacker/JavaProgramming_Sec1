package Example1;
//ถ้าเป็นclass abstract ต้องมีอย่างน้อย1 method ที่เป็นabstract
public abstract class Shape {
private String color;
public Shape(String color) {
	this.color = color;
}
public Shape() {
	this.color= "";
}
//abstract method
public abstract double getArea();

public String toString() {
	return "color= "+this.color;
}

}
