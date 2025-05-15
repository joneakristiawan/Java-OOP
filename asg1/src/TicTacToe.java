import java.util.Scanner;

public class TicTacToe {
    private static char[][] board = {{'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};
    private static char player = 'O';
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printBoard();
            System.out.print("Player " + player + " move (row col): ");
            int row = scanner.nextInt(), col = scanner.nextInt();
            
            if (board[row][col] == '-') {
                board[row][col] = player;
                if (checkWin()) {
                    printBoard();
                    System.out.println("Player " + player + " wins!");
                    break;
                }
                
                if (player == 'O') {
                    player = 'X';
                } else {
                    player = 'O';
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
        scanner.close();
    }
    
    private static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    private static boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
               (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }
}
