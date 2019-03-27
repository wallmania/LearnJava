package program.middle;

public class Car {
	public String name; 
	public int capacity; 
	public int price; 
	public int age;
	
	// Constructor 생성.
	public Car(String name, int capacity, int price, int age) {
		this.name = name;
		this.capacity = capacity;
		this.price = price;
		this.age = age;
	}
	
	// .toString()
	public String toString() {
		return name;
	}
}
