import java.util.Scanner;

public class Truck extends Car {
	private boolean bedCover;
	private int seats;
	
	
	public boolean isBedCover() {
		return bedCover;
	}
	public void setBedCover(boolean bedCover) {
		this.bedCover = bedCover;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	public void specialBuild() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Would you like to add bed cover for your truck? (true / false)");
		boolean bedCover = input.nextBoolean();
		this.setBedCover(bedCover);
		
		System.out.println("How many seats would you like to have? (mininum 2 seats)");
		int seats = input.nextInt();
		while(seats < 2) {
			System.out.println("ERROR: The seats must be mininum 2. Try again!");
			seats = input.nextInt();
		}
		this.setSeats(seats);
	}
	
	public String toString() {
		return super.toString() + " has a bed cover: " + this.bedCover + " how many seats: " + this.seats;
	}
}
