package p2;

public class Name {
	
	Employee employee;

	public Name(Employee employee) {
		super();
		this.employee = employee;
	}

	public boolean validate(String f1,String l1) throws NameBlankException
	{
		String CheckFname=employee.getFname();
		String CheckLname=employee.getLname();
		boolean status=true;
		if(CheckFname=="" && CheckLname=="")
		{
			status= false;
			throw new NameBlankException(f1,l1);
		}
		return status;
	}
	
}
