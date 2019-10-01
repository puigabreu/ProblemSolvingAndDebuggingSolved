public class Party {
	
	private int capacity;
	private int guestNumber;
	private String[] guests;
	private int timeElapsed;
	
	
	// A constructor for a Party. Assumes that guests.length = capacity and that
	// there are no null entries. Uses copy method
	public Party(String[] guests) {
		this.capacity = guests.length;
		this.guests = copy(guests);
		this.timeElapsed = 0;
		this.guestNumber = capacity;
	}
	
	// Causes an hour to pass in the party. Each hour, a guest leaves.
	// Once half the capacity of hours have passed, everyone leaves.
	public void timePasses() {
		this.timeElapsed++;
		guestNumber--;
		guests[guestNumber] = null;
		
		if(this.timeElapsed > capacity/2) {
			this.guests = new String[capacity]; 
			this.guestNumber = 0;
		}
	}
	
	// Helper method to print array
	public static void printArray(String[] arr) {
		for(int i = 0; i < arr.length && arr[i] != null; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	// Implement a static method to create a deep copy of the array so the
	// array given in the constructor isn't affected
	public static String[] copy(String[] guests) {
		String[] finalArray = new String[guests.length];
		for(int i = 0; i < guests.length; i++)
			finalArray[i] = guests[i];
		return finalArray;
	}
	
	public static void main(String[] args) {
		String[] guests = {"Maria", "Jorge", "Fatima", "Orlando", "Carola", "Alex"};
		printArray(guests);
		Party party = new Party(guests);
		party.timePasses();
		printArray(guests);
	}

}
