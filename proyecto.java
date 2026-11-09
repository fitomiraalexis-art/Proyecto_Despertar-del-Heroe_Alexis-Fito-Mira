import java.util.Scanner;

public class proyecto {



public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int opcion;
    String nombreHeroe = "";

    do{
        
        System.out.println("----------------------");
        System.out.println("El despertar del héroe");
        System.out.println("----------------------");
        System.out.println("1. jugar");
        System.out.println("2. Ayuda");
        System.out.println("3. Ranking de partidas");
        System.out.println("4. Salir");
        System.out.println("¿Que deseas hacer?");

        opcion = sc.nextInt();

        switch (opcion) {

            case 1:
                NuevaPartida();
                nombreHeroe = solicitarNombreHeroe(sc);
                System.out.println("¡Bienvenido " + nombreHeroe + " suerte en tu camino!");
           break;

           case 2:
            mostrarAyuda(sc);
            break;

            case 3: 
            System.out.println("Juego creado por Alexis Fito Mira");
            break;

            case 4:
                System.out.println("Gracias por jugar");
                break;

                default:
                    System.out.println("opción no valida, prueba otra");
                break;

                
        }
            
        


    } while (opcion != 4);
    sc.close();
}

public static String solicitarNombreHeroe(Scanner sc) {

    String nombre = "";

    do {
        System.out.print("\nSelecciona un nombre para tu héroe: ");
        nombre = sc.nextLine();

        if (nombre.equals("")) {
            System.out.println("Selecciona un nombre para continuar.");
        }

    } while (nombre.equals(""));

    return nombre;
}

public static void NuevaPartida() {


    System.out.println("Iniciando nueva partida");

    String nombreHeroe = solicitarNombreHeroe(new Scanner(System.in));
    System.out.println("Suerte con tu aventura " + nombreHeroe);

    

}

public static void combate() {

    
}

public static void mostrarAyuda(Scanner sc) {

        System.out.println("\n--------------------------------------------------------");
        System.out.println("              EL DESPERTAR DEL HEROE");
        System.out.println("                   Instrucciones                   ");
        System.out.println("--------------------------------------------------------");

        System.out.println("\n1. OBJETIVO DEL JUEGO");
        System.out.println("Tu objetivo es sobrevivir a tres combates consecutivos.");
        System.out.println("Tendras que derrotar a los siguientes enemigos:");
        System.out.println("   - Goblin Menor (40 HP).");
        System.out.println("   - Orco de Asalto (60 HP).");
        System.out.println("   - Senor Oscuro (80 HP).");
        System.out.println("Si derrotas a los tres enemigos, ganaras la partida.");

        System.out.println("\n2. COMO EMPEZAR");
        System.out.println("   1. Selecciona Nueva partida en el menu principal.");
        System.out.println("   2. Introduce el nombre de tu heroe.");
        System.out.println("   3. Comenzaras con 100 puntos de vida.");
        System.out.println("   4. Dispondras de tres pociones de curacion.");

        System.out.println("\n3. ACCIONES DURANTE EL COMBATE");
        System.out.println("   1. ATACAR: Atacas al enemigo con tu arma equipada.");
        System.out.println("   2. USAR POCION: Recuperas 25 puntos de vida.");
        System.out.println("      Dispones de un maximo de 3 pociones.");
        System.out.println("   3. ORGANIZAR INVENTARIO: Puedes cambiar de arma");
        System.out.println("      o consultar las pociones disponibles.");
        System.out.println("   4. ABANDONAR: Terminas la partida y vuelves al menu.");

        System.out.println("\n4. ARMAS DISPONIBLES");
        System.out.println("   - PUNETAZOS: 100% de acierto. Dano de 5 a 10.");
        System.out.println("   - DAGA: 50% de acierto. Dano de 15 a 25.");
        System.out.println("   - PISTOLA: 10% de acierto. Dano de 35 a 50.");

        System.out.println("\n5. ATAQUES DE LOS ENEMIGOS");
        System.out.println("   Los enemigos causan entre 5 y 15 puntos de dano.");
        System.out.println("   Si tu vida llega a cero, perderas la partida.");

        System.out.println("\n6. SISTEMA DE PUNTUACION");
        System.out.println("   - 100 puntos por cada enemigo derrotado.");
        System.out.println("   - Bonificacion equivalente a tu vida restante al ganar.");

        System.out.println("\n7. CONSEJOS PARA JUGAR");
        System.out.println("   - Administra bien tus tres pociones.");
        System.out.println("   - Cambia de arma segun el enemigo.");
        System.out.println("   - Intenta conservar la mayor cantidad de vida posible.");

        System.out.println("\n--------------------------------------------------------");
        System.out.println("          ¡Suerte en tu aventura!");
        System.out.println("--------------------------------------------------------");
}
}