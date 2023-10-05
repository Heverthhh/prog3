import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Corredor {
    private String nombre;
    private int posicion;

    public Corredor(String nombre) {
        this.nombre = nombre;
        this.posicion = 0;
    }

    public void correr() {
        Timer timer = new Timer();
        final Random rand = new Random();  // Definir rand final

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                posicion += rand.nextInt(10);
                if (posicion > 100) {
                    posicion = 100;
                }
                System.out.print(nombre + ": ");
                for (int i = 0; i < posicion; i++) {
                    System.out.print(".");
                }
                System.out.println();
                if (posicion == 100) {
                    timer.cancel();
                }
            }
        }, 0, rand.nextInt(500));
    }
