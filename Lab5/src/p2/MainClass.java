package p2;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee("","");
		System.out.println("Enter your First name");
		System.out.println("Enter your Last name");
		String First=new Scanner(System.in).nextLine();
		String Last=new Scanner(System.in).nextLine();
	
		Name n1=new Name(e1);
		boolean status =false;
		try
		{
			status=n1.validate(First,Last);
			
		}
		catch(Exception e)
		{
			System.out.println(e);	
		}
		
		if(status)
		{
			System.out.println("full name");
		}
		else
		{
			System.out.println("Chech tou name again");
		}
	}

}
