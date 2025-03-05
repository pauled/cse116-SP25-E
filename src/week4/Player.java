package week4;

import week7.GameItem;

public class Player extends GameItem {
    private int HP;
    private int maxHP;
    private int damageDealt;

    public Player(int maxHP){
        super(0,0);
        this.maxHP=maxHP;
        this.HP=maxHP;
        this.damageDealt=4;
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
    }
}
