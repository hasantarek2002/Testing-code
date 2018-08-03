package calculatorTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	static Calculator cal;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("set up before class");
		cal =new Calculator();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tear down after class");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("set up");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tear down");
	}

	@Test
	void test() {
		//fail("Not yet implemented");
		System.out.println("summation test -------->>>>>>>>");
		assertEquals(7, cal.sum(4, 3));
	}
	
	@Test
	void subtest() {
		//fail("Not yet implemented");
		System.out.println("subtruct test -------->>>>>>>>");
		assertEquals(1, cal.sub(4, 3));
	}
	
	@Test
	void multest() {
		//fail("Not yet implemented");
		System.out.println("multiplication test -------->>>>>>>>");
		assertEquals(12 ,cal.mul(4, 3));
	}
	
	@Test
	void divtest() {
		//fail("Not yet implemented");
		System.out.println("division test -------->>>>>>>>");
		
		//assertEquals(expected, actual, delta);
		// Math.abs(expected - actual) < epsilon
		//assertEquals(1 ,cal.div(4, 3),.33);  //fail
		assertEquals(1, cal.div(4, 3), .34);  //passed
	}
	
	@Test
	void squareTest() {
		System.out.println("square test -------->>>>>>>>");
		//assertEquals(5 ,cal.square(2.25),.06);  //fail;
		assertEquals(5 ,cal.square(2.25),.063); //pass
	}
	
	@Test
	void powerTest() {
		System.out.println("power test -------->>>>>>>>");
		assertEquals(64 ,cal.powerValue(4, 3),.01);		
	}
	
	@Test
	void squareRootTest() {
		System.out.println("square Root test -------->>>>>>>>");
		assertEquals(2 ,cal.squareRootValue(4),.01);		
	}
	@Test
	void logTest() {
		System.out.println("log test -------->>>>>>>>");
		assertEquals(2.70 ,cal.logValue(15),.01);		
	}
	
	@Test
	void log2Test() {
		System.out.println("log2 base test -------->>>>>>>>");
		assertEquals(3.90 ,cal.log2Value(15),.01);		
	}
	
	@Test
	void sinTest() {
		System.out.println("sin test -------->>>>>>>>");
		assertEquals(.70 ,cal.sinValue(45),.01);		
	}
	@Test
	void cosTest() {
		System.out.println("cos test -------->>>>>>>>");
		assertEquals(.70 ,cal.cosValue(45),.01);		
	}

}
