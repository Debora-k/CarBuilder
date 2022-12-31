import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class TestTruck {

	@Test
	void testToString() {
		Truck truck = new Truck();
		String result = truck.toString();
		assertEquals( "Color: null has sunroof: false is automatic transmission: false" +
				 " has a bed cover: false how many seats: 0", result);
	}

	@Test
	void testSpecialBuild_true() {
		System.setIn(new ByteArrayInputStream("true\n2".getBytes()));
		Truck truck = new Truck();
		
		truck.specialBuild();
		
		assertTrue(truck.isBedCover());
		assertEquals(2, truck.getSeats());
	}
	
	@Test
	void testSpecialBuild_false() {
		System.setIn(new ByteArrayInputStream("false\n5".getBytes()));
		Truck truck = new Truck();
		
		truck.specialBuild();
		
		assertFalse(truck.isBedCover());
		assertEquals(5, truck.getSeats());
	}
	
	@Test
	void testSpecialBuild_retrySeats() {
		System.setIn(new ByteArrayInputStream("true\n1\n3".getBytes()));
		Truck truck = new Truck();
		
		truck.specialBuild();
		
		assertTrue(truck.isBedCover());
		assertEquals(3, truck.getSeats());
	}

}