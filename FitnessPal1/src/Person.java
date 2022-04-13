
public class Person {
//Attributes private
private	 String firstName;
private String lastName;
private char lastNameInitial;
private int age;
private double weight; //Assume weight is in pounds
private int feet;
private int inches; /**
* @return the bMI
*/ /**
* @param bMI the bMI to set
*/ /**
* @return the bMILevel
*/ /**
* @param bMILevel the bMILevel to set
*/ public Person(String firstName, String lastName, int age, double weight, int feet, int inches) {
super();
this.firstName = firstName;
this.lastName = lastName;
this.age = age;
this.weight = weight;
this.feet = feet;
this.inches = inches;
}
public Person(String firstName, char lastNameInitial, double weight, int feet, int inches) {
super();
this.firstName = firstName;
this.lastNameInitial = lastNameInitial;
this.weight = weight;
this.feet = feet;
this.inches = inches;
}
public Person(String firstName, String lastName, char lastNameInitial, int age, double weight, int feet,
int inches) {
super();
this.firstName = firstName;
this.lastName = lastName;
this.lastNameInitial = lastNameInitial;
this.age = age;
this.weight = weight;
this.feet = feet;
this.inches = inches;
}
public Person(String firstName, String lastName, double weight, int feet, int inches) {
super();
this.firstName = firstName;
this.lastName = lastName;
this.weight = weight;
this.feet = feet;
this.inches = inches;
}
public String getFirstName() {
return firstName;
}
/**
* @param firstName the firstName to set
*/
public void setFirstName(String firstName) {
this.firstName = firstName;
} //@Override
//public String toString() {
//return "Person [firstName=" + firstName + ", weight=" + weight + ", feet=" + feet + ", inches=" + inches + "]"; //return "Person [firstName=" + firstName + ", BMI=" + BMI + ", BMILevel=" + BMILevel +" ]";
 public String CalulateBMI() {
{ int heightInInches = 0;
int heightInches =( feet*12);
double BMI =(weight*703)/(heightInInches*heightInInches);
String BMILevel = "";
if(BMI < 18.5) {
BMILevel= "Under weight";
}else if (BMI==18.5 && BMI==24.9) {
System.out.println("You are normal");
}else if (BMI >25 && BMI <29.9) {
System.out.println("You are overweight");
}else {
System.out.println("You are obese");
} return BMI + ":" + BMILevel; }
 }
}
/**
* @return the firstName
*/ 



