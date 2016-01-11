
public class Rectangle {
	private double width;
	private double height;

	public Rectangle () {
		width = 1;
		height = 1;
	}

	public Rectangle (double newwidth, double newheight) {
		this.width = newwidth;
		this.height = newheight;
	}
	
	double getArea() {
		return width * height;
	}
	
	double getPerimeter() {
		return 2 * width * height;
	}
	
	public void setWidth(double newWidth) {
		this.width = newWidth;
	}
	
	public void setHeight(double newHeight) {
		this.height = newHeight;
	}
}
