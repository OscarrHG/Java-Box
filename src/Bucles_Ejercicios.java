import javax.swing.*;

public class Bucles_Ejercicios {
    public static void main(String[] args) {
        //Declaracion de Variables
        final String u_correcto = "usuario1";
        final String p_correcto = "asd123";

        String username, pswd;

        int intentos = 0;
        final int max_intentos = 3;

        while (intentos < max_intentos){
            username = JOptionPane.showInputDialog(null, "Ingrese el usuario: ");
            pswd = JOptionPane.showInputDialog(null, "Ingrese la contraseña: ");
            if (username.equals(u_correcto) && pswd.equals(p_correcto)){
                JOptionPane.showMessageDialog(null, "Acceso Correcto!!" + "\nBienvenid@ " + u_correcto);
                break;
            } else {
                intentos++;
                JOptionPane.showMessageDialog(null, "Usuario o Clave incorrectos \nIntente nuevamente");
            }
            if (intentos >= 3){
                JOptionPane.showMessageDialog(null, "Limite de Intentos Excedidos \nContacte a Soporte");
            }
        }
    }
}
