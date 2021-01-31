package taller01a;

import java.util.Scanner;

/**
 *Desarrolle un programa en Java que tenga dos threads. El primer thread imprime los n�meros pares entre 1 y un
 *l�mite superior recibido por entrada est�ndar. El segundo thread imprime los n�meros impares entre el mismo
 *rango. Despu�s de imprimir un n�mero en la consola, el thread debe dormir por una cantidad de milisegundos
 *especificada desde la creaci�n del thread. Haga dos versiones de este programa, una utilizando la extensi�n de la
 *clase Thread y otra mediante la implementaci�n de la interface Runnable o alguna de las dos implementaciones
 *existentes en Python.
 */

public class EjThreads01 extends Thread
{
	private boolean valor;

	private String name;
	
	private static int limit;

	public EjThreads01(String name, boolean valor)
	{
		System.out.println("Extendiendo la clase thread");
		this.name = name;
		this.valor = valor;
	}

	public boolean esPar(int numero)
	{
		if (numero%2==0)
		{
			return true;}
		else
		{
			return false;
		}
	}

	public void run()
	{
		try
		{
			for(int i = 1; i <= limit; i++)
			{
				boolean res = esPar(i);

				if(res==valor)
				{
					System.out.println(name + ": " + i);
					Thread.sleep(50);
				}
				else if(res==valor)
				{
					System.out.println(name + ": " + i);
					Thread.sleep(50);
				}
				
			}
		}
		catch (Exception e) {}

		System.out.println("Saliendo " + name);
	}

	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in))
		{
			System.out.print("Ingrese un limite \n");  
			limit = sc.nextInt();
		}
		
		EjThreads01 t0 = new EjThreads01("Thread " + 0, false);
		EjThreads01 t1 = new EjThreads01("Thread " + 1, true);

		t0.start();
		t1.start();
	}

}
