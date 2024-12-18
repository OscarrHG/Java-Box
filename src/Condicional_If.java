import javax.swing.JOptionPane;

public class Condicional_If {
    public static void main(String[] args) {
        String nombre;
        int edad;

        // Ingresar datos
        nombre = JOptionPane.showInputDialog(null, "Ingrese un nombre: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa una edad: "));

        // Analizando datos
        if (edad < 12) {
            JOptionPane.showMessageDialog(null, "Eres un niño(a)");
        } else if (edad >= 12 && edad < 19) {
            JOptionPane.showMessageDialog(null, "Eres adolescente");
        } else if (edad >= 19 && edad < 60) {
            JOptionPane.showMessageDialog(null, "Eres un adulto");
        } else {
            JOptionPane.showMessageDialog(null, "Eres un adulto mayor");
        }

        // Determinar si es mayor o menor de edad
        if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "Eres mayor de edad!");
        } else {
            JOptionPane.showMessageDialog(null, "Eres menor de edad!");
        }
    }
}
