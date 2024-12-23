import javax.swing.*;

public class Bucle_Do_While {
    public static void main(String[] args) {
        int cont = 1;
        final var valor = 5;

        //Bucle Do While
//        do {
//            System.out.println("Valor en: " + cont++);
//        } while (cont <= valor);

        int numero = 0, errores = 0;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero 5:"));
            if (numero != 5){
                JOptionPane.showMessageDialog(null, "No ingresaste el numero 5!!");
                errores++;
            }
        } while (numero != 5);
        JOptionPane.showMessageDialog(null, "Gracias!!, Nro errores: " + errores);
    }
}
