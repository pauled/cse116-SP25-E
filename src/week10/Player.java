package week10;

import week7.GameItem;
import week7.HealthPotion;
import week7.Weapon;

import java.util.ArrayList;

public class Player extends GameItem {
    private int HP;
    private int maxHP;
    private int damageDealt;
    private ArrayList<GameItem> inventory;

    public Player(int maxHP){
        super(0,0);
        this.maxHP=maxHP;
        this.HP=maxHP;
        this.damageDealt=4;
        this.inventory=new ArrayList<>();
    }
    public void pickupItem(GameItem gi){
        this.inventory.add(gi);
    }
    public void takeDamage(int damage){
        this.HP-=damage;
    }
    public int getDamageDealt(){
        return this.damageDealt;
    }
    public int getMaxHP(){
        return this.maxHP;
    }
    public void setDamageDealt(int damage){
        this.damageDealt=damage;
    }
    public int getHP() {
        return this.HP;
    }

    @Override
    public String toString() {
        return super.toString()+" Health: " + HP + "/" +maxHP +
                ", damageDealt=" + damageDealt;
    }

    public static void main(String[] args) {
        Player p1=new Player(10);
        Player p2=new Player(8);
        Player p3=p1;
        p3.takeDamage(5);
        p1.takeDamage(p2.getDamageDealt());

        HealthPotion hp1=new HealthPotion(1,2,10);
        GameItem gi1=new HealthPotion(3,4,20);
        hp1.drink();
        System.out.println(p1);
        gi1.use(p1);
        System.out.println(p1);
        p2.use(p1);
        System.out.println(p1);
        //gi1.drink();
        HealthPotion hp2=(HealthPotion) gi1;
        hp2.drink();
        Weapon weapon=new Weapon(5,6,10);
        p1.pickupItem(hp1);
        p1.pickupItem(weapon);
        p1.pickupItem(gi1);
    }
}
