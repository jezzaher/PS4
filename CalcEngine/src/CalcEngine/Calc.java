package CalcEngine;

public class Calc {
	public double FutureVal1(double starting, double years, double rate) {
		double AmntCalculated=starting * Math.pow((1 + rate/100), years);
		return AmntCalculated;
	}
}
