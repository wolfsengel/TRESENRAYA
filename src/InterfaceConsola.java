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

    }

    public void printmapa(){
        char[] mapa;
        System.out.println(" | A | B | C |");
        System.out.println("1| * | * | * |");
        System.out.println("2| * | * | * |");
        System.out.println("3| * | * | * |");
    }



    public static void main(String[] args) {
        InterfaceConsola juego = new InterfaceConsola();
        juego.presentacion();
        juego.gamecontroller();
    }
}
