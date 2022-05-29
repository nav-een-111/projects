import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame<Private> {
    public static void main(String[] args) {
        char[][] board = {{' ', ' ', ' '},
                          {' ', ' ', ' '},
                          {' ', ' ', ' '}};
        GameBoard(board);
        Scanner scan = new Scanner(System.in);
        while(true) {
            PlayerTurn(board, scan);
            if(isGameOver(board))
                break;

            GameBoard(board);

            ComputerTurn(board);
            if(isGameOver(board))
                break;

            GameBoard(board);
        }


    }

    private static void GameBoard(char[][] board) {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }

    private static void PlayerTurn(char[][] board, Scanner scan){
        int PlayerMove;
        while(true) {
            System.out.println("enter a number from (1-9): ");
            PlayerMove = scan.nextInt();
            if( isValid(board,PlayerMove) )
                break;
        }
        Move(board, PlayerMove, 'x');
    }

    private static void ComputerTurn(char[][] board) {
        Random rand = new Random();
        int ComputerMove;
        while(true){
            ComputerMove = rand.nextInt(9)+1;
            if( isValid(board,ComputerMove))
                break;
        }
        System.out.println(ComputerMove + " is computer move");
        Move(board,ComputerMove,'O');
    }

    private static boolean isValid (char[][] board , int positions ) {
        switch (positions) {
            case 1:
                return (board[0][0] == ' ');

            case 2:
                return (board[0][1] == ' ');

            case 3:
                return (board[0][2] == ' ');

            case 4:
                return (board[1][0] == ' ');

            case 5:
                return (board[1][1] == ' ');

            case 6:
                return (board[1][2] == ' ');

            case 7:
                return (board[2][0] == ' ');

            case 8:
                return (board[2][1] == ' ');

            case 9:
                return (board[2][2] == ' ');

            default:
                return false;
        }
    }

    private static void Move(char[][] board, int Positions ,char Symbol) {


        switch (Positions) {
            case 1:
                board[0][0] = Symbol;
                break;
            case 2:
                board[0][1] = Symbol;
                break;
            case 3:
                board[0][2] = Symbol;
                break;
            case 4:
                board[1][0] = Symbol;
                break;
            case 5:
                board[1][1] = Symbol;
                break;
            case 6:
                board[1][2] = Symbol;
                break;
            case 7:
                board[2][0] = Symbol;
                break;
            case 8:
                board[2][1] = Symbol;
                break;
            case 9:
                board[2][2] = Symbol;
                break;
            default:
                System.out.println(":)");

        }
    }

    private static boolean isGameOver(char[][] board) {
        if(board[0][0]=='x' && board[0][1]=='x'&& board[0][2]=='x' || board[1][0]=='x' && board[1][1]=='x' && board[1][2]=='x' ||
                board[2][0]=='x' && board[2][1]=='x' && board[2][2]=='x'|| board[0][0]=='x' && board[1][0]=='x' && board[2][0]=='x'||
                board[0][1]=='x' && board[1][1]=='x' && board[2][1]=='x' || board[0][2]=='x' && board[1][2]=='x' && board[2][2]=='x' ||
                board[0][0]=='x' && board[1][1]=='x' && board[2][2]=='x' || board[0][2]=='x' && board[1][1]=='x' && board[2][0]=='x'){

            GameBoard(board);
            System.out.println("YOU WON !!!!!!!!!!!!");

            return true;
        }
        else if(board[0][0]=='O' && board[0][1]=='O' && board[0][2]=='O' || board[1][0]=='O' && board[1][1]=='O' && board[1][2]=='O' ||
                board[2][0]=='O' && board[2][1]=='O' && board[2][2]=='O' || board[0][0]=='O' && board[1][0]=='O' && board[2][0]=='O' ||
                board[0][1]=='O' && board[1][1]=='O' && board[2][1]=='O' || board[0][2]=='O' && board[1][2]=='O' && board[2][2]=='O' ||
                board[0][0]=='O' && board[1][1]=='O' && board[2][2]=='O' || board[0][2]=='O' && board[1][1]=='O' && board[2][0]=='O') {

            GameBoard(board);
            System.out.println(" GAME OVER ........COMPUTER WON !!!!!!!!!!!!");

            return true;
        }

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]== ' '){
                    return false;
                }
            }
        }
        GameBoard(board);
        System.out.println("THE GAME ENDED IN TIE.......");


        return true;
    }
}
