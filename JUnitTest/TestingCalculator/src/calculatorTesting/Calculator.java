package calculatorTesting;

public class Calculator {

	public static void main(String[] args) {
		Calculator cal =new Calculator();
		int sum = cal.sum(4, 3);
		int sub = cal.sub(4, 3);
		int mul = cal.mul(4, 3);
		double div = cal.div(4, 3);
		double square = cal.square(2.25);
		double power=cal.powerValue(4, 3);
		double squareRootValue=cal.squareRootValue(4);
		double logValue= cal.logValue(15);
		double log2Value=cal.log2Value(15);
		double sinValue=cal.sinValue(45);
		double cosValue=cal.cosValue(45);
		
		System.out.println("sum is : "+sum);
		System.out.println("sub is : "+sub);
		System.out.println("mul is : "+mul);
		System.out.println("div is : "+div);
		System.out.println("square is : "+square);
		System.out.println("power value  is : "+power);
		System.out.println("squareRootValue value  is : "+squareRootValue);
		System.out.println("log value value  is : "+logValue);
		System.out.println("log2 base value   is : "+log2Value);
		System.out.println("sin value   is : "+sinValue);
		System.out.println("sin value   is : "+cosValue);
		
	}
	public int sum(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
	
	/*public int div(int a, int b) {
		return a/b;
	}*/
	public double div(double a, double b) {
		return a/b;
	}
	
	public double square(double a) {
		return a*a;
	}
	
	public double powerValue(double a, double b) {
		return Math.pow(a, b);
	}
	public double squareRootValue(double a) {
		return Math.sqrt(a);
	}
	
	public double logValue(double a) {
		return Math.log(a);
	}
	
	public double log2Value(double a) {
		return (Math.log(a)/ Math.log(2) );
	}
	
	public double sinValue(double angle) {
		angle=Math.toRadians(angle);
		return Math.sin(angle);
	}
	public double cosValue(double angle) {
		angle=Math.toRadians(angle);
		return Math.cos(angle);
	}
	
	

}
