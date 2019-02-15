public class Player {
    private int xCord;
    private int yCord;
    private String pName = "player";
    private boolean alive = true;
    private int movesMade = 0;

    public int getMovesMade() {
        return movesMade;
    }

    public void setMovesMade(int movesMade) {
        this.movesMade = movesMade;
    }

    public Player(int xCord, int yCord) {
        this.xCord = xCord;
        this.yCord = yCord;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
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

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }
}
