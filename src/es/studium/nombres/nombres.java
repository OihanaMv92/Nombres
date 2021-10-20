package es.studium.nombres;
import java.util.Scanner;
public class nombres
{

	public static void main(String[] args)
	{
		String nombre1, nombre2, nombre3, nombre4, nombre5;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe el primero nombre:");
		nombre1 = teclado.nextLine();
		System.out.println("Escribe el segundo nombre:");
		nombre2 = teclado.nextLine();
		System.out.println("Escribe el tercer nombre:");
		nombre3 = teclado.nextLine();
		System.out.println("Escribe el cuarto nombre:");
		nombre4 = teclado.nextLine();
		System.out.println("Escribe el quinto nombre:");
		nombre5 = teclado.nextLine();
		System.out.println("El primer nombre es " + nombre1);
		System.out.println("El segundo nombre es " + nombre2);
		System.out.println("El tercer nombre es " + nombre3);
		System.out.println("El cuarto nombre es " + nombre4);
		System.out.println("El quinto nombre es " + nombre5);
		teclado.close();
	}

}




//Programa Nombres
//Variables
//	Cadena nombre1, nombre2, nombre3, nombre4, nombre5
//INICIO
	//ESCRIBIR " Dime el primer nombre:"
	//Leer nombre1
	//ESCRIBIR "Dime el segundo nombre:"
	//Leer nombre2
	//ESCRIBIR "Dime el tercer nombre:"
	//Leer nombre3
	//ESCRIBIR "Dime el cuarto nombre:"
	//Leer nombre4
	//ESCRIBIR "Dime el quinto nombre:"
	//Leer nombre5
	// ESCRIBIR " El primero nombre es" + nombre1
	// ESCRIBIR " El segundo nombre es" + nombre2
	// ESCRIBIR " El tercer nombre es" + nombre3
	// ESCRIBIR " El cuarto nombre es" + nombre4
	// ESCRIBIR " El quinto nombre es" + nombre5
//FIN