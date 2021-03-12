package p3;
import java.io.*;

public class Salary {

	private int Sal;
	String name;
	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Salary(int sal, String name) {
		super();
		Sal = sal;
		this.name = name;
	}
	public int getSal() {
		return Sal;
	}
	public void setSal(int sal) {
		Sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Salary [Sal=" + Sal + ", name=" + name + "]";
	}
	
}
