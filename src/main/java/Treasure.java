public class Treasure {
    private boolean found = false;
    private int xCord;
    private int yCord;

    public Treasure(int xCord, int yCord) {
        this.xCord = xCord;
        this.yCord = yCord;
    }

    public int getxCord() {
        return xCord;
    }

    public void setxCord(int xCord) {
        this.xCord = xCord;
    }

    public int getyCord() {
        return yCord;
    }

    public void setyCord(int yCord) {
        this.yCord = yCord;
    }

    public boolean isFound() {
        return found;
    }

    public void setFound(boolean found) {
        this.found = found;
    }
}
