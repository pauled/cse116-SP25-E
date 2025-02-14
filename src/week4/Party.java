package week4;

import java.util.ArrayList;

public class Party {
    private ArrayList<Character> members;
    private int battlesWon;

    public Party(){
        this.battlesWon=0;
        this.members=new ArrayList<>();
    }
    public void addCharacter(Character member){
        this.members.add(member);
    }
    public void winBattle(int xp){
        this.battlesWon++;
        for (int x=0;x<this.members.size(); x++){
            this.members.get(x).winBattle(xp);
        }
    }
    public String toString(){
        String out="battles won: "+this.battlesWon+"\n";
        for (Character mem: this.members){
            out+="-"+mem;
        }
        return out;
    }

    public static void main(String[] args) {
        Character hero=new Character();
        Character hero2=new Character();
        hero.winBattle(10);
        Party  party=new Party();
        party.addCharacter(hero);
        party.addCharacter(hero2);
        party.winBattle(20);
        System.out.println(party);
    }
}
