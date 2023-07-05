package clases;
import java.util.Scanner;

public class Ej1_apellidos_nombre {

	public static void main(String[] args) {
		
		double peso, altura;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("CAlculo del IMC y diagnostico");
		
		do {
			System.out.println("Introduce peso (debe se mayor que 0 y 1000): ");
			peso = teclado.nextDouble();
			
		} while ( peso<=0 || peso>1000);
		
		do {
			System.out.println("Introduce altura: ");
			altura = teclado.nextDouble();
		} while ( altura<=0 || altura>2.8);
		
		double imc = peso/(Math.pow(altura, 2));
		
		String mensaje="Bajo peso";
		
//		if (imc<=0 || !Double.isFinite(imc) ) {
//			System.out.println("Error en los datpos");
//			System.exit(0);
//		} else 
		if (imc <18.5) {
			mensaje="Bajo peso";
		} else if (imc<25){
			mensaje="Peso normal (saludable)";
		} else if (imc<30) {
			mensaje="Sobrepeso";
		} else if (imc <40) {
			mensaje="Obesidad premórbida";
		} else if (imc>40){
			mensaje="Obesidad mórbida";
		} 
		
		System.out.printf("El paciente de %.2f kg y %.2f m de altura "
				+ "tiene un IMC de %.2f y tiene un diagnóstico de %s",
				peso,altura,imc,mensaje);
		
		
	}

}
