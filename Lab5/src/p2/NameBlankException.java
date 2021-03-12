package p2;

public class NameBlankException extends Exception {
	
	String firstName;
	String lastName;
	public NameBlankException(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "NameBlankException [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	

}
