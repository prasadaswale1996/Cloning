package cloning.deep;

public class Address implements Cloneable {

	String city;
	String country;
	int pin;
	
	public Address()	//no arg con.
	{
		
	}
	
	public Address (String city, String country, int pin ) {
		this.city= city;
		this.country= country;
		this.pin= pin;
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", pin=" + pin + "]";
	}
	
	
	
}
