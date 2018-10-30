package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle implements Comparable<Object>{
	private int iDepth;
	
	public Cuboid(int width, int length, int depth) {
		super(width, length);
		this.iDepth = depth;
	}
	
	public int getiDepth() {
		return this.iDepth;
	}
	
	public void setiDepth(int depth) {
		this.iDepth = depth;
	}
	
	/**will be the surface area of cube, overrides basic area
	 * 
	 */
	@Override
	public double area() {
		return (2*(this.getiLength()*this.getiWidth()))+
			(2*(this.getiLength()*this.getiDepth()))+ 
			(2*(this.getiWidth()*this.getiDepth()));
	}
	
	/** return double type of volume Height x width x length
	 * 
	 * @return
	 */
	public double volume() {
		return this.getiDepth()*this.getiLength()*this.getiWidth();
	}
	
	/** because perimeter is invalid throw exception
	 * 
	 * @author emilyevans
	 *
	 */
	@Override
	public double perimeter() throws UnsupportedOperationException {
		throw new UnsupportedOperationException("This operation is invalid");
	}
	
	/**implements the compareTo method for surface areas of cuboid
	 * 
	 */
	@Override
	public int compareTo (Object o) {
        return (int) (this.area() - (((Cuboid) o).area())); 
	}
	
	
	class SortByArea implements Comparator <Cuboid>{
		@Override
		public int compare(Cuboid o1, Cuboid o2) {
			if (o1.area() < o2.area()) {
	        	return -1;
	        }
	        if (o1.area() > (o2.area())) {
	        	return 1;
	        }
	        else
	        	return 0;
		}
	}
	
	class SortByVolume implements Comparator <Cuboid>{
		public int compare(Cuboid cubeOne, Cuboid cubeTwo) 
	    { 
	        return (int) (cubeOne.volume() - (cubeTwo.volume())); 
		} 
	}
}
