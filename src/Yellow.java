public class Yellow extends Spaces{
    public Yellow(int row, int col) {
        super(row, col);
    }

    public String getSymbol() {
        return  "\u001B[44m \uD83D\uDFE1 \u001B[0m";
    }
}
