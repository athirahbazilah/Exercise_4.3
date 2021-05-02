package Exercise4_3;

public class Strawberry extends Fruit {
	
	private String colour;
	private int weight;
	
	public Strawberry() {
		
		super();
		colour = "-";
		weight = 0;
	}
	
	public Strawberry(String N, String C, int W) {
		super(N);
		colour = C;
		weight = W;
		
	}
	
	public int TotalWeight() {
		return weight - 3;
	}
	
	public int TotalWeight(int W) {
		return weight + 6;
	}
	
	public int TotalWeight(int W, int X) {
		return weight * X;
	}
	
	public String getColour() {
		return colour;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public String printDetail() {
		return ("Strawberry contains a lot of manganese");
	}
	
	public String toString() {
		return super.toString() + ("\nStrawberry Constructor is Invoked" + "\nColour: " + colour + "\nWeight: " + weight + " g" + "\nTotal Weight: " + TotalWeight() + " g" + "\nTotal Weight: " + TotalWeight(12) + " g" + "\nTotal Weight: " + TotalWeight(12, 2) + " g");
	}

}
