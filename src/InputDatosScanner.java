import java.util.Scanner;

public class InputDatosScanner {
    public static void main(String[] args) {
        String nombre;
        int edad;

        //Ingreso de Datos con Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        nombre = entrada.next();
        System.out.println("Escribe tu edad: ");
        edad = entrada.nextInt();

        //Salida de Datos
        System.out.printf("Nombre es: %s\n", nombre);
        System.out.printf("Edad es: %d", edad);
    }
}
