package week4;

public class Player {
    private int HP;
    private int maxHP;
    private int damageDealt;

    public Player(int maxHP){
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

    public int getHP() {
        return this.HP;
    }

    public static void main(String[] args) {
        Player p1=new Player(10);
        Player p2=new Player(8);
        Player p3=p1;
        p3.takeDamage(5);
        p1.takeDamage(p2.getDamageDealt());
    }
}
