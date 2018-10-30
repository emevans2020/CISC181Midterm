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
	    Rectangle rec1 = new Rectangle(10, 10);
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
	@Test
	public void CubConstructorTest() {
		Cuboid cuboid = new Cuboid (3,4,5);
		assertTrue (cuboid instanceof Cuboid);
	}
	
	@Test
	public void CuboidGetterTest() {
		Cuboid cube = new Cuboid (2,3,5);
		assertEquals (cube.getiWidth(),2);
		assertEquals (cube.getiLength(),3);
		assertEquals (cube.getiDepth(),5);
	}
	
	@Test
	public void CuboidSetterTest() {
		Cuboid cube = new Cuboid (2,3,5);
		cube.setiDepth(8);
		assertEquals (cube.getiDepth(),8);
	}
	
	@Test
	public void CubeAreaTest() {
		Cuboid cube = new Cuboid (2,3,5);
		assertEquals (cube.area(),62.0);
	}
	
	@Test
	public void CubePerimeterTest() {
		boolean thrown = false;
		Cuboid cube = new Cuboid (2,3,4);
		
		try {
			cube.perimeter();
		}
		
		catch (UnsupportedOperationException e) {
		    thrown = true;
		  }
		  assertTrue(thrown);
		}
	
	@Test
	public void SortByAreaTest() {
	    Cuboid cubeOne = new Cuboid(2,2,2);
	    Cuboid cubeTwo = new Cuboid(3,4,6);
	    if (cubeOne.compareTo(cubeTwo) == 0) {
	        System.out.println("Similar cuboid.");
	    } 
	    else if(cubeOne.compareTo(cubeTwo) == 1) {
	        System.out.println("First cuboid bigger than second.");
	    } 
	    else {
	        System.out.println("Second cuboid is bigger than first.");
	    }
	}
	
	@Test
	public void SortByVolumeTest() {
	    Cuboid cub1 = new Cuboid(2,2,2);
	    Cuboid cub2 = new Cuboid(3,4,6);
	    if (cub1.compareTo(cub2) == 0) {
	        System.out.println("Similar Cuboids.");
	    } 
	    else if(cub1.compareTo(cub2) == 1) {
	        System.out.println("First Cuboid bigger than second.");
	    } 
	    else {
	        System.out.println("Second Cuboid is bigger than first.");
	    }
	}

}
