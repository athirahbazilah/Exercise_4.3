package Exercise4_3;

public class Fruit {
	
	protected String name;
	
	public Fruit() { //constructor with no argument
		name = "-";
	}
	
	public Fruit(String N) { //constructor with argument
		this.name = N;
		
	}
	
	public String getName() {
		return name;
	}
	
	public String printDetail() { //overriding with parameter
		return ("Fruit contains a lot of vitamins");
	}
	
	public String toString() { //overriding method
		return ("Name: " + name + "\nFruit Constructor is Invoked");
	}


}
