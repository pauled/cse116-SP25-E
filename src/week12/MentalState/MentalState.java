package week12.MentalState;

public abstract class MentalState {
    protected Student brain;

    public MentalState(Student brain){
        this.brain=brain;
    }
    public abstract void study();
    public abstract void getCloserToExam();
    public abstract void expressFeelings();
    public void startSemester(){
        System.out.println("This is not possible from this state");
    }
}
