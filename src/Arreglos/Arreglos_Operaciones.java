package Arreglos;

public class Arreglos_Operaciones {
    public static void main(String[] args) {
        int[] ventas1 = {500, 600, 400, 100, 650};
        int[] ventas2 = {600, 800, 500, 350, 900};
        int[] total = new int[ventas1.length];
        int suma = 0;

        //Suma de Valores
        System.out.println("Suma de Valores");
        for (int i = 0; i < ventas1.length; i++) {
            total[i] = ventas1[i] + ventas2[i];
            suma = suma     + total[i];
            System.out.println("Total " + i + ": "+ total[i]);
        }
        System.out.println("Total Global: " + suma);
    }
}
