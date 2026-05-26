import java.util.Scanner;

public class Ejercicio1ContadorPalabras {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce una frase: ");
            String frase = scanner.nextLine();

            validarFrase(frase);

            int numeroPalabras = contarPalabras(frase);


            System.out.println("La frase contiene " + numeroPalabras + " palabra(s).");

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {

            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        } finally {

            scanner.close();
            System.out.println("Programa finalizado.");
        }
    }


    public static void validarFrase(String frase) {
        if (frase == null || frase.trim().isEmpty()) {
            throw new IllegalArgumentException("La frase no puede estar vacía o contener solo espacios.");
        }
    }

    public static int contarPalabras(String frase) {

        String[] palabras = frase.trim().split("\\s+");
        return palabras.length;
    }
}
