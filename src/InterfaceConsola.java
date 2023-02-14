import motor3R.TresEnRaya;
public class InterfaceConsola {
    public void presentacion(){
        System.out.println("Bienvenidos al tres en RAYA");
        System.out.println("ESTE ES EL CAMPO DE JUEGO:");
        System.out.println(" | A | B | C |");
        System.out.println("1| * | * | * |");
        System.out.println("2| * | * | * |");
        System.out.println("3| * | * | * |");
        System.out.println("Tu selecciona que posicion quieras con ordenes como pEj.: B2");
        System.out.println("BUENA SUERTE");
    }
    public void gamecontroller(){
        printmapa();
    }

    public void printmapa(){
        char[] mapa = new char[9];
        mapa[1]='a';
        mapa[2]='b';
        mapa[3]='c';
        System.out.println(" | A | B | C |");
        System.out.printf("1| %c | %c | %c |\n",mapa[1],mapa[2],mapa[3]);
        System.out.println("2| * | * | * |");
        System.out.println("3| * | * | * |");
    }



    public static void main(String[] args) {
        InterfaceConsola juego = new InterfaceConsola();
        juego.presentacion();
        juego.gamecontroller();
    }
}
