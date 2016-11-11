
public class Circulo extends FiguraGeometrica{
	double radio;
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getArea() {
		return radio = (radio*radio)*3.14;
	}

	protected Circulo(String color, double radio){
		super(color);
		this.radio = radio;
	}

}
