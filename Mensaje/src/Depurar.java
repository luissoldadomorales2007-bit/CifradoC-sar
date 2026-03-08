import java.util.Scanner;

public class Depurar {
	
	// Método para solicitar un texto no vacío
	
	public static  String solicitarTexto(Scanner scanner, String mensaje) {
		String texto;
		do {
			System.out.print(mensaje);
			texto = scanner.nextLine().trim();
			if (texto.isEmpty()) {
				System.err.println("No puede estar vacío.");
			}
		} while (texto.isEmpty());
		return texto;
	}

	// Método para solicitar un número entero positivo
	
	public static int solicitarNumero(Scanner scanner, String mensaje) {
		
		int numero;
		while (true) {
			try {
				System.out.print(mensaje);
				numero = Integer.parseInt(scanner.nextLine().trim());
				if (numero >= 0) {
					return numero;
				} else {
					System.err.println("Debe ser un número positivo.");
				}
			} catch (NumberFormatException e) {
				System.err.println("Ingrese un número válido.");
			}
		}
	}
}
