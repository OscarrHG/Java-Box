import javax.swing.*;

public class For_Ejercicio {
    public static void main(String[] args) {
        //Validar un correo correctamente
        boolean v = false;

        for (int i = 0; !v; i++){
            String email = JOptionPane.showInputDialog(null, "Ingrese el usuario: ");
            if (email.contains("@") && email.endsWith(".com")){
                JOptionPane.showMessageDialog(null, "Email correcto");
                v = true;
                break;
            } else if (!email.contains("@") ){
                JOptionPane.showMessageDialog(null, "Email necesita '@'");
            } else {
                JOptionPane.showMessageDialog(null, "Email necesita '.com'");
            }
        }
    }
}
