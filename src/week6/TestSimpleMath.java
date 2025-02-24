package week6;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TestSimpleMath {
    @Test
    public void testMultiply(){
        ArrayList<MultiplyTestCase> tests=new ArrayList<>(
                Arrays.asList(
                        new MultiplyTestCase(1,1,1),
                        new MultiplyTestCase(10,5,50),
                        new MultiplyTestCase(2,4,8),
                        new MultiplyTestCase(0,19,0),
                        new MultiplyTestCase(45,0,0),
                        new MultiplyTestCase(0,0,0),
                        new MultiplyTestCase(-1,9,9),
                        new MultiplyTestCase(9,-5,-45),
                        new MultiplyTestCase(-2,-3,6),
                        new MultiplyTestCase(-7,-2,14)
                )
        );

        for (MultiplyTestCase test: tests){
            int firstToMult=test.getInputOne();
            int secondToMult=test.getInputTwo();
            int expectedOutput=test.getExpectedOutput();
            int actual=SimpleMath.multiplyInt(firstToMult,secondToMult);

            assertEquals("multiplyIn("+firstToMult+","+secondToMult+"):",expectedOutput,actual);
        }
    }
}
