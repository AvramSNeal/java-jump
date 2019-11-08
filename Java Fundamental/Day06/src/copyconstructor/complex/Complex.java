package copyconstructor.complex;

public class Complex {
	private double real, imag;
	
	public Complex(double re, double im) {
		this.real = re;
		this.imag = im;
	}
	
	public Complex(Complex c){
		System.out.println("Copy constructor called");
		real = c.real;
		imag = c.imag;
	}
	
	public String toString() {
		return "(" + real + "+" + imag + "i)";
	}
	
	public boolean equals(Object obj) {
		if(obj==this) {
			return true;
		}
		if(obj==null||obj.getClass()!=this.getClass()) {
			return false;
		}
		
		Complex complex = (Complex) obj;
		return (this.real==complex.real && this.imag==complex.imag);
	}
}
