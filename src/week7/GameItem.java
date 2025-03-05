package week7;

import week4.Player;

public class GameItem {
    private double xLoc;
    private double yLoc;

    public GameItem(double xloc,double yloc){
        this.xLoc=xloc;
        this.yLoc=yloc;
    }
    public void use(Player player){}
    public String toString(){
        String out="loc: ("+this.xLoc+","+this.yLoc+")";
        return out;
    }
}
