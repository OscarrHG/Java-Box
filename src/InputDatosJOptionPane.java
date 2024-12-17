import javax.swing.*;

public class InputDatosJOptionPane {
    public static void main(String[] args) {
        String nombre;
        int edad;

        //Ingreso de Datos
        nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre: ");
        /*
        * JOptionPane.showInputDialog, esto por defeto devuelve un String.
        * Por eso se tiene que hacer el parseo a Int.
        * Puedes realizarlo en la misma linea como yo lo hice.
        * O puedes acerlo asi:
        * String edad2 = JOptionPane.showInputDialog(null, "Ingrese la edad: ");
        * edad = Integer.parseInt(edad2);
        * */
        edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad: "));

        //Mostrar Datos
        JOptionPane.showMessageDialog(null, "El nombre es: " + nombre + "\nLa edad es: " + edad);
    }
}