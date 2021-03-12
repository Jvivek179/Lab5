package p3;

public class EmployeeException extends Exception{

	int SpecifiedSalary;

	public EmployeeException(int specifiedSalary) {
		super();
		SpecifiedSalary = specifiedSalary;
	}

	@Override
	public String toString() {
		return "EmployeeException [SpecifiedSalary=" + SpecifiedSalary + "]";
	}
	
}
