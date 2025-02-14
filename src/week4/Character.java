package week4;

public class Character {
    private int battlesWon;
    private int exPts;

    public Character(){
        this.battlesWon=0;
        this.exPts=0;
    }
    public void winBattle(int xp){
        this.exPts+=xp;
        this.battlesWon++;
    }
    public String toString(){
        String out="battles won: "+this.battlesWon;
        out+=" xp: "+this.exPts+"\n";
        return out;
    }
}
