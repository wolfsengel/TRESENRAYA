import motor3R.TresEnRaya;
import java.util.Scanner;
public class InterfaceConsola {
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
    public void gamecontroller(){
        TresEnRaya jueguito = new TresEnRaya();
        Scanner sc = new Scanner(System.in);
        String[] posicion;
        printmapa(jueguito.tablero);
        while(true){
            System.out.println("Dime la posicion deseada: ");
            posicion=sc.nextLine().split("");
            jueguito.insercion(posicion);
            jueguito.insercionM(jueguito.turnomaquina());
            printmapa(jueguito.tablero);
            if (jueguito.getWinner() == 'X') {
                System.out.println("Congratulations! You win!");
                break;
            } else if (jueguito.getWinner() == 'O') {
                System.out.println("Sorry, the computer wins.");
                break;
            } else{
                System.out.println("It's a tie!");
                break;
            }
        }

    }

    public void printmapa(char[][] mapa){
        System.out.println(" | A | B | C |");
        System.out.printf("1| %c | %c | %c |\n",mapa[1][1],mapa[1][2],mapa[1][3]);
        System.out.printf("1| %c | %c | %c |\n",mapa[2][1],mapa[2][2],mapa[2][3]);
        System.out.printf("1| %c | %c | %c |\n",mapa[3][1],mapa[3][2],mapa[3][3]);

    }


    public static void main(String[] args) {
        InterfaceConsola juego = new InterfaceConsola();
        juego.presentacion();
        juego.gamecontroller();
    }
}
