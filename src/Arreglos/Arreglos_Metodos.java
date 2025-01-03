package Arreglos;

import java.util.Arrays;

public class Arreglos_Metodos {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 8, 9, 4, 5, 6, 7};

        //Ver array como tal
        System.out.println("Array Original: " + Arrays.toString(numeros));

        //Ordenar Valores del Array
        Arrays.sort(numeros);
        System.out.println("Array Ordenado: " + Arrays.toString(numeros));
    }
}
