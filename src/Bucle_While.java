import javax.swing.*;

public class Bucle_While {
    public static void main(String[] args) {
        int f = 0;

        //Bucle While
//        while (f < 5){
//            if (f == 2){
//                System.out.println("Contador en: " + f + " MEDIO");
//            } else {
//                System.out.println("Contador en: " + f);
//            }
//            f++;
//        }

        //Tabla de Multiplicar
//        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero: "));
//        String tabla = "", temp = "";
//
//
//        while (f <= 12) {
//            temp = num + " x " + f + " = " + (f*num) + "\n";
//            tabla = tabla + temp ;
//            f++;
//        }
//        JOptionPane.showMessageDialog(null, tabla);

//        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un número: "));
//        StringBuilder tabla = new StringBuilder(); // Uso de StringBuilder para eficiencia
//
//        while (f <= 12) {
//            tabla.append(num)
//                    .append(" x ")
//                    .append(f)
//                    .append(" = ")
//                    .append(num * f)
//                    .append("\n");
//            f++;
//        }
//        JOptionPane.showMessageDialog(null, tabla.toString(), "Tabla de Multiplicar", JOptionPane.INFORMATION_MESSAGE);

        //Control de Login de Usuario
        final String username = "mango";
        final String pswd = "mango123";
        boolean acceso =  false;

        while (!acceso){
            String usuario = JOptionPane.showInputDialog(null, "Ingrese su usuario:");
            String clave = JOptionPane.showInputDialog(null, "Ingrese su contra:");

            if (username.equals(usuario) && pswd.equals(clave)){
                JOptionPane.showMessageDialog(null, "Credenciales Correctas!!");
                acceso = true;
            } else {
                JOptionPane.showMessageDialog(null, "Credenciales Incorrectas... Try Again!!");
            }
        }
    }
}
