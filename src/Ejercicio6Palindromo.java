import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese una palabra:");
        String palabra = entrada.nextLine();


        palabra = palabra.toLowerCase();


        String invertida = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertida += palabra.charAt(i);
        }


        if (palabra.equals(invertida)) {
            System.out.println("La palabra es palíndroma.");
        } else {
            System.out.println("La palabra NO es palíndroma.");
        }
    }
}
