package util;

public class CurrencyConvert {
	public static final double IOF =0.06;

	 
	public static double Calc( double spend , double dolar) {

		return (spend * dolar) * (1.0 + IOF);
	}
	
	
	
	
}

