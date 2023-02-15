package motor3R;

import java.util.Random;

public class TresEnRaya {
    public char[][] tablero = { {' ',' ',' ',' '},{' ',' ',' ',' '},{' ',' ',' ',' '},{' ',' ',' ',' '}};
    public String aux;

   public void insercion(String[] cositas){

       tablero[Integer.parseInt(cositas[0])][Integer.parseInt(cositas[1])] = 'X';

   }

    public int[] turnomaquina() {
        // Check if the computer can win on this move
        for (int row = 1; row < 4; row++) {
            for (int col = 1; col < 4; col++) {
                if (tablero[row][col] == ' ') {
                    tablero[row][col] = 'O';
                    if (getWinner() == 'O') {
                        return new int[] { row, col };
                    }
                    tablero[row][col] = ' ';
                }
            }
        }

        // Check if the player can win on the next move and block it
        for (int row = 1; row < 4; row++) {
            for (int col = 1; col < 4; col++) {
                if (tablero[row][col] == ' ') {
                    tablero[row][col] = 'X';
                    if (getWinner() == 'X') {
                        return new int[] { row, col };
                    }
                    tablero[row][col] = ' ';
                }
            }
        }

        // Choose a random move
        Random random = new Random();
        int row, col;
        do {
            row = random.nextInt(1,4);
            col = random.nextInt(1,4);
        } while (tablero[row][col] != ' ');

        return new int[] { row, col };
    }


    public char getWinner() {
        // Check rows
        for (int row = 0; row < 3; row++) {
            if (tablero[row][0] == tablero[row][1] && tablero[row][1] == tablero[row][2] && tablero[row][0] != ' ') {
                return tablero[row][0];
            }
        }

        // Check columns
        for (int col = 0; col < 3; col++) {
            if (tablero[0][col] == tablero[1][col] && tablero[1][col] == tablero[2][col] && tablero[0][col] != ' ') {
                return tablero[0][col];
            }
        }

        // Check diagonals
        if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[0][0] != ' ') {
            return tablero[0][0];
        }

        if (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0] && tablero[0][2] != ' ') {
            return tablero[0][2];
        }

        // Check if the game is a tie
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (tablero[row][col] == ' ') {
                    // There are still empty positions on the tablero, so the game is not over yet
                    return ' ';
                }
            }
        }

        // If no winner and no empty positions left, then it's a tie
        return 'T';
    }


    public void insercionM(int[] turnomaquina) {
        tablero[turnomaquina[0]][turnomaquina[1]] = 'O';
    }
}
