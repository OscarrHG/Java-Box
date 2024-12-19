public class Condiciona_If_Or {
    public static void main(String[] args) {
        boolean domingo = true;
        boolean vacaciones = false;

        //Ingresando datos
        if (domingo == true || vacaciones == true){
            System.out.println("Acceso Denegado!!");
        } else {
            System.out.println("Acceso Concedido!!");
        }
    }
}
