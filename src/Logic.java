import java.util.Scanner;
public class Logic {
    private Spaces[][] connectFourBoard;
    private Scanner myScanner;
    public Logic() {
        myScanner = new Scanner(System.in);
    }
    public void start() {
        welcomeUser();
    }

    private void createEmptyBoard() {
        connectFourBoard = new Spaces[6][7];
        for(int i = 0; i < connectFourBoard.length; i++) {
            for(int j = 0; j < connectFourBoard[0].length; j++) {
                connectFourBoard[i][j] = new Spaces(i, j);
            }
        }
    }

    public void printConnectFourBoard() {
        for (int i = 0; i < connectFourBoard.length; i++) {
            for (int j = 0; j < connectFourBoard[0].length; j++) {
                System.out.print(connectFourBoard[i][j].getSymbol());
            }
            System.out.println();
        }
    }
    private void welcomeUser() {
        System.out.println("Welcome to Connect 4!");
        createEmptyBoard();
        play();
    }
    private boolean checkIfOver() {
        boolean over = false;
        for (int i = 0; i < connectFourBoard.length; i++) {
            String symbol = connectFourBoard[i][0].getSymbol();
            String symbol2 = connectFourBoard[i][0].getSymbol();
            for (int j = 1; j < 4; j++) {
                symbol2 = connectFourBoard[i][j].getSymbol();
            }
            if (symbol.equals(symbol2)) {
                return true;
            }
            symbol = connectFourBoard[i][1].getSymbol();
            symbol2 = connectFourBoard[i][1].getSymbol();
            for (int j = 2; j < 5; j++) {
                symbol2 = connectFourBoard[i][j].getSymbol();
            }
            if (symbol.equals(symbol2)) {
                return true;
            }
            symbol = connectFourBoard[i][2].getSymbol();
            symbol2 = connectFourBoard[i][2].getSymbol();
            for (int j = 3; j < 6; j++) {
                symbol2 = connectFourBoard[i][j].getSymbol();
            }
            if (symbol.equals(symbol2)) {
                return true;
            }
            symbol = connectFourBoard[i][3].getSymbol();
            symbol2 = connectFourBoard[i][3].getSymbol();
            for (int j = 4; j < 7; j++) {
                symbol2 = connectFourBoard[i][j].getSymbol();
            }
            if (symbol.equals(symbol2)) {
                return true;
            }
        }
    }
    private void play() {
        boolean gameOver = false;
        String turn = "red";
        while (!(gameOver)) {
            printConnectFourBoard();
            System.out.println("Player moving now: " + turn);
            if (turn.equals("red")) {
                System.out.print("Enter row number: ");
                int row = myScanner.nextInt() - 1;
                myScanner.nextLine();
                System.out.print("Enter column number: ");
                int col = myScanner.nextInt() - 1;
                myScanner.nextLine();
                if ((row >= 0 && row < 6) && (col >= 0 && col < 7) && connectFourBoard[row][col].getSymbol().equals("\u001B[44m ⚫ \u001B[0m")) {
                    if (row != 5) {
                        if (connectFourBoard[row + 1][col].getSymbol().equals("\u001B[44m ⚫ \u001B[0m")) {
                            System.out.println("Invalid coordinates");
                        } else {
                            Red r = new Red(row, col);
                            connectFourBoard[row][col] = r;
                            turn = "yellow";
                        }
                    } else {
                        Red r = new Red(row, col);
                        connectFourBoard[row][col] = r;;
                        turn = "yellow";
                    }
                } else {
                    System.out.println("Invalid coordinates");
                }
            } else {
                System.out.print("Enter row number: ");
                int row = myScanner.nextInt() - 1;
                myScanner.nextLine();
                System.out.print("Enter column number: ");
                int col = myScanner.nextInt() - 1;
                myScanner.nextLine();
                if ((row >= 0 && row < 6) && (col >= 0 && col < 7) && connectFourBoard[row][col].getSymbol().equals("\u001B[44m ⚫ \u001B[0m")) {
                    if (row != 5) {
                        if (connectFourBoard[row + 1][col].getSymbol().equals("\u001B[44m ⚫ \u001B[0m")) {
                            System.out.println("Invalid coordinates");
                        } else {
                            Yellow y = new Yellow(row, col);
                            connectFourBoard[row][col] = y;
                            turn = "red";
                        }
                    } else {
                        Yellow y = new Yellow(row, col);
                        connectFourBoard[row][col] = y;
                        turn = "red";
                    }
                } else {
                    System.out.println("Invalid coordinates");
                }
            }

        }

    }
}
