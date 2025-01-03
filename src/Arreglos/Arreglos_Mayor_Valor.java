package Arreglos;

import java.util.Scanner;

public class Arreglos_Mayor_Valor {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int[] numeros = new int[5];
        int mayor = 0;

        //Llenando array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese valor " + i + ": ");
            numeros[i] = e.nextInt();
            if (numeros[i] >= mayor) mayor = numeros[i];
            else mayor = mayor;
        }
        System.out.println("El numero mayor es: " + mayor);
    }
}
