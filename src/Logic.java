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

    public void createEmptyBoard() {
        connectFourBoard = new Spaces[6][7];
        for(int i = 0; i < connectFourBoard.length; i++) {
            for(int j = 0; j < connectFourBoard[0].length; j++) {
                connectFourBoard[i][j] = new Spaces(i, j);
            }
        }
    }
    public void welcomeUser() {
        System.out.println("Welcome to Connect 4!");
        createEmptyBoard();
    }
}
