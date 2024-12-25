public class Bucle_For {
    public static void main(String[] args) {
        //Bucle Ascendente
//        System.out.println("Bucle Ascendente");
//        for (int i = 0; i < 10; i++) {
//            System.out.println("vuelta nro: " + i);
//        }
//
        //bucle Descendente
//        System.out.println("Bucle Descendente");
//        for (int i = 9; i >= 0; i--) {
//            System.out.println("vuelta nro: " + i);
//        }

        //Sumar Valores Pares
        int s=0;
        for (int i = 1; i <= 20; i++) {
            if (i%2 == 0){
                System.out.println(i + " Par");
                s+=i;
            } else {
                System.out.println(i);
            }

        }

        System.out.println("La suma es: " + s);
    }
}
