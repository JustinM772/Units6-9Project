public class Spaces {
    private String symbol;
    private int row;
    private int col;
    public Spaces(int row, int col) {
        symbol = "\u001B[44m ⚫ \u001B[0m";
        this.row = row;
        this.col = col;
    }
    public String getSymbol() {
        return symbol;
    }
    public int getRow() {
        return row;
    }
    public int getCol() {
        return col;
    }
    public void setSymbol(String newSymbol) {
        symbol = newSymbol;
    }
}
