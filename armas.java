
public class armas {

    // Probabilidades de acertar
    private double acierto_punos = 1.00;
    private double acierto_daga = 0.40;
    private double acierto_pistola = 0.10;

    // Daño mínimo y máximo de cada arma
    private int danio_punos_min = 5;
    private int danio_punos_max = 10;

    private int danio_daga_min = 10;
    private int danio_daga_max = 20;

    private int danio_pistola_min = 20;
    private int danio_pistola_max = 30;

    // Método principal para seleccionar el arma
    public static int atacar(int arma) {

        switch (arma) {

            case 1:
                return calcularAtaque( 
                    acierto_punos,
                    danio_punos_min,
                    danio_punos_max,
                    "Puños"
                );

            case 2:
                return calcularAtaque(
                    acierto_daga,
                    danio_daga_min,
                    danio_daga_max,
                    "Daga"
                );

            case 3:
                return calcularAtaque(
                    acierto_pistola,
                    danio_pistola_min,
                    danio_pistola_max,
                    "Pistola"
                );

            default:
                System.out.println("Arma no válida.");
                return 0;
        }
    }

    // Comprueba si el ataque acierta y calcula el daño
    private static int calcularAtaque(double probabilidad, int danioMin, int danioMax, String nombreArma) {

        if (Math.random() < probabilidad) {

            int danio = (int) (Math.random()
                    * (danioMax - danioMin + 1)) + danioMin;

            System.out.println(nombreArma + ": ¡Has acertado!");
            System.out.println("Has causado " + danio + " puntos de daño.");

            return danio;

        } else {

            System.out.println(nombreArma + ": ¡Has fallado!");
            System.out.println("No has causado ningún daño.");

            return 0;
        }
    }
}
