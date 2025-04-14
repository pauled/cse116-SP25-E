package week12;

public class Car {
    private boolean totaled;

    public Car(){
        this.totaled=false;
    }
    public void smash(){
        this.totaled=true;
    }
    public void drive(boolean overweight){
        if (this.totaled){
            System.out.println("Can't drive totaled car");
        } else if (overweight){
            System.out.println("Damage the suspension");
        } else {
            System.out.println("Drive drive drivey drive drive");
        }
    }
}
