package week12.MentalState;

public class Panic extends MentalState{
    public Panic(Student brain){
        super(brain);
    }
    public void study(){
        this.brain.setState(new Calm(this.brain));
    }
    public void getCloserToExam(){
        System.out.println("all my drinks are shaken and not stired");
    }
    public void expressFeelings(){
        System.out.println("I AM FREAKING OUT MAN!");
    }
}
