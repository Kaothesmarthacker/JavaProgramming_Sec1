
public class Person {
	private String firstName;
	private String lastName;
	
	Person(){
		firstName=lastName=""; //Initialize firstname and lastname to an empty string
	}
	
	Person(String first,String last){
		/*firstName = first;
		lastName = last;*/
		setName(first,last); //ทำแบบนี้ก็ได้ แบบใหม่แบบสับ
	}
	
	public void setName(String first,String last) {
		firstName = first;
		lastName = last;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String toString() {
		return firstName+" "+lastName;
	}

}
