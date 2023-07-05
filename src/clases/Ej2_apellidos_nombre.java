package clases;

import java.util.Scanner;

public class Ej2_apellidos_nombre {

	public static void main(String[] args) {
		
		double imcs_pacientes [][] = {
				{15.7,15.8,16.1,16.3,16.7,17,17.4,17.1,17.5,17.6,18.4,18.6},
				{38.5,38.4,38.3,38.3,38.8,37.5,37.4,37.1,36.8,36.0,35.4,35.2},
				{33.5,33.6,33.8,33.9,33.6,33.1,32.4,31.8,31.7,29.8,28.4,27.2},
				{32.7,32.4,33,32.7,32.9,31.6,31.5,30.4,29.2,27.3,25.2,24.7}
				};
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Cálculo de la media anual de los pacientes");
		
		System.out.println("Momstrando datos de los pacientes");
		Examen.mostrar_imcs(imcs_pacientes);
		int paciente=0;
		do {
			System.out.printf("¿Que paciente quieres calcular (0-%d)?",
					imcs_pacientes.length-1);
			 paciente = teclado.nextInt();
		} while( paciente <0 || paciente >= imcs_pacientes.length);
		
		System.out.println("La media del paceinte es "+ 
				Examen.media_pacientes(imcs_pacientes,paciente));
		
//		System.out.println("¿Que paciente quieres calcular?");
//		int paciente = teclado.nextInt();
		
//		double media= Examen.media_pacientes(imcs_pacientes, paciente);
//		if (media!=-1) {
//			System.out.printf("La media del paciente es %.2f", media);
//		} else System.out.println("Paceinte no encontrado");
//		
		}

}
