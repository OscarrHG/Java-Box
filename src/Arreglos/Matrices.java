package Arreglos;

public class Matrices {
    public static void main(String[] args) {
        int[][] numeros = new int[3][3];

        //Llenando filas de la matriz
        //Fila1 f  c
        numeros[0][0] = 8;
        numeros[0][1] = 7;
        numeros[0][2] = 4;
        //Fila2 f  c
        numeros[1][0] = 2;
        numeros[1][1] = 1;
        numeros[1][2] = 3;
        //Fila3 f  c
        numeros[2][0] = 9;
        numeros[2][1] = 0;
        numeros[2][2] = 6;

        //Mostrando valores de la matriz
        for (int i = 0; i < numeros.length; i++) {
            for (int f = 0; f < numeros.length; f++) {
                System.out.print(numeros[i][f] + "  ");
            }
            System.out.println();
        }
    }
}
