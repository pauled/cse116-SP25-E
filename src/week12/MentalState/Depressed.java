package week12.MentalState;

public class Depressed extends MentalState{
    public Depressed(Student brain){
        super(brain);
    }
    public void study(){
        System.out.println("I need to learn this");
    }
    public void getCloserToExam(){
        System.out.println("practice practice practice");
    }
    public void expressFeelings(){
        System.out.println("how could I fail");
    }
    public void startSemester(){
        this.brain.setState(new Panic(this.brain));
    }
}