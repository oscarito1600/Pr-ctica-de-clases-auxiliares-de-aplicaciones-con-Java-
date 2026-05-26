import java.util.Scanner;

public class Ejercicio2QuitarEspacios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce una frase con espacios: ");
            String fraseOriginal = scanner.nextLine();

            if (fraseOriginal == null || fraseOriginal.isEmpty()) {
                throw new IllegalArgumentException("No puedes dejar la cadena vacía.");
            }

            String fraseSinEspacios = fraseOriginal.replace(" ", "");

            System.out.println("\n--- Resultados ---");
            System.out.println("Frase original:   \"" + fraseOriginal + "\"");
            System.out.println("Sin espacios:     \"" + fraseSinEspacios + "\"");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("\nPrograma finalizado.");
        }
    }
}