package week7;

import week4.Player;

public class Weapon extends GameItem{
    private int damage;

    public Weapon(double x,double y,int damage){
        super(x,y);
        this.damage=damage;
    }
    public void use(Player player){
        player.setDamageDealt(this.damage);
    }
    public String toString(){
        String out="damage: "+this.damage+" ";
        out+=super.toString();
        return out;
    }

    public static void main(String[] args) {
        Player p1=new Player(9);
        Weapon w=new Weapon(1,2,20);
        w.use(p1);
        System.out.println(p1);
        System.out.println(w);
        HealthPotion h=new HealthPotion(3,4,5);
        System.out.println(h);
    }
}
