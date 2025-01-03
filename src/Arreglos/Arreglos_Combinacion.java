package Arreglos;

public class Arreglos_Combinacion {
    public static void main(String[] args) {
        String[] productos = {"martillo", "destornillador", "taladro", "llave inglesa", "pinzas"};

        double[] precios = {12.50, 10.20, 200, 130.50, 20.35};

        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + ": $" + precios[i]);
        }
    }
}
