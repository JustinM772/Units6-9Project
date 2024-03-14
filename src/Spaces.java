public class Spaces {
    private int row;
    private int col;
    public Spaces(int row, int col) {
        this.row = row;
        this.col = col;
    }
    public String getSymbol() {
        return  "⬜";
    }
    public int getRow() {
        return row;
    }
    public int getCol() {
        return col;
    }

}
