package Exercise4_3;

public class HoneyDew extends Fruit {
	
	private char grade;
	private int ripe;
	
	public HoneyDew() {
		
		super();
		grade = '-';
		ripe = 0;
	}
	
	public HoneyDew(String N, char G, int R) {
		
		super(N);
		grade = G;
		ripe = R;
		
	}
	
	public int TotalRipe() {
		return ripe - 4;
	}
	
	public int TotalRipe(int R) {
		return ripe + 10;
	}
	
	public int TotalRipe(int R, int X) {
		return ripe * X;
	}
	
	public char getGrade() {
		return grade;
	}
	
	public int getRipe() {
		return ripe;
	}
	
	public String printDetail() {
		return ("Honey Dew can reduce blood pressure");
	}
	
	public String toString() {
		return super.toString() + ("\nHoney Dew Constructor is Invoked" + "\nGrade: " + grade + "\nQuantity of Ripe: " + ripe + "\nTotal Ripe: " + TotalRipe() + "\nTotal Ripe: " + TotalRipe(30) + "\nTotal Ripe: " + TotalRipe(30, 5));
	}

}
