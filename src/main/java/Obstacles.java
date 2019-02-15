import java.util.List;

public class Obstacles {

    public boolean trapCollision(Player p, List<Trap> lT) {
        for (int i = 0; i < lT.size(); i++ ){
            if (p.getxCord() == lT.get(i).getTrapX() && p.getyCord() == lT.get(i).getTrapY()) {
                p.setAlive(false);
                System.out.println("A tree branch gets ripped off by a strong gust of wind, you died x.x");
                return p.isAlive();
            }

        }
        return p.isAlive();
    }
}
