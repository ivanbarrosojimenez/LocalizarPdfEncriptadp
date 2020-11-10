package prueba;


import util.UtilidadesFichero;

public class Main {

	public static void main(String[] args) {

		//Aqui se espera que el resultado sea true puesto que no esta bloqueado
		System.out.println("¿Fichero bloqueado? " + UtilidadesFichero.esFicheroBloqueado("NoBloqueado.pdf") + "\n");
		//Aqui se espera que el resultado sea false puesto que esta bloqueado
		System.out.println("¿Fichero bloqueador? " + UtilidadesFichero.esFicheroBloqueado("Bloqueado.pdf")+ "\n");
		//Aqui se espera una excepcion puesto que el fichero no existe
		System.out.println("¿Fichero bloqueado? " + UtilidadesFichero.esFicheroBloqueado("NoBloqueado_falso.pdf")+ "\n");
		//Aqui se espera una excepcion puesto que el fichero no es un Pdf
		System.out.println("¿Fichero bloqueado? " + UtilidadesFichero.esFicheroBloqueado("TextoPrueba.txt"));


	}

}
