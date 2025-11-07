package java17;

public sealed class Rectangle extends Shape permits TwoDShape {

	// only TwoDShape class can extend it 
	
	double width, height;

	Rectangle(double w, double h) {
		this.width = w;
		this.height = h;
	}
}
