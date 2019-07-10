package rational;

public class RationalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rational r1 = new Rational(1, 2);
		Rational r2 = new Rational(3, 4);
		Rational result = r1.add(r2);
		System.out.println(r1.toString() + "+" + r2.toString() + "=" + result.toString());

	}

}
