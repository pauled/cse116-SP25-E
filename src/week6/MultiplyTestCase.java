package week6;

public class MultiplyTestCase {
    private int inputOne;
    private int inputTwo;
    private int expectedOutput;
    public MultiplyTestCase(int one,int two,int expected){
        this.inputOne=one;
        this.inputTwo=two;
        this.expectedOutput=expected;
    }

    public int getInputOne() {
        return inputOne;
    }

    public int getInputTwo() {
        return inputTwo;
    }

    public int getExpectedOutput() {
        return expectedOutput;
    }
}
