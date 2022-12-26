import java.util.Scanner;

public class Car {
	private String color;
	private boolean sunRoof;
	private boolean automaticTrans;
	

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isSunRoof() {
		return sunRoof;
	}
	public void setSunRoof(boolean sunRoof) {
		this.sunRoof = sunRoof;
	}
	public boolean isAutomaticTrans() {
		return automaticTrans;
	}
	public void setAutomaticTrans(boolean automaticTrans) {
		this.automaticTrans = automaticTrans;
	}
	
	public String toString() {
		return "Color: " + this.color + " has sunroof: " + this.sunRoof + " is automatic transmission: " + this.automaticTrans;
	}
	
	
	public void build() {
		//ask the user what color
		System.out.println("Which color of car would you like to choose?");
		Scanner input = new Scanner(System.in);
		
		String color = input.nextLine();
		this.setColor(color);
		
		//ask the user whether adding sun roof or not
		System.out.println("Would you like to add sunroof for your car? (true / false)");
		boolean sunRoof = input.nextBoolean();
		this.setSunRoof(sunRoof);
		
		//ask the user whether automatic transmission or not
		System.out.println("Would you like to choose automatic transmission? (true / false)");
		boolean automaticTrans = input.nextBoolean();
		this.setAutomaticTrans(automaticTrans);
	}
	
	public void specialBuild() {
		// TODO Auto-generated method stub
		
	}
	
}
