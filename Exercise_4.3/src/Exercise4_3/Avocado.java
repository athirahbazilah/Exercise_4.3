package Exercise4_3;

public class Avocado extends Apple {
	
private int rotten;
	
	public Avocado() {
		
		super();
		rotten = 0;
	}
	
	public Avocado(String N, int Q, int P, int R) {
		
		super(N, Q, P);
		rotten = R;
		
	}
	
	public int getRotten() {
		return rotten;
	}
	
	public int TotalGood() {
		return quantity - (rotten + 5);
	}
	
	public int TotalGood(int R) {
		return quantity - (rotten - 3);
	}
	
	public int TotalGood(int R, int Q) {
		return (quantity * 2) - rotten;
	}
	
	public int TotalPrice() {
		return (quantity * price) - (rotten * price);
	}
	
	public String printDetail() {
		return ("Avocado can protect heart disease");
	}
	
	public String toString() {
		return super.toString() + ("\nAvocado Constructor is Invoked" + "\nQuantity Rotten: " + rotten + "\nTotal Good: " + TotalGood() + "\nTotal Good: " + TotalGood(3) + "\nTotal Good: " + TotalGood(3, 10));
	}

}
