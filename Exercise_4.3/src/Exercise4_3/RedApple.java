package Exercise4_3;

public class RedApple extends Apple {
	
	private String taste;
	private int calories;
	
	public RedApple() {
		
		super();
		taste = "-";
		calories = 0;
	}
	
	public RedApple(String N, int Q, int P, String T, int C) {
		super(N, Q, P);
		taste = T;
		calories = C;
		
	}
	
	public String getTaste() {
		return taste;
	}
	
	public int getCalories() {
		return calories;
	}
	
	public int TotalCalories() {
		return (calories - 10) * quantity;
	}
	
	public int TotalCalories(int C) {
		return (calories + 16) * quantity;
	}
	
	public int TotalCalories(int C, int Q) {
		return calories * quantity;
	}
	
	public String printDetail() {
		return ("Red Apple can lower risk of diabetes");
	}
	
	public String toString() {
		return super.toString() + ("\nRed Apple Constructor is Invoked" + "\nTaste: " + taste + "\nCalories: " + calories + "\nTotal Calories: " + TotalCalories() + "\nTotal Calories: " + TotalCalories(95) + "\nTotal Calories: " + TotalCalories(95, 15));
	}

}
