package p1;

public class PersonAge {
	Person person;

	public PersonAge(Person person) {
		super();
		this.person = person;
	}
	
	public boolean validate(int ageValue) throws PersonOutOfAgeException
	{
		int checkAge=person.getAge();
		boolean status =true;
		if(checkAge>=ageValue)
		{
			status =false;
			throw new PersonOutOfAgeException(ageValue);
			
		}
		return status;
	}
	
}
