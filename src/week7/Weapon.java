package week7;

import week10.Player;
import week10.Usable;

public class Weapon extends GameItem implements Usable {
    private int damage;

    public Weapon(double x,double y,int damage){
        super(x,y);
        this.damage=damage;
    }
    public void use(Player player){
        player.setDamageDealt(this.damage);
    }
    public int getDamage(){
        return this.damage;
    }
    public String toString(){
        String out="damage: "+this.damage+" ";
        out+=super.toString();
        return out;
    }

    public static void main(String[] args) {
        /*
        Player p1=new Player(9);
        Weapon w=new Weapon(1,2,20);
        w.use(p1);
        System.out.println(p1);
        System.out.println(w);
        HealthPotion h=new HealthPotion(3,4,5);
        System.out.println(h);
        w.move(10,10);
        System.out.println(w);
        p1.move(13,13);
        System.out.println(p1);

         */
        Weapon w=new Weapon(1,2,20);
        w.move(10,10);
        String temp=w.toString();
        System.out.println(temp);
    }
}
