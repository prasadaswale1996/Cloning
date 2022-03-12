package cloning.deep;

public class TestDeepClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address add = new Address ("Pune", "IND", 411048);
		
		Student s1 = new Student(10, "RAM", add);
		System.out.println("Original S1 ="+s1);
		
		Student s2 = (Student) s1.clone();
		System.out.println("Cloned S2="+s2);
		
		System.out.println(" ");
		
		s1.add.city = "MUMBAI";
		s1.add.pin = 400060;
		
		System.out.println("Original S1 after change="+ s1);
		System.out.println("Cloned S2 after change in original="+ s2);
	
		// hashcode
		System.out.println("S1 hashcode ="+s1.hashCode()+"S1-address hashcode="+s1.add.hashCode());
		System.out.println("S2 hashcode ="+s2.hashCode()+"S2-address hashcode="+s2.add.hashCode());
	
	
	}
	
	
	// AFTER PUSHING TO GITHUB
}
