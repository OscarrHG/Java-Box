package Arreglos;

public class Arreglos {
    public static void main(String[] args) {
        //Declaracion de un Array
        int[] numeros = new int[5];

        //Inicializacion de un Array - Forma 1
        numeros[0] = 50;
        numeros[1] = 20;
        numeros[2] = 35;
        numeros[3] = 80;
        numeros[4] = 150;

        //Inicializacion de un Array - Forma 2
        int[] valores = {234, 345, 456};

        //Consultar indices del array
        System.out.println(numeros[2]);
        System.out.println(valores[0]);
    }
}
