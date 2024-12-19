
import java.util.Scanner;

public class TicTacToe {
    private static char[][] board = new char[3][3];

    public static void main(String[] args) {
        initializeBoard();
        char currentPlayer = 'X';

        while (true) {
            displayBoard();
            System.out.println("Player " + currentPlayer + "'s turn:");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter row (0-2): ");
            int row = scanner.nextInt();
            System.out.print("Enter column (0-2): ");
            int col = scanner.nextInt();

            if (makeMove(row, col, currentPlayer)) {
                if (checkWin(currentPlayer)) {
                    displayBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    break;
                } else if (isDraw()) {
                    displayBoard();
                    System.out.println("It's a draw!");
                    break;
                }
                // Switch player
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    private static void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("-----");
        }
    }

    private static boolean makeMove(int row, int col, char player) {
        if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
            return false; // Invalid move
        }
        board[row][col] = player;
        return true;
    }

    private static boolean checkWin(char player) {
        for (int i = 0; i < 3; i++) {
            // Check rows and columns
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        // Check diagonals
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }
        return false;
    }

    private static boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false; // Empty space found
                }
            }
        }
        return true; // No empty spaces
    }
}
