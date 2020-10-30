package rectangle;

public class Rectangle {

	private double width;
	private double height;

	public Rectangle() {

	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double area() {
		return width * height;
	}

	public double perimeter() {
		return 2 * (width + height);
	}

	public double diagonal() {
		return Math.sqrt(width * width + height * height);
	}

	@Override
	public String toString() {
		return "�rea = " + String.format("%.2f", area()) + "\n" + "Perimetro = " + String.format("%.2f", perimeter())
				+ "\n" + "Diagonal = " + String.format("%.2f", diagonal());
	}

}
