import java.util.Scanner;

public class proyecto {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int opcion;

    do{
        
        System.out.println("----------------------");
        System.out.println("El despertar del héroe");
        System.out.println("----------------------");
        System.out.println("1. jugar");
        System.out.println("2. Opciones");
        System.out.println("3. Creditos");
        System.out.println("4. Salir");

        opcion = sc.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("Bienvenido a tu nueva partida");
           break;

           case 2:
            System.out.println("has entrado en opciones");
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


}