package util;

public class CurrencyConverter {

	public static double IOF = 0.06;
	
	public static double valor(double dollar, double total) {
		return dollar * total * (1.0 + IOF);
	}
}
