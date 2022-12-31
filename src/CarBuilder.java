import java.util.Scanner;

public class CarBuilder {

	public static void main(String[] args) {
		Car car;
		
		System.out.println("What type of car would you like to build? (Truck / SUV)");
		Scanner input = new Scanner(System.in);
		String carType = input.nextLine();
		
		if(carType.equals("Truck")) {
			car = new Truck();
		} else if(carType.equals("SUV")) {
			car = new SUV();
		} else {
			System.out.println("Please enter either Truck or SUV");
			return;
		}
		
		car.build();
		car.specialBuild();
		
		System.out.println("Your car order is: ");
		System.out.println(car);
		
	}

}
