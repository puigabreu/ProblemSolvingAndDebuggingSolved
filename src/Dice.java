
public class Dice {
	
	private int sides;
	private int sideUp;
	
	public Dice(int sides) {
		this.sides = sides;
		this.sideUp = (int)(Math.random() * 5) + 1;
	}
	
	// getter
	public int getSides() {
		return this.sides;
	}
	
	public int getSideUp() {
		return this.sideUp;
	}
	
	// Implement a method to roll the dice
	public int roll() {
		this.sideUp = (int)(Math.random() * (sides)) + 1;
		return this.sideUp;
	}
	
	// Implement a method to roll the dice until a given side is up.
	public int timesToRoll(int side) {
		int count = 0;
		while(this.sideUp != side) {
			this.roll();
			count++;
		}
		
		return count;
		
	}

}
