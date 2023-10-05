import java.util.Scanner;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Timer timer = new Timer();

        while (true) {
            System.out.print("Ingrese el tiempo de espera (en segundos) o 'q' para salir: ");

            int tiempoEspera;
            if (scanner.hasNextInt()) {
                tiempoEspera = scanner.nextInt();
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("q")) {
                    break;
                } else {
                    System.out.println("Entrada no válida. Por favor, ingrese un número o 'q' para salir.");
                    continue;
                }
            }

            System.out.print("Ingrese el mensaje para este temporizador: ");
            String mensaje = scanner.next();

            Temporizador tarea = new Temporizador(mensaje);
            timer.schedule(tarea, tiempoEspera * 1000);

            System.out.println("Temporizador programado para " + tiempoEspera + " segundos con el mensaje: " + mensaje);

            System.out.print("¿Desea programar otro temporizador? (s/n): ");
            String respuesta = scanner.next();

            if (respuesta.equalsIgnoreCase("n")) {
                break;
            }
        }

        timer.cancel();
        scanner.close();  
    }
}
