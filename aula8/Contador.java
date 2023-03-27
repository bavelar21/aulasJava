package aula8;

public class Contador {
	private int number;
	
	public Contador() {
		
	}
	
	public Contador(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int zero() {
		number = 0;
		return number = 0;
	}
	
	public int increment() {
		number++;
		return number;
	}
	
	public int decrement() {
		number--;
		return number;
	}
	
	public int some(int value) {
		number += value;
		return number;
		
	}
}
