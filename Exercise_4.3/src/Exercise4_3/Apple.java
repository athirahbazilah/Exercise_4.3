package Exercise4_3;

public class Apple extends Fruit {
	
	protected int quantity;
	protected int price;
	
	public Apple() { //constructor for sub class
		
		super(); //inherit from super class (constructor with no argument)
		quantity = 0;
		price = 0;
	}
	
	public Apple(String N, int Q, int P) { //constructor sub class with argument
		
		super(N); //called method in superclass with passing parameter
		quantity = Q;
		price = P;
		
	}
	
	public int TotalPrice() { //overloading with no argument
		return (quantity - 2) * price;
	}
	public int TotalPrice(int P) { //overloading with one argument
		return (price - 1) * quantity;
	}
	
	public int TotalPrice(int Q, int P) { //overloading with 2 argument
		return quantity * price;
	}
	
	public String printDetail() { 
		return ("Apple can lower high cholesterol");
	}
	
	public String toString() {
		return super.toString() + ("\nApple Constructor is Invoked" + "\nQuantity: " + quantity + "\nPrice: RM " + price + "\nTotal Price: RM " + TotalPrice() + "\nTotal Price: RM " + TotalPrice(6) + "\nTotal Price: RM " + TotalPrice(7, 6));
	}
	

}
