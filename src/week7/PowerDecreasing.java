package week7;

public class PowerDecreasing extends Comparator<Weapon>{
    @Override
    public boolean compare(Weapon a, Weapon b) {
        return a.getDamage()>b.getDamage();
    }
}
