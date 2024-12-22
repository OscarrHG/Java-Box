import java.util.Scanner;

public class Clase_String {
    public static void main(String[] args) {
        String palabra1, palabra2;
        Scanner entrada = new Scanner(System.in);

        //Ingreso de Datos
        System.out.println("Ingrese primera palabra: ");
        palabra1 = entrada.nextLine();
        System.out.println("Ingrese segunda palabra: ");
        palabra2 = entrada.nextLine();

        //Compara textos
//        if (palabra1.equals(palabra2)){
//            System.out.println(palabra1 + " es igual a: " + palabra2);
//        } else {
//            System.out.println(palabra1 + " no es igual a: " + palabra2);
//        }

        //Comparar textos sin importar mayusculas o minusculas
//        if (palabra1.equalsIgnoreCase(palabra2)){
//            System.out.println(palabra1 + " es lo mismo que: " + palabra2);
//        } else {
//            System.out.println(palabra1 + " no es lo mismo que: " + palabra2);
//        }

        // Comparar cantidad de caracteres
        if (palabra1.length() == palabra2.length()) { // Cuando tienen la misma cantidad de caracteres
            System.out.println(palabra1 + " tiene la misma cantidad de letras que " + palabra2);
        } else if (palabra1.length() > palabra2.length()) { // Cuando palabra1 tiene más letras
            System.out.println(palabra1 + " tiene más letras que " + palabra2);
        } else { // Cuando palabra1 tiene menos letras
            System.out.println(palabra1 + " tiene menos letras que " + palabra2);
        }

        //Saber caracter de una palabra
        System.out.println(palabra1.charAt(3));

        //Identificar substrings
        System.out.println(palabra1.substring(1,3));

        //Buscar caracteres de interseccion en 2 palabras
        int coincidencia = palabra1.indexOf(palabra2);

        if (coincidencia == -1){
            System.out.println(palabra1 + ", no contiene: " + palabra2);
        } else {
            System.out.println(palabra1 + " tiene coincidencia con: " + palabra2);
        }

        //Upper and Lower
        System.out.println(palabra1.toUpperCase());
        System.out.println(palabra2.toLowerCase());
    }
}
