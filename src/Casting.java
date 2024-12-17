public class Casting {
    public static void main(String[] args) {
        //De String a Int
        String numTexto = "123";
        int numInt = Integer.parseInt(numTexto);
        System.out.println("String a Int: " + numInt);

        //De Int a String
        int  entero = 456;
        String text = String.valueOf(entero);
        System.out.println("Int a String: " + text);

        //De Double a Int
        double doble = 45.50;
        int dobleEntero = (int)doble;
        System.out.println("Double a Int: " + dobleEntero);

        //De Int a Double
        int enteroDoble = 20;
        System.out.println("Int a Double: " + (double)enteroDoble);
    }
}
