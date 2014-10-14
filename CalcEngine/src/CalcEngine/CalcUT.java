package CalcEngine;

import static org.junit.Assert.*;

import org.junit.Test;


public class CalcUT  {
	@Test
	public final void test() {
		Calc test = new Calc();
		double result = test.FutureVal1(10000.00, 5.0, 3.00);
		assertEquals(11008.00,result,.001);
	}
	@Test
	public final void test1() {
		Calc test1 = new Calc();
		double result1 = test1.FutureVal1(10000.00, 10.0, 5.00);
		assertEquals(16105.00,result1,.001);
	}
	
}
