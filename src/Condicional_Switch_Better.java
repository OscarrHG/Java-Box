import java.util.Scanner;

public class Condicional_Switch_Better {
    public static void main(String[] args) {
        int diaSemana;
        Scanner entrada = new Scanner(System.in);

        //Ingreso de datos
        System.out.println("Ingrese dia a consultar: ");
        diaSemana = entrada.nextInt();

//        switch (diaSemana){
//            case 1 -> System.out.println("Lunes");
//            case 2 -> System.out.println("Martes");
//            case 3 -> System.out.println("Miercoles");
//            case 4 -> System.out.println("Jueves");
//            case 5 -> System.out.println("Viernes");
//            case 6 -> System.out.println("Sabado");
//            case 7 -> System.out.println("Domingo");
//            default->System.out.println("Fuera de rango!!");
//        }

        switch (diaSemana) {
            case 1 -> {
                System.out.println("Lunes");
                System.out.println("Inicio de la semana laboral");
            }
            case 2 -> {
                System.out.println("Martes");
                System.out.println("Segundo día laboral");
            }
            case 3 -> {
                System.out.println("Miércoles");
                System.out.println("Mitad de la semana");
            }
            case 4 -> System.out.println("Jueves"); // Caso con una sola línea
            case 5 -> {
                System.out.println("Viernes");
                System.out.println("Fin de la semana laboral");
            }
            case 6, 7 -> {
                System.out.println("Fin de semana");
                System.out.println("Día para descansar");
            }
            default -> {
                System.out.println("Fuera de rango!!");
                System.out.println("Ingrese un valor válido");
            }
        }

    }
}
