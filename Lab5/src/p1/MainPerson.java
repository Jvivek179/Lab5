package p1;
import java.util.Scanner;
public class MainPerson {

	public static void main(String[] args) {
		
		
		Person person1 = new Person(15,"Vivek");
		System.out.println(" Enter the age : ");
		int verifyAge = new Scanner(System.in).nextInt();
		PersonAge p1 = new PersonAge(person1);
		boolean status = false;
		try {
		status = p1.validate(verifyAge);
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
		if(status)
		{
		System.out.println(" Person is eligible");
		}
		else
		{
		System.out.println("--- not eligible");
		}
		
	}

}
