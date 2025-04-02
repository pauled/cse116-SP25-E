package week7;

import week10.Player;
import week10.Usable;
import week10.Useless;

public class HealthPotion extends GameItem implements Usable, Useless {
    private int hpGain;

    public HealthPotion(double xloc,double yloc,int health){
        super(xloc, yloc);
        this.hpGain=health;
    }
    public void drink(){
        System.out.println("I taste good!");
    }
    public void use(Player player){
        player.takeDamage(-this.hpGain);
    }
}
