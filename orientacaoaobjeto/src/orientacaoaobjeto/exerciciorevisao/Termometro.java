package orientacaoaobjeto.exerciciorevisao;

public class Termometro {

	public static Double CelsiusParaFahrenheit(double temperatura) {
		return temperatura * 1.8 + 32;
	}
	
	public static Double FahrenheitParaCelsius(double temperatura) {
		return (temperatura - 32) / 1.8;
	}
	
	public static Double CelsiusParaKelvin(double temperatura) {
		return temperatura + 273.15;
	}
	
	public static Double KelvinParaCelsius(double temperatura) {
		return temperatura - 273.15;
	}
}
