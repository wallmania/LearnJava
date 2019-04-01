package wallmania;

public class J21AbstractClass2 {
	
	public static void main(String[] args){	
		Tiger tiger = new Tiger("Hodol");
		Dog dog = new Dog("Mikey");
		
		tiger.cry(); tiger.behavior(); System.out.println(">> Tiger's Name (" + tiger.animalName + ")");		
		dog.cry(); dog.behavior(); System.out.println(">> Dog's Name (" + dog.animalName + ")");	
	}
}

abstract class Animal {	
	String animalName;	
	
	Animal(String name) { animalName = name; }	
	
	public abstract void cry(); 
	public abstract void behavior();
}

class Tiger extends Animal {	
	public Tiger(String name) {	 super(name);  } 
	
	@Override	
	public void cry() {	System.out.println(">> Tiger's method, cry() is executed : '어흥'"); } 
	@Override	
	public void behavior() { System.out.println(">> Tiger's method, behavior() is executed : 'Move Fast'");	}
}

class Dog extends Animal {	
	public Dog(String name) { super(name); }	
	
	@Override	
	public void cry() {	System.out.println(">> Dog's method, cry() is executed : '멍멍'"); } 
	@Override	
	public void behavior() { System.out.println(">> Dog's method, behavior() is executed : 'Move Slowly'");	} 
}




