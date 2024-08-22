package practice;

public class Person {
int id;
String name;
Person(){
	System.out.println("in parent");	
}
public Person(int id, String name) {
	this.id=id;
	this.name=name;
	System.out.println("parameterized const"+ this.id+" "+this.name+" ");
	
}
}
