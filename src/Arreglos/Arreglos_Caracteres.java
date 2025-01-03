package Arreglos;

import java.util.Arrays;

public class Arreglos_Caracteres {
    public static void main(String[] args) {
        String[] productos = new String[5];

        productos[0] = "Manazanas";
        productos[1] = "Uvas";
        productos[2] = "Peras";
        productos[3] = "Fresas";
        productos[4] = "Kiwis";

        System.out.println("producto 1: " + productos[0]);
        System.out.println("producto 2: " + productos[1]);
        System.out.println("producto 3: " + productos[2]);
        System.out.println("producto 4: " + productos[3]);
        System.out.println("producto 5: " + productos[4]);

        Arrays.sort(productos);

        System.out.println("\nLista Ordenada\nproducto 1: " + productos[0]);
        System.out.println("producto 2: " + productos[1]);
        System.out.println("producto 3: " + productos[2]);
        System.out.println("producto 4: " + productos[3]);
        System.out.println("producto 5: " + productos[4]);
    }
}
