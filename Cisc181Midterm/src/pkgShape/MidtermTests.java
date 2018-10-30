package pkgShape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MidtermTests {
	/** Rectangle Tests
	 * 
	 */
	@Test
	public void RecConstructorTest() {
		Rectangle rec = new Rectangle (3,4);
		assertTrue (rec instanceof Rectangle);
	}
	
	//Tests the getters of Rectangle
	@Test
	public void RecGetterTests() {
		Rectangle rec1 = new Rectangle (4,5);
		
		assertEquals(rec1.getiWidth(),4);
		assertEquals(rec1.getiLength(),5);
	}
	// Tests the setters of Rectangle
	@Test
	public void RecSetterTest() {
		Rectangle recTest = new Rectangle (2,2);
		recTest.setiLength(5);
		recTest.setiWidth(6);
		
		assertEquals(recTest.getiLength(),5);
		assertEquals(recTest.getiWidth(),6);
	}
	
	//test area of rectangle
	@Test
	public void TestArea() {
		int iExpectedArea = 25;
		// Create instance to test
		Rectangle rec = new Rectangle(5, 5);

		// Compare expected value with actual value
		assertEquals(iExpectedArea, rec.area(), 0.01);
	}
	
	//test perimeter of rectangle
	@Test
	public void TestPerimeter() {
		int iExpectedPerimeter = 16;

		// Create instance to test
		Rectangle rec = new Rectangle(4, 4);

		// Compare expected value with actual value
		assertEquals(iExpectedPerimeter, rec.perimeter(), 0.01);
	}
	
	//tests the compareTo method
	@Test
	public void TestCompareTo() {
	    Rectangle rec1 = new Rectangle(2, 2);
	    Rectangle rec2 = new Rectangle(4, 6);
	    if (rec1.compareTo(rec2) == 0) {
	        System.out.println("Similar rectangles.");
	    } 
	    else if(rec1.compareTo(rec2) == 1) {
	        System.out.println("First rectangle bigger than second.");
	    } 
	    else {
	        System.out.println("Second rectangle is bigger than first.");
	    }
	}

	/** Cuboid Tests
	 * 
	 */
	public void CubConstructorTest() {
		
	}
	

}
