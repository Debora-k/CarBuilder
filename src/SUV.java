import java.util.Scanner;

public class SUV extends Car {
	private boolean FWD;
	private boolean backdoorTire;
	
	
	public boolean isFWD() {
		return FWD;
	}
	public void setFWD(boolean fWD) {
		FWD = fWD;
	}
	public boolean isBackdoorTire() {
		return backdoorTire;
	}
	public void setBackdoorTire(boolean backdoorTire) {
		this.backdoorTire = backdoorTire;
	}
	
	public void specialBuild() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Would you like to have four wheel drive for your SUV? (true / false)");
		boolean FWD = input.nextBoolean();
		this.setFWD(FWD);
	
		System.out.println("Would you like to get a back door tire? (true / false)");
		boolean backdoorTire = input.nextBoolean();
		this.setBackdoorTire(backdoorTire);
	
	}
	
	public String toString() {
		return super.toString() + " it is four wheel drive: " + this.FWD + " has a backdoor tire: " + this.backdoorTire;
	}
}
