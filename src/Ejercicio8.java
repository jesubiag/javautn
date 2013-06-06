import java.util.Scanner;
import java.text.*;
import java.util.*;

class Ejercicio8{
	public static void main(String[] args) throws Exception{
		Juego juego = new Juego();

		juego.jugar();

		System.out.println( "Fin del juego. PUNTAJE: " + juego.getPoints() );
	}
}


class Juego{
	private Scanner scanIn;
	private int points;

	public Juego(){
		scanIn = new Scanner(System.in);
		points = 0;
	}

	public void jugar(){
		System.out.println("Escribe el resultado de cada expresion y presiona enter...");

		try{
			System.out.print(" 1 + 2 = ");
			checkResult( 1 + 2 );

			System.out.print(" 5 / 2 = ");
			checkResult( 5 / 2 );

			System.out.print(" 5.0 / 2.0 = ");
			checkResult(5.0 / 2.0);

			System.out.print(" 10 - 2d / 4d = ");
			checkResult(10 - 2d / 4d);

		}catch(Exception e){
			System.out.println("UPS, Ocurrió un error y perdiste!");
		}

		scanIn.close();
	}

	private double getUserValue() throws Exception{
		NumberFormat format = NumberFormat.getInstance(Locale.US);

		String response = scanIn.nextLine();
		return format.parse( response ).doubleValue();
	}

	private void checkResult(double calc) throws Exception{
		double result = getUserValue();
		if( result == calc ){
			System.out.println("OK: el resultado es "+calc);
			points++;
		}else{
			System.out.println("ERROR: el resultado es "+calc+" pero ingresaste "+result);
		}
	}

	public int getPoints(){
		return points;
	}
}