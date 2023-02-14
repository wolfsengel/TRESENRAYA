package motor3R;

public class TresEnRaya {
    char[] tablero;
   public boolean hayganador(char[] tablero){
       if (tablero[1]==tablero[2] && tablero[1]==tablero[3]){
           return true;
       } else if (tablero[4]==tablero[5] && tablero[4]==tablero[6]) {
           return true;
       } else if (tablero[7]==tablero[8] && tablero[7]==tablero[9]) {
           return true;
       }

       if (tablero[1]==tablero[4] && tablero[1]==tablero[7]){
           return true;
       } else if (tablero[2]==tablero[5] && tablero[2]==tablero[8]) {
           return true;
       } else if (tablero[3]==tablero[6] && tablero[3]==tablero[9]) {
           return true;
       }


       return false;
   }


}
