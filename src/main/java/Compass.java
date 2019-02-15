import com.sun.org.apache.xpath.internal.operations.Bool;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Compass {
    int xCord;
    int yCord;

    public Compass(int xCord, int yCord) {
        this.xCord = xCord;
        this.yCord = yCord;
    }

    public int getxCord() {
        return xCord;
    }

    public int getyCord() {
        return yCord;
    }

    public void getDirection(int x, int y) { // could pass player object into here and use the .getxcord etc methods
        List directions = new ArrayList();
        directions.add("north");
        directions.add("east");
        directions.add("south");
        directions.add("west");

        if (x < xCord && y < yCord) {
            //System.out.println("the treasure is to the north east ");
        } else if (x > xCord && y > yCord) {
            //System.out.println("the treasure is to south west ");
        } else if (x > xCord && y < yCord) {
           // System.out.println("the treasure is to South East ");
        } else if (x < xCord && y > yCord) {
           // System.out.println("the treasure is North west");
        } else if (x > xCord && y == yCord) {
           // System.out.println("the treasure is to the south ");
        } else if (x < xCord && y == yCord) {
           // System.out.println("the treasure is to North ");
        } else if (y > yCord && x == xCord) {
            //System.out.println("the treasure is to  west I suggest going west");
        } else if (y < yCord && x == xCord) {
            //System.out.println("the treasure is to east lets go there!");
        }


        distanceToTreasure(x, xCord, y, yCord);


    }

    public void distanceToTreasure(int pX, int tX, int pY, int tY) {

        int distanceFromX = Math.abs(pX - tX);
        int distanceFromY = Math.abs(pY - tY);
        double totalDistance = Math.sqrt(Math.pow(distanceFromX, 2) + Math.pow(distanceFromY, 2)); // calculate accurate distance to treasure
        DecimalFormat df = new DecimalFormat("0.##");

        System.out.println("the compas is telling you that the treasure is " + df.format(totalDistance) + " meters away");


    }

    public Boolean isTreasureFound(int pX, int tX, int pY, int tY, Treasure t) { // this could take in just a player object and treasure object similarly to how  Obstacles class handles its method
        if (pX == tX && pY == tY) {
            t.setFound(true);
            System.out.println("you win! Congratulations " );
            return t.isFound();
        }
        return t.isFound();
    }
}

