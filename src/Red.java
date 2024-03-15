public class Red extends Spaces {
    public Red(int row, int col) {
        super(row, col);
    }

    public String getSymbol() {
        return  "\u001B[44m \uD83D\uDD34 \u001B[0m";
    }

}
