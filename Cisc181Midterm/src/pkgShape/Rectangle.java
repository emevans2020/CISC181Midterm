package pkgShape;

public class Rectangle extends Shape implements Comparable<Object>{
	
	/** attributes that can only be accessed through getters/setters
	 * 
	 */
	
	private int iWidth;
	private int iLength;
	
	/** constructor with parameters width and length
	 * 
	 * @param width
	 * @param length
	 */
	public Rectangle (int width, int length) {
		super();
		this.iWidth = width;
		this.iLength = length;
	}
	
	public int getiWidth() {
		return this.iWidth;
	}
	
	public void setiWidth (int width) {
		this.iWidth = width;
	}
	
	public int getiLength () {
		return this.iLength;
	}
	
	public void setiLength (int length) {
		this.iLength = length;
	}
	
	@Override
	public double area() {
		return this.iLength*this.iWidth;
	}
	
	@Override
	public double perimeter() {
		return 2*(this.iLength+this.iWidth);
	}


	// need to work on compareTo
	@Override
	public int compareTo(Object o) {
        if (this.area() <((Rectangle) o).area()) {
        	return -1;
        }
        else if (this.area() > ((Rectangle)o).area()) {
        	return 1;
        }
        else
        	return 0;
	}
}