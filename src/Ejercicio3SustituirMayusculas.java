import java.util.Scanner;

public class Ejercicio3SustituirMayusculas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce una frase en minúsculas: ");
            String fraseOriginal = scanner.nextLine();

            if (fraseOriginal == null || fraseOriginal.trim().isEmpty()) {
                throw new IllegalArgumentException("La cadena no puede estar vacía.");
            }

            String resultado = convertirPrimeraLetraMayuscula(fraseOriginal);

            System.out.println("\n--- Resultado ---");
            System.out.println("Original:  " + fraseOriginal);
            System.out.println("Modificado: " + resultado);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("\nPrograma finalizado.");
        }
    }


    public static String convertirPrimeraLetraMayuscula(String texto) {

        StringBuilder resultado = new StringBuilder();

        boolean proximaMayuscula = true;

        for (int i = 0; i < texto.length(); i++) {
            char caracterActual = texto.charAt(i);

            if (caracterActual == ' ') {
                resultado.append(caracterActual);
                proximaMayuscula = true;
            } else {
                if (proximaMayuscula) {
                    resultado.append(Character.toUpperCase(caracterActual));
                    proximaMayuscula = false;
                } else {

                    resultado.append(Character.toLowerCase(caracterActual));
                }
            }
        }

        return resultado.toString();
    }
}
