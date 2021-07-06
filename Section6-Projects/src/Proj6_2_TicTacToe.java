import java.util.Random;
import java.util.Scanner;

public class Proj6_2_TicTacToe {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        do {
            runGame(keyboard);
        } while(playAnother(keyboard));
        System.out.println("Thanks for Playing!");
    } // end main
    public static boolean playAnother(Scanner keyboard) {
        String prompt = "Enter Y or y to play another game.. \t";
        System.out.print(prompt);
        char another = keyboard.next().charAt(0);
        keyboard.nextLine();
        return another == 'Y' | another == 'y';
    }
    public static void runGame(Scanner keyboard) {
        Random rand = new Random();
        char[] players = new char[2];
        players[0] = 'X';
        players[1] = 'O';
        int currPlayerIndex = rand.nextInt(2);
        char[][] grid = initializeGame();
        while (!isGameOver(grid)) {
            move(keyboard, players[currPlayerIndex],grid);
            currPlayerIndex = 1 - currPlayerIndex;
        }
    } // end runGame
    public static boolean isGameOver(char[][] grid) {
        char zeroZero = grid[0][0];
        char zeroOne = grid[0][1];
        char zeroTwo = grid[0][2];
        char oneZero = grid[1][0];
        char oneOne = grid[1][1];
        char oneTwo = grid[1][2];
        char twoZero = grid[2][0];
        char twoOne = grid[2][1];
        char twoTwo = grid[2][2];
        // Winning cases are checked using 3 reference cells 0,0 1,1 and 2,2
        // We will use zeroZero of row 0 and column 0
        if (zeroZero == 'X' | zeroZero == 'O') {
            if (
                    (zeroZero == zeroOne & zeroZero == zeroTwo) |
                            (zeroZero == oneZero & zeroZero == twoZero)
            ) {
                System.out.println("Player " + zeroZero + " has won! Congratulations!");
                return true;
            }
        }
        // we will use twoTwo for row 2 and column 2
        if (twoTwo == 'X' | twoTwo == 'O') {
            if (
                    (twoTwo == zeroTwo & twoTwo == oneTwo) |
                            (twoTwo == twoZero & twoTwo == twoOne)
            ) {
                System.out.println("Player " + twoTwo + " has won! Congratulations!");
                return true;
            }

        }
        // we will use oneOne for row 1, column 1, diags
        if (oneOne == 'X' | oneOne == 'O') {
            if (
                    (oneOne == zeroZero & oneOne == twoTwo) |
                            (oneOne == zeroTwo & oneOne == twoZero) |
                            (oneOne == zeroOne & oneOne == twoOne) |
                            (oneOne == oneZero & oneOne == oneTwo)
            ) {
                System.out.println("Player " + oneOne + " has won! Congratulations!");
                return true;
            }
        }
        // now let's check if all cells occupied
        boolean allCellsOccupied = true;
        for (char[] row: grid) {
            for (char value: row) {
                if (value == ' ') {
                    allCellsOccupied = false;
                    break;
                }
            }
            if (!allCellsOccupied) {
                break;
            }
        }
        if (allCellsOccupied) {
            System.out.println("Game is over! It is a draw!");
            return true;
        }
        return false;
    } // end isGameOver;
    public static void move(Scanner keyboard, char player, char[][] grid) {
        String prompt = "Player " + player + ", play in any cell e.g 0,1 to place in 1st row 2nd column\t";
        boolean insertSuccess = false;
        String input;
        String rowStr;
        String columnStr;
        int row;
        int column;
        int whereIsComma;
        do {
            System.out.print(prompt);
            input = keyboard.nextLine();
            whereIsComma = input.indexOf(",");
            if (whereIsComma < 0) {
                continue;
            }
            try {
                rowStr = input.substring(0, whereIsComma);
                columnStr = input.substring(whereIsComma + 1);
                row = Integer.parseInt(rowStr);
                column = Integer.parseInt(columnStr);
            } catch (NumberFormatException nfe) {
                continue;
            }
            insertSuccess = insertCharIntoGrid(grid, row, column, player);
        } while (!insertSuccess);
        printGrid(grid);
    } // end move
    public static char[][] initializeGame() {
        char[][] grid = new char[3][3];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = ' ';
            }
        }
        printGrid(grid);
        return grid;
    } // end initializeGame
    public static void printGrid(char[][] grid) {
        for(int i = 0; i < grid.length; i++) {
            if (i != 0) {
                System.out.println("===========");
            }
            printRow(grid[i]);
        }
    } // end printGrid
    public static void printRow(char[] row) {
        for (int i = 0; i < row.length; i++) {
            if (i != 0) {
                System.out.print("|");
            }
            System.out.print(" " + row[i] + " ");
        }
        System.out.println();
    } // end printRow
    public static boolean isCellOccupied (char[][] grid, int row, int column) {
        if (grid[row][column] == 'X' | grid[row][column] == 'O') {
            return true;
        }
        return false;
    } // end isCellOccupied
    public static boolean insertCharIntoGrid(char[][] grid, int row, int column, char value) {
        if (row < 0 || row > grid.length || column < 0 || column > grid[row].length) {
            System.out.println("Please enter a valid location for row and column (0, 1, or 2)");
            return false;
        }
        if (isCellOccupied(grid, row, column)) {
            System.out.println("That place is already occupied!");
            return false;
        }
        grid[row][column] = value;
        return true;
    } // end insertCharIntoGrid
}
