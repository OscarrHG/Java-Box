public class Areglos_Bucles {
    public static void main(String[] args) {
        String[] productos = {"martillo", "destornillador", "taladro", "llave inglesa", "pinzas"};

        //Recorrer Array con For
//        for (int i = 0; i < productos.length; i++) {
//            System.out.println("Producto " + (i+1) + ": " + productos[i]);
//        }

        //Recorrer Array con While
        int i = 0;
        while (i < productos.length){
            System.out.println("Producto " + (i+1) + ": " + productos[i]);
            i++;
        }
    }
}
