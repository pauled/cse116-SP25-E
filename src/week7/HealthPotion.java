package week7;

import week4.Player;

public class HealthPotion extends GameItem{
    private int hpGain;

    public HealthPotion(double xloc,double yloc,int health){
        super(xloc, yloc);
        this.hpGain=health;
    }
    public void use(Player player){
        player.takeDamage(-this.hpGain);
    }
}
