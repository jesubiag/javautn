
public class Employee extends Customer {

	private long employId;

	public long getEmployId() {
		return employId;
	}

	public void setEmployId(long employId) {
		this.employId = employId;
	}
	
	public String toString()
	{
		return "[Employee] " + super.toString();	//devuelve la cadena + lo que trae del método del padre
	}
}
