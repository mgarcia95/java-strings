package terceraRelacion;

import java.util.Scanner;

public class Metodos {
	/////////////////////////////////////////IMPRIME EJERCICIO////////////////////////////////////////////////
	void imprimeEjercicio(Integer numeroejercicio) {
		System.out.println("Ejercicio "+numeroejercicio+": ");
	}
	////////////////////////////////////////////EJERCICIO 1///////////////////////////////////////////////////
	private String pideTeclado() {
		System.out.print("Ingrese una cadena de texto: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		/*Por defecto, Scanner usa como delimitador de texto los espacios, por tanto para introducir strings
		 * por teclado necesitaremos, cambiar dicho delimitador. El problema es que, luego el delimitador se
		 * imprime, por tanto tendremos que recorrer todo el string y pasarlo a otro, menos la posicion ultima
		 * que es la que imprime el delimitador.*/
		sc.useDelimiter("\n");
		String h = sc.next();
		String s = "";
		for(int i=0;i<h.length()-1;i++) {
			s=s+h.charAt(i);
		}
		return s;
	}
	void calculaMayusculasMinusculas() {
		String s = pideTeclado();
		Integer min = 0;
		Integer may = 0;
		for(int i=0; i<s.length();i++) {
			Character c = s.charAt(i);
			if(Character.isLowerCase(c)) min++;
			if(Character.isUpperCase(c)) may++;
				
			}
		System.out.println("Minusculas: "+min);
		System.out.println("Mayusculas: "+may);
	}
	////////////////////////////////////////////EJERCICIO 2///////////////////////////////////////////////////
	private Integer buscaCaracter(Character caracter, String cadena) {
		Integer contador = 0;
		for(int i=0;i<cadena.length();i++) {
			if(cadena.charAt(i)==caracter) contador++;
		}
		return contador;
	}
	void cuentaCaracter(Character caracter, String cadena) {
		Integer n = buscaCaracter(caracter, cadena);
		System.out.println("El carácter '"+caracter+"' se ha introducido "+n+" veces en la cadena '"+cadena+"'");
	}
	////////////////////////////////////////////EJERCICIO 3///////////////////////////////////////////////////
	private String eliminaEspacios(String cadena) {
		String sinespacios = cadena.replaceAll("\\s", "");
		return sinespacios;
	}
	void imprimeEliminaEspacios(String cadena) {
		System.out.println(eliminaEspacios(cadena));
	}
	////////////////////////////////////////////EJERCICIO 4///////////////////////////////////////////////////
	private String invierteCadena(String cadena) {
		String inverso="";
		for(int i=cadena.length()-1;i>=0;i--) {
			inverso=inverso+cadena.charAt(i);	
		}
		return inverso;
	}
	void imprimeInvierteCadena(String cadena) {
		System.out.println(invierteCadena(cadena));
	}
	////////////////////////////////////////////EJERCICIO 5///////////////////////////////////////////////////
	private String codificaCadena(String cadena) {
		String codificado="";
		for(int i=0;i<cadena.length();i++) {
			/* El ejercicio dice que sumemos tres en ASCII, pero el ejemplo unicamente suma dos, por tanto,
			 * para nuestro ejemplo, nosotros los hemos imprimido con dos para ver que funciona correctamente,
			 * no obstante, sería tan facil como sumar tres en vez de dos en la linea inferior.*/
			int ascii = ((int)cadena.charAt(i))+2;
			char c = (char) ascii;
			codificado=codificado+c;
		}
		return codificado;
	}
	void imprimeCodificaCadenaTeclado() {
		String s = pideTeclado();
		System.out.println(codificaCadena(s));
	}
	////////////////////////////////////////////EJERCICIO 6///////////////////////////////////////////////////
	private Boolean compruebaPalindromo(String palabra) {
		palabra = palabra.toLowerCase(); //Lo pasamos a minuscula para que no distinga al comparar.
		String inverso = invierteCadena(palabra);
		if(inverso.equals(palabra))return true;
		return false;
	}
	void imprimeCompruebaPalindromo(String palabra) {
		Boolean b = compruebaPalindromo(palabra);
		if (b) System.out.println("La palabra introducida es palindromo.");
		else System.out.println("La palabra introducida no es palindromo.");
	}
	////////////////////////////////////////////EJERCICIO 7///////////////////////////////////////////////////
	String colocaMayusculas(String cadena, Character c) {
		String s = cadena.replace(c, Character.toUpperCase(c));
		return s;
	}
	void imprimeMayusculas(String cadena, Character c) {
		System.out.println(colocaMayusculas(cadena,c));
	}
}
