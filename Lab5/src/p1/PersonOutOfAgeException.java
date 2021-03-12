package p1;

public class PersonOutOfAgeException extends Exception{
	int ageSpecified;

	

	public PersonOutOfAgeException(int ageSpecified) {
		super();
		this.ageSpecified = ageSpecified;
	}

	@Override
	public String toString() {
		return "PersonOutOfAgeException [ageSpecified=" + ageSpecified + "]";
	}

	
	
}
