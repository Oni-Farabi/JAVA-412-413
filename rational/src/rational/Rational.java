package rational;

public class Rational {
	
	private int numerator=0;
	private int denominator=1;
	
	public Rational() {
		
	}

	public Rational(int numerator, int denominator) {
		
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	Rational add(Rational other)
	
	{
		int a = this.numerator;
		int b = this.denominator;
		int c = other.numerator;
		int d = other.denominator;
		int newNum = a * d + b * c;
		int newDeNum = b * d;
		Rational result = new Rational(newNum, newDeNum);
		return result;
	}
	public String toString() {
		return this.numerator + "/" + this.denominator;
	}
	
	
	

}
