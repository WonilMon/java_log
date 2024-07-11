package chapter14.Equals;

public class Rectangle {
	
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.height = height;
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Rectangle r = (Rectangle)obj;
		boolean result = (width==r.width)&&(height==r.height);
		
		return result;
	}
	
}
 