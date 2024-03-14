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
                System.out.print(connectFourBoard[i][j]);
            }
            System.out.println();
        }
    }
    private void welcomeUser() {
        System.out.println("Welcome to Connect 4!");
        createEmptyBoard();
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
                int row = myScanner.nextInt();
                myScanner.nextLine();
                System.out.print("Enter column number: ");
                int col = myScanner.nextInt();
                myScanner.nextLine();
                if ((row > 0 && row < 6) && (col > 0 && col < 7) && connectFourBoard[row][col].getSymbol().equals("⬜")) {
                    if (row != 5) {
                        if (connectFourBoard[row + 1][col].getSymbol().equals("⬜")) {
                            System.out.println("Invalid coordinates");
                        } else {
                            ;
                        }
                    } else {
                        ;
                    }
                } else {
                    System.out.println("Invalid coordinates");
                }
            } else {
                System.out.print("Enter row number: ");
                int row = myScanner.nextInt();
                myScanner.nextLine();
                System.out.print("Enter column number: ");
                int col = myScanner.nextInt();
                myScanner.nextLine();
                if ((row > 0 && row < 6) && (col > 0 && col < 7) && connectFourBoard[row][col].getSymbol().equals("⬜")) {
                    if (row != 5) {
                        if (connectFourBoard[row + 1][col].getSymbol().equals("⬜")) {
                            System.out.println("Invalid coordinates");
                        } else {
                            ;
                        }
                    } else {
                        ;
                    }
                } else {
                    System.out.println("Invalid coordinates");
                }
            }

        }

    }
}
