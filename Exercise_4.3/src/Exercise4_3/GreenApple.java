package Exercise4_3;

public class GreenApple extends Apple {
	
	private int seed;
	private int protein;
	
	public GreenApple() {
		
		super();
		seed = 0;
		protein = 0;
	}
	
	public GreenApple(String N, int Q, int P, int S, int Pr) {
		
		super(N, Q, P);
		seed = S;
		protein = Pr;
		
	}
	
	public int getSeed() {
		return seed;
	}
	
	public int getProtein() {
		return protein;
	}
	
	public int TotalSeed() {
		return seed * (quantity - 5);
	}
	
	public int TotalSeed(int S) {
		return seed * (quantity + 8);
	}
	
	public int TotalSeed(int S, int Q) {
		return seed * quantity;
	}
	
	public int TotalProtein() {
		return quantity * protein;
	}
	
	public String printDetail() {
		return ("Green Apple can help in digestion");
	}
	
	public String toString() {
		return super.toString() + ("\nGreen Apple Constructor is Invoked" + "\nQuantity Seed: " + seed + "\nProtein: " + protein + " g" + "\nTotal Seed: " + TotalSeed() + "\nTotal Seed: " + TotalSeed(6) + "\nTotal Seed: " + TotalSeed(6, 20) + "\nTotal Protein: " + TotalProtein() + " g");
	}

}
