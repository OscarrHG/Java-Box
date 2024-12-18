public class OperadoresCompara {
    public static void main(String[] args) {
        int valor1 = 90, valor2 = 90;

        System.out.println("Valor1: " + valor1 + "\nValor2: " + valor2);
        // igualdad
        System.out.println("¿valor1 es igual a valor2? -> " + (valor1 == valor2));

        // distinto a
        System.out.println("¿valor1 es distinto de valor2? -> " + (valor1 != valor2));

        // mayor que
        System.out.println("¿valor1 es mayor que valor2? -> " + (valor1 > valor2));

        // menor que
        System.out.println("¿valor1 es menor que valor2? -> " + (valor1 < valor2));

        // menor o igual que
        System.out.println("¿valor1 es menor o igual que valor2? -> " + (valor1 <= valor2));

        // mayor o igual que
        System.out.println("¿valor1 es mayor o igual que valor2? -> " + (valor1 >= valor2));
    }
}
