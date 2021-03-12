package p3;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Salary salary1 = new Salary(3000,"vivek");
		System.out.println("Enter the salary :");
		int verifySal = new Scanner(System.in).nextInt();
		SalaryCheck s1=new SalaryCheck(salary1);
		boolean status = false;
		try {
		status = s1.validate(verifySal);
		}
		catch(Exception e)
		{
		System.out.println(e);
		}

		if(status)
		{
		System.out.println("enough salary");
		}
		else
		{
		System.out.println("need hike");
		}
	}

}
