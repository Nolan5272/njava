import java.util.Scanner;
import java.util.Random;

public class snake{
    static char[][] board = new char[9][30];
    static int lastX = 0;
    static int lastY = 0;
    static int gameBool = 0;
    static int applesEat = 0;

    public static void main(String[] args){
        InitializeBoard();
        AppleRandom();

        while(gameBool == 0){
            PrintBoard();
            GetMovement();
        }

    }

    public static void InitializeBoard(){
        gameBool = 0;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 30; j++){
                if (i == 4 && j == 15){
                    board[i][j] = 'S';
                    lastY = i;
                    lastX = j;
                }
                else if (board[i][j] == 0){
                    board[i][j] = '_';
                }
            }
        }
    }

    public static void AppleRandom(){
        Random rand = new Random();
        int x = rand.nextInt(30);
        int y = rand.nextInt(9);

        while (board[y][x] != '_'){
            x = rand.nextInt(30);
            y = rand.nextInt(9);
            //System.out.println("Generating new apple placement");
        }
        board[y][x] = 'A';
        int first = 0;
        if (first != 0){
            applesEat++;
        }
        first++;
    }

    public static void PrintBoard(){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 30; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

    }

    public static void GetMovement(){
        Scanner input = new Scanner(System.in);
        char nextMove = ' ';
        int movebool = 0;

        while (movebool == 0) {
            System.out.print("input next move: ");
            nextMove = input.next().charAt(0);

            if (nextMove == 'w'){
                if ((lastY - 1) >= 0){
                    board[lastY][lastX] = '_';
                    lastY--;
                    board[lastY][lastX] = 'S';
                }
                else{
                    System.out.println("dead");
                    gameBool = 1;
                    movebool = 1;
                    input.close();
                    break;
                }
                movebool = 1;
                break;
            }
            else if (nextMove == 'a'){
                if ((lastX - 1) >= 0){
                    board[lastY][lastX] = '_';
                    lastX--;
                    board[lastY][lastX] = 'S';
                }
                else{
                    System.out.println("dead");
                    gameBool = 1;
                    movebool = 1;
                    input.close();
                    break;
                }
                movebool = 1;
                break;
            }
            else if (nextMove == 's'){
                if ((lastY + 1) <= 8){
                    board[lastY][lastX] = '_';
                    lastY++;
                    board[lastY][lastX] = 'S';

                }
                else{
                    System.out.println("dead");
                    gameBool = 1;
                    movebool = 1;
                    input.close();
                    break;
                }
                movebool = 1;
                break;
            }
            else if (nextMove == 'd'){
                if ((lastX + 1) <= 29){
                    board[lastY][lastX] = '_';
                    lastX++;
                    board[lastY][lastX] = 'S';
                }
                else{
                    System.out.println("dead");
                    gameBool = 1;
                    movebool = 1;
                    input.close();
                    break;
                }
                movebool = 1;
                break;
            }
            else {
                System.out.println("W A S D");
                continue;
            }
        }

    }

}