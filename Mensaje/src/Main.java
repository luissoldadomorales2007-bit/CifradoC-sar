import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		String texto = Depurar.solicitarTexto(sc, "Ingrese el texto para cifrar: ");

		int clave = Depurar.solicitarNumero(sc, "Ingrese la clave de cifrado (número entero positivo): ");

		String cifrado = cifrar(texto, clave);
		String descifrado = cifrar(cifrado, -clave);

		System.out.println("Cifrado: " + cifrado);
		System.out.println("Descifrado: " + descifrado);
	}

	public static String cifrar(String texto, int clave) {
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < texto.length(); i++) {
			char caracter = texto.charAt(i);

			if (caracter >= 'a' && caracter <= 'z') {
				int posicion = caracter - 'a';
				int nuevposicion = (posicion + clave) % 26;
				if (nuevposicion < 0) nuevposicion += 26;
				builder.append((char) ('a' + nuevposicion));
			} else if (caracter >= 'A' && caracter <= 'Z') {
				int pos = caracter - 'A';
				int nuevaPos = (pos + clave) % 26;
				if (nuevaPos < 0) nuevaPos += 26;
				builder.append((char) ('A' + nuevaPos));
			} else {
				builder.append(caracter);
			}
		}

		return builder.toString();
	}
}


