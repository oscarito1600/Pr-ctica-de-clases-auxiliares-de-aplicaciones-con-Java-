import java.util.Scanner;

public class Ejercicio5ContarVocalA {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        String frase = entrada.nextLine();

        int contador = 0;


        frase = frase.toUpperCase();


        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == 'A') {
                contador++;
            }
        }

        System.out.println("La vocal A aparece " + contador + " veces.");
    }
}