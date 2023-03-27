package aula8;

public class Retangulo {
	private int side1;
	private int side2;
	
	public Retangulo() {
		
	}
	
	public Retangulo(int side1, int side2) {
		this.side1 = side1;
		this.side2 = side2;
	}
	
	public void getSide1(int side1) {
		this.side1 = side1;
	}
	
	public void getSide2(int side2) {
		this.side2 = side2;
	}
	
	public int calculateArea() {
		return 2*(side1 + side2);
	}
	
	public int calculatePerimeter() {
		return 2*(side1 + side2);
	}
}
