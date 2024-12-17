public class Concatenacion {
    public static void main(String[] args) {
        String nombre = "Oscar";
        String apellido = "HG";
        String edad = "22";

        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println("Hola, " + nombre + " " + apellido);
        System.out.printf("Hola, %s %s de %s años\n", nombre, apellido, edad);
        System.out.println("Nice");
    }
}
