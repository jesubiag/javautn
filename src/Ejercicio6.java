import java.util.Scanner;
import java.text.*;
import java.util.*;

class Ejercicio6{

	public static void main(String[] args) throws Exception{
		//compilar y correr
		//calcular el resultado teniendo en cuenta el orden de precedencia
		
		//declaro e inicializo la variable del puntaje
		int points = 0;
		Scanner scanIn = new Scanner(System.in);
		NumberFormat format = NumberFormat.getInstance(Locale.US);

		System.out.println("Escribe el resultado de cada expresion y presiona enter...");
		
		System.out.print(" 1 + 2 = ");
		String response = scanIn.nextLine();
		double result = format.parse( response ).doubleValue();
		double calc = 1+2;
		if( result == calc ){
			System.out.println("OK: el resultado es "+calc);
			points++;
		}else{
			System.out.println("ERROR: el resultado es "+calc+" pero ingresaste "+result);
		}

		System.out.print(" 5 / 2 = ");
		calc = (5 / 2);
		response = scanIn.nextLine();
		result = format.parse( response ).doubleValue();
		if( result == calc ){
			System.out.println("OK: el resultado es "+calc);
			points++;
		}else{
			System.out.println("ERROR: el resultado es "+calc+" pero ingresaste "+result);
		}

		System.out.print(" 5.0 / 2.0 = ");
		calc = (5.0 / 2.0);
		response = scanIn.nextLine();
		result = format.parse( response ).doubleValue();
		if( result == calc ){
			System.out.println("OK: el resultado es "+calc);
			points++;
		}else{
			System.out.println("ERROR: el resultado es "+calc+" pero ingresaste "+result);
		}

		System.out.print(" 10 - 2d / 4d = ");
		response = scanIn.nextLine();
		result = format.parse( response ).doubleValue();
		calc = (10 - 2d / 4d);
		if( result == calc ){
			System.out.println("OK: el resultado es "+calc);
			points++;
		}else{
			System.out.println("ERROR: el resultado es "+calc+" pero ingresaste "+result);
		}

		scanIn.close();

		System.out.println("Fin del juego. PUNTAJE: " + points);

	}

}