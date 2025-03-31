package week7;

import week10.Player;

public class HealthPotion extends GameItem{
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
