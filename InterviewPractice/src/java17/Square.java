package java17;

public non-sealed class Square extends Shape {

	// any other class can extend it 
	
	double width, height;

	Square(double w, double h) {
		this.width = w;
		this.height = h;
	}

}
