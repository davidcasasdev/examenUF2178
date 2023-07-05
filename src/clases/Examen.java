package clases;
import java.util.Iterator;

public class Examen {

	
	public static void mostrar_imcs(double m[][]) {
		for (int fila = 0; fila < m.length; fila++) {
			for (int cols = 0; cols < m[0].length; cols++) {
				System.out.printf("%.2f\t", m[fila][cols]);
			}
			System.out.println();
		}
	}
	
	public static double media_pacientes(double[][] m, int paciente) {
		double suma=0;
		if (paciente<0 || paciente >= m.length) {
			return -1;
		}
		for (int i = 0; i < m[0].length; i++) {
			suma=suma+m[paciente][i];
		}
		return suma/m[0].length;
		
	}
	
	
	
}
