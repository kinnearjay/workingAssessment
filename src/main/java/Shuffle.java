import java.util.Random;

public class Shuffle {

    public void trapShuffleTreasure(Trap a, Trap b, Trap c, Treasure t) {
        if (a.getTrapX() == t.getxCord() && a.getTrapY() == t.getyCord()) {
            Random r = new Random();
            a.setTrapX(r.nextInt(50));
            a.setTrapY(r.nextInt(50));
        }
        if (b.getTrapX() == t.getxCord() && b.getTrapY() == t.getyCord()) {
            Random r = new Random();
            b.setTrapX(r.nextInt(50));
            b.setTrapY(r.nextInt(50));
        }
        if (c.getTrapX() == t.getxCord() && c.getTrapY() == t.getyCord()) {
            Random r = new Random();
            c.setTrapX(r.nextInt(50));
            c.setTrapY(r.nextInt(50));
        }

    }
}
