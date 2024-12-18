public class OperadoresIncrem {
    public static void main(String[] args) {
        int valor1 = 5;
        System.out.println("Valor original: " + valor1);

        // Incrementando valor1 postfijo
        valor1++;
        System.out.println("Valor incrementado (postfijo): " + valor1);

        // Incrementando valor1 prefijo
        ++valor1;
        System.out.println("Valor incrementado (prefijo): " + valor1);

        // Incrementar de 2 o más en valor postfijo
        valor1 += 2;
        System.out.println("Valor incrementado en 2: " + valor1);

        // Decremento postfijo
        int valor2 = 10;
        System.out.println("Valor original: " + valor2);
        valor2--;
        System.out.println("Valor decrementado (postfijo): " + valor2);

        // Decremento prefijo
        --valor2;
        System.out.println("Valor decrementado (prefijo): " + valor2);

        // Decrementar de 2 o más en valor postfijo
        valor2 -= 2;
        System.out.println("Valor decrementado en 2: " + valor2);

        // Operador incremento fijo (multiplicación)
        int valor3 = 20;
        valor3 *= 9; // Multiplica valor3 por 9
        System.out.println("Valor incrementado (multiplicación): " + valor3);

        // Operador incremento fijo (división)
        valor3 /= 2; // Divide valor3 entre 2
        System.out.println("Valor incrementado (división): " + valor3);
    }
}
