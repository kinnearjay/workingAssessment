import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Gamelogic {
    Random r = new Random();


    Player player = new Player(r.nextInt(10), r.nextInt(10));
    Treasure treasure = new Treasure(r.nextInt(25), r.nextInt(25));
    Compass comp = new Compass(treasure.getxCord(), treasure.getyCord());
    Trap trap1 = new Trap(r.nextInt(50), r.nextInt(50));
    Trap trap2 = new Trap(r.nextInt(50), r.nextInt(50));
    Trap trap3 = new Trap(r.nextInt(50), r.nextInt(50));
    Shuffle shuffler = new Shuffle();
    Obstacles ob = new Obstacles();


    Scanner sc = new Scanner(System.in);
    String move;

    public void play() {
        shuffler.trapShuffleTreasure(trap1, trap2, trap3, treasure);
        List<Trap> trapList = new ArrayList<Trap>();
        trapList.add(trap1);
        trapList.add(trap2);
        trapList.add(trap3);


        while (treasure.isFound() == false) {
            move = "";
            comp.getDirection(player.getxCord(), player.getyCord());
            treasure.setFound(comp.isTreasureFound(player.getxCord(), comp.getxCord(), player.getyCord(), comp.getyCord(), treasure));
            System.out.println("enter a direction N E S W");
            move = sc.nextLine(); // gets player movement
            // move controls
            if (move.toUpperCase().equals("N")) {
                player.setxCord(player.getxCord() + 1);
            } else if (move.toUpperCase().equals("S")) {
                player.setxCord(player.getxCord() - 1);
            } else if (move.toUpperCase().equals("E")) {
                player.setyCord(player.getyCord() + 1);
            } else if (move.toUpperCase().equals("W")) {
                player.setyCord(player.getyCord() - 1);
            }
            if (treasure.isFound() == true) { // fixes bug where the game asks for an input after the user has won
                break;
            }
            if (player.isAlive() == false) {
                break;
            }
            ob.trapCollision(player,trapList);


        }


    }

    public void gameIntro() {

        System.out.println("welcome to the game young adventurer please enter your name");
        player.setpName(sc.nextLine());
        System.out.println("Would you like to know how to play?  Y/N" );
        if(sc.nextLine().toUpperCase().equals("Y")){

            System.out.println("You have 4 directions to select from, your compass buddy will tell you where to go.");
            System.out.println("Enter N, E, S or W to travel in that direction and see what happens");
            System.out.println("welcome to the world " + player.getpName() + " we hope you have fun");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("######################################################################");
            System.out.println("--------------------------------------------------------------------");
            // allow the user to set number of traps for difficulty here
        }
        System.out.println("You awake in a dimly lit forest there are trees everywhere your only clue as to how to escape is a compass that seems to point erratically focusing on one direction");







    }


}
