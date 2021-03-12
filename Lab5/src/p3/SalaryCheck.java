package p3;

public class SalaryCheck {

	Salary salary;

	public SalaryCheck(Salary salary) {
		super();
		this.salary = salary;
	}
	public boolean validate(int salaryValue) throws EmployeeException
	{
		int Checkvalue=salary.getSal();
		boolean status=true;
		if(Checkvalue>=salaryValue)
		{
			status =false;
			throw new EmployeeException(salaryValue);
		}
		return status;
	}
	
}
