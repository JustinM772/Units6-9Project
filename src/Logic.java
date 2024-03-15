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

    private void printConnectFourBoard() {
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
        // horizontal check
        for (int i = 0; i < connectFourBoard.length; i++) {
            String symbol = connectFourBoard[i][0].getSymbol();
            String symbol2 = connectFourBoard[i][0].getSymbol();
            for (int j = 1; j < 4; j++) {
                symbol2 = connectFourBoard[i][j].getSymbol();
                if (!(symbol2.equals(symbol))) {
                    break;
                }
            }
            if (symbol.equals(symbol2) && !(symbol.equals("\u001B[44m ⚫ \u001B[0m"))) {
                return true;
            }
            symbol = connectFourBoard[i][1].getSymbol();
            symbol2 = connectFourBoard[i][1].getSymbol();
            for (int j = 2; j < 5; j++) {
                symbol2 = connectFourBoard[i][j].getSymbol();
                if (!(symbol2.equals(symbol))) {
                    break;
                }
            }
            if (symbol.equals(symbol2) && !(symbol.equals("\u001B[44m ⚫ \u001B[0m"))) {
                return true;
            }
            symbol = connectFourBoard[i][2].getSymbol();
            symbol2 = connectFourBoard[i][2].getSymbol();
            for (int j = 3; j < 6; j++) {
                symbol2 = connectFourBoard[i][j].getSymbol();
                if (!(symbol2.equals(symbol))) {
                    break;
                }
            }
            if (symbol.equals(symbol2) && !(symbol.equals("\u001B[44m ⚫ \u001B[0m"))) {
                return true;
            }
            symbol = connectFourBoard[i][3].getSymbol();
            symbol2 = connectFourBoard[i][3].getSymbol();
            for (int j = 4; j < 7; j++) {
                symbol2 = connectFourBoard[i][j].getSymbol();
                if (!(symbol2.equals(symbol))) {
                    break;
                }
            }
            if (symbol.equals(symbol2) && !(symbol.equals("\u001B[44m ⚫ \u001B[0m"))) {
                return true;
            }
        }
        // vertical check
        for (int j = 0; j < connectFourBoard[0].length; j++) {
            String symbol = connectFourBoard[0][j].getSymbol();
            String symbol2 = connectFourBoard[0][j].getSymbol();
            for (int i = 1; i < 4; i++) {
                symbol2 = connectFourBoard[i][j].getSymbol();
                if (!(symbol2.equals(symbol))) {
                    break;
                }
            }
            if (symbol.equals(symbol2) && !(symbol.equals("\u001B[44m ⚫ \u001B[0m"))) {
                return true;
            }
            symbol = connectFourBoard[1][j].getSymbol();
            symbol2 = connectFourBoard[1][j].getSymbol();
            for (int i = 2; i < 5; i++) {
                symbol2 = connectFourBoard[i][j].getSymbol();
                if (!(symbol2.equals(symbol))) {
                    break;
                }
            }
            if (symbol.equals(symbol2) && !(symbol.equals("\u001B[44m ⚫ \u001B[0m"))) {
                return true;
            }
            symbol = connectFourBoard[2][j].getSymbol();
            symbol2 = connectFourBoard[2][j].getSymbol();
            for (int i = 3; i < 6; i++) {
                symbol2 = connectFourBoard[i][j].getSymbol();
                if (!(symbol2.equals(symbol))) {
                    break;
                }
            }
            if (symbol.equals(symbol2) && !(symbol.equals("\u001B[44m ⚫ \u001B[0m"))) {
                return true;
            }
        }
        // diagonal check
        for (int i = 0; i < 3; i++) {
            String symbol = connectFourBoard[i][0].getSymbol();
            String symbol2 = connectFourBoard[i][0].getSymbol();
            int x = 1;
            for (int j = 1; j < 4; j++) {
                symbol2 = connectFourBoard[i + x][j].getSymbol();
                if (!(symbol2.equals(symbol))) {
                    break;
                }
                x++;
            }
            if (symbol.equals(symbol2) && !(symbol.equals("\u001B[44m ⚫ \u001B[0m"))) {
                return true;
            }
            symbol = connectFourBoard[i][1].getSymbol();
            symbol2 = connectFourBoard[i][1].getSymbol();
            x = 1;
            for (int j = 2; j < 5; j++) {
                symbol2 = connectFourBoard[i + x][j].getSymbol();
                if (!(symbol2.equals(symbol))) {
                    break;
                }
                x++;
            }
            if (symbol.equals(symbol2) && !(symbol.equals("\u001B[44m ⚫ \u001B[0m"))) {
                return true;
            }
            symbol = connectFourBoard[i][2].getSymbol();
            symbol2 = connectFourBoard[i][2].getSymbol();
            x = 1;
            for (int j = 3; j < 6; j++) {
                symbol2 = connectFourBoard[i + x][j].getSymbol();
                if (!(symbol2.equals(symbol))) {
                    break;
                }
                x++;
            }
            if (symbol.equals(symbol2) && !(symbol.equals("\u001B[44m ⚫ \u001B[0m"))) {
                return true;
            }
            symbol = connectFourBoard[i][3].getSymbol();
            symbol2 = connectFourBoard[i][3].getSymbol();
            x = 1;
            for (int j = 4; j < 7; j++) {
                symbol2 = connectFourBoard[i + x][j].getSymbol();
                if (!(symbol2.equals(symbol))) {
                    break;
                }
                x++;
            }
            if (symbol.equals(symbol2) && !(symbol.equals("\u001B[44m ⚫ \u001B[0m"))) {
                return true;
            }
        }
        for (int i = 5; i > 2; i--) {
            String symbol = connectFourBoard[i][0].getSymbol();
            String symbol2 = connectFourBoard[i][0].getSymbol();
            int x = 1;
            for (int j = 1; j < 4; j++) {
                symbol2 = connectFourBoard[i - x][j].getSymbol();
                if (!(symbol2.equals(symbol))) {
                    break;
                }
                x++;
            }
            if (symbol.equals(symbol2) && !(symbol.equals("\u001B[44m ⚫ \u001B[0m"))) {
                return true;
            }
            symbol = connectFourBoard[i][1].getSymbol();
            symbol2 = connectFourBoard[i][1].getSymbol();
            x = 1;
            for (int j = 2; j < 5; j++) {
                symbol2 = connectFourBoard[i - x][j].getSymbol();
                if (!(symbol2.equals(symbol))) {
                    break;
                }
                x++;
            }
            if (symbol.equals(symbol2) && !(symbol.equals("\u001B[44m ⚫ \u001B[0m"))) {
                return true;
            }
            symbol = connectFourBoard[i][2].getSymbol();
            symbol2 = connectFourBoard[i][2].getSymbol();
            x = 1;
            for (int j = 3; j < 6; j++) {
                symbol2 = connectFourBoard[i - x][j].getSymbol();
                if (!(symbol2.equals(symbol))) {
                    break;
                }
                x++;
            }
            if (symbol.equals(symbol2) && !(symbol.equals("\u001B[44m ⚫ \u001B[0m"))) {
                return true;
            }
            symbol = connectFourBoard[i][3].getSymbol();
            symbol2 = connectFourBoard[i][3].getSymbol();
            x = 1;
            for (int j = 4; j < 7; j++) {
                symbol2 = connectFourBoard[i - x][j].getSymbol();
                if (!(symbol2.equals(symbol))) {
                    break;
                }
                x++;
            }
            if (symbol.equals(symbol2) && !(symbol.equals("\u001B[44m ⚫ \u001B[0m"))) {
                return true;
            }
        }
        return false;
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
            if (checkIfOver()) {
                gameOver = true;
                printConnectFourBoard();
            }
        }
        System.out.println("Do you want to play again?(y/n)");
        String answer = myScanner.nextLine();
        if (answer.equals("y")) {
            welcomeUser();
        } else {
            System.out.println("You quit the game\nBye!!!!");
        }
    }
}
