import java.util.Scanner;

public class Ejercicio4EliminarUltimaPalabra {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        String frase = entrada.nextLine();


        int posicion = frase.lastIndexOf(" ");

        if (posicion != -1) {

            String nuevaFrase = frase.substring(0, posicion);

            System.out.println("Frase sin la última palabra:");
            System.out.println(nuevaFrase);
        } else {
            System.out.println("La frase solo tiene una palabra.");
        }
    }
}