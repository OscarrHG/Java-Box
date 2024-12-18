import java.util.Scanner;

public class OperadoresAritm {
    public static void main(String[] args) {
        int v1, v2, r;

        Scanner entrada = new Scanner(System.in);

        //Ingreso de datos
        System.out.println("Ingrese valor 1:");
        v1 = entrada.nextInt();
        System.out.println("Ingrese valor 2:");
        v2 = entrada.nextInt();

        //Operacion Suma
        r = v1 + v2;
        System.out.println("Suma: " + r);
        System.out.println("Suma: " + (v1 + v2));

        // Operacion Resta
        r = v1 - v2;
        System.out.println("Resta: " + r);
        System.out.println("Resta: " + (v1 - v2));

        // Operacion Multiplicacion
        r = v1 * v2;
        System.out.println("Multiplicación: " + r);
        System.out.println("Multiplicación: " + (v1 * v2));

        // Operacion Division
        if (v2 != 0) { // Evitar la división por cero
            r = v1 / v2;
            System.out.println("División: " + r);
            System.out.println("División: " + (v1 / v2));
        } else {
            System.out.println("División: No se puede dividir por cero.");
        }

        // Operacion Modulo (Residuo)
        if (v2 != 0) { // Evitar módulo por cero
            r = v1 % v2;
            System.out.println("Módulo: " + r);
            System.out.println("Módulo: " + (v1 % v2));
        } else {
            System.out.println("Módulo: No se puede calcular el residuo con divisor cero.");
        }

        entrada.close();
    }
}
