import java.util.Scanner;
import java.util.*;
public class tictactoe 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char[][] board=new char[3][3];
        int row;
        int col;
        for(row=0;row<board.length;row++)
        {
            for(col=0;col<board.length;col++)
            {
                board[row][col]=' ';
            }
        }
        char player='X';
        boolean gameover=false;
        while(!gameover)
        {
            printBoard(board);
            System.out.println("player" +player + "enter:");
            row=sc.nextInt();
            col=sc.nextInt();
            if(board[row][col] == ' ')
            {
                board[row][col] = player;
                gameover=won(board,player);
                if(gameover)
                {
                    System.out.println("player" +player +"won!!!!");
                }
                else
                {
                    player =(player=='X' ? 'O' : 'X');
                }
            }
            else
            {
                System.out.println("try again!!!!!!!!");
            }
        }
        printBoard(board);
    }
    public static void printBoard(char[][]board)
    {
        for(int row=0;row<board.length;row++)
        {
            for(int col=0;col<board.length;col++)
            {
                System.out.print(board[row][col] +" |");
            }
            System.out.println();
        }
    }
    public static boolean won(char[][] board, char player)
    {
        for(int row=0;row<board.length;row++)
        {
            if(board[row][0]==player && board[row][1]==player && board[row][2]==player)
                return true;
        }
         for(int col=0;col<board[0].length;col++)
        {
            if(board[0][col]==player && board[1][col]==player && board[2][col]==player)
                return true;
        }
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player)
            return true;
        if(board[0][2] == player && board[1][1] == player && board[2][0] == player)
            return true;
        return false;
    }
}
