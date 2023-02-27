import motor3R.TresEnRaya;
import java.util.Scanner;

/**
 * Clase que representa la interfaz de usuario para el juego Tres en Raya.
 */
public class InterfaceConsola {

    /**
     * Muestra la presentación del juego.
     */
    public void presentacion(){
        System.out.println("Bienvenidos al tres en RAYA");
        System.out.println("ESTE ES EL CAMPO DE JUEGO:");
        System.out.println(" | 1 | 2 | 3 |");
        System.out.println("1| * | * | * |");
        System.out.println("2| * | * | * |");
        System.out.println("3| * | * | * |");
        System.out.println("La maquina va a usar 'O' como simbolo y tú vas a usar 'X' ");
        System.out.println("Tu selecciona que posicion quieras con ordenes como pEj.: 32\n" +
                "Empezando por el eje X primero :)");
        System.out.println("BUENA SUERTE");
    }

    /**
     * Controla el flujo del juego.
     */
    public void gamecontroller(){
        TresEnRaya jueguito = new TresEnRaya();
        Scanner sc = new Scanner(System.in);
        String[] posicion;
        printmapa(jueguito.Map());
        char resultado;
        int count=0;
        while(true){
            System.out.println("Dime la posicion deseada: ");
            posicion=sc.nextLine().split("");
            jueguito.insercion(posicion);
            printmapa(jueguito.Map());
            count++;
            if(count == 5){
                System.out.println("EMPATASTE EL DIABLOO");
                return;
            }
            System.out.println("Ahi esta tu ficha, ahora la maquina:");
            jueguito.insercionM(jueguito.turnomaquina());
            printmapa(jueguito.Map());
            System.out.println("Ahi puso la maquina!");
            resultado= jueguito.getWinner();

            if (resultado == 'X') {
                System.out.println("GANASTEEEEEE OLEEEEEE");
                return;
            } else if (resultado == 'O') {
                System.out.println("Te gano la maquina :(((((((");
                return;
            }
        }

    }

    /**
     * Imprime el mapa de juego.
     *
     * @param mapa la matriz que representa el estado actual del juego.
     */
    public void printmapa(char[][] mapa){
        System.out.println(" | 1 | 2 | 3 |");
        System.out.printf("1| %c | %c | %c |\n",mapa[1][1],mapa[1][2],mapa[1][3]);
        System.out.printf("2| %c | %c | %c |\n",mapa[2][1],mapa[2][2],mapa[2][3]);
        System.out.printf("3| %c | %c | %c |\n",mapa[3][1],mapa[3][2],mapa[3][3]);

    }


    /**
     * Función principal que inicia el juego.
     *
     * @param args los argumentos de línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        InterfaceConsola juego = new InterfaceConsola();
        juego.presentacion();
        juego.gamecontroller();
    }
}
