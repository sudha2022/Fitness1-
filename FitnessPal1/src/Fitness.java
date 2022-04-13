
public class Fitness {

	
	
	public static void main(String[] args) {
	//String firstName, char lastNameInitial, double weight, int feet, int inches
	//creating objects
	Person person1 = new Person("Tom",'H',152.5,5,6); 
	System.out.println(person1.getFirstName());
	System.out.println(person1.CalulateBMI());//creating objects
	Person lesile = new Person("Lesile","Knope",'k',32,122.9,4,11); 
	System.out.println(lesile.getFirstName());
	System.out.println(lesile.CalulateBMI());//creating objects
	Person man = new Person("Ron","Swanson",222.2,6,0);
	System.out.println(man.getFirstName()); 
	System.out.println(man.CalulateBMI());//creating objects
	Person woman = new Person("April","Ludgate",110.5,5,5); 
	System.out.println(woman.getFirstName());
	System.out.println(woman.CalulateBMI()); }
	}


