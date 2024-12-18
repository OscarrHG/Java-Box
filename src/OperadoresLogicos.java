public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean a = true, b = false;

        // OPERADOR AND (Y) - &&
        System.out.println("AND (a && b): " + (a && b)); // True solo si ambos son true.

        // OPERADOR OR (O) - ||
        System.out.println("OR (a || b): " + (a || b)); // True si al menos uno es true.

        // OPERADOR NOT (NO) - !
        System.out.println("NOT (!a): " + (!a)); // Invierte el valor booleano.

        // OPERADOR XOR LOGICO - ^
        System.out.println("XOR (a ^ b): " + (a ^ b)); // True si los valores son diferentes.

        // OPERADOR AND CORTOCIRCUITO
        boolean resultadoCortocircuito = (a && b) && (a = false); // a no se modifica porque b es false.
        System.out.println("AND con cortocircuito: " + resultadoCortocircuito);
        System.out.println("Valor de a después del AND cortocircuito: " + a);

        // OPERADOR OR CORTOCIRCUITO
        a = true; // Reiniciar el valor de a
        boolean resultadoOrCortocircuito = (a || b) || (a = false); // a no se modifica porque el primer a es true.
        System.out.println("OR con cortocircuito: " + resultadoOrCortocircuito);
        System.out.println("Valor de a después del OR cortocircuito: " + a);

        // EJEMPLO GENERAL CON TODOS LOS OPERADORES
        boolean resultado = (a && !b) || (a ^ b);
        System.out.println("Combinación general: (a && !b) || (a ^ b): " + resultado);
    }
}
