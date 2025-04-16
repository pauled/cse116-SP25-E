package week12.MentalState;

public class Chillin extends MentalState{
    public Chillin(Student brain){
        super(brain);
    }
    public void study(){
        System.out.println("I am such a good student I study after the class");
    }
    public void getCloserToExam(){
        System.out.println("I am so good I take exams after I'm done");
    }
    public void expressFeelings(){
        System.out.println("I am done");
    }
    public void startSemester(){
        this.brain.setState(new Calm(this.brain));
    }
}
