package week7;

import week10.Player;

public abstract class GameItem {
    private double xLoc;
    private double yLoc;

    public GameItem(double xloc,double yloc){
        this.xLoc=xloc;
        this.yLoc=yloc;
    }
    public void move(double dx,double dy){
        this.xLoc+=dx;
        this.yLoc-=dy;
    }

    public double getxLoc() {
        return xLoc;
    }

    public double getyLoc() {
        return yLoc;
    }

    //public abstract void use(Player player);

    public String toString(){
        String out="loc: ("+this.getxLoc()+","+this.getyLoc()+") "+super.toString();
        return out;
    }
}
