package cloning.deep;

public class Student implements Cloneable {

	int roll;
	String name;
	Address add;
	
	public Student()	//no arg con.
	{
		
	}
	
	public Student (int roll, String name, Address add)
	{
		this.roll= roll;
		this.name= name;
		this.add= add;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", add=" + add + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		Student dummyStd = (Student) super.clone();  	//create dummy copy of student using clone
		//why we do casting?
		
		Address addr = (Address) add.clone();	//create dummy copy of Address using clone
		
		dummyStd.add = addr; 	//assign address copy to dummy student object
		return dummyStd;	//return dummy student
	}
		
	// AFTER PUSHING TO GITHUB
}
