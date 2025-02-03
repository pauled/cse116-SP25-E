package week3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestCode {
    @Test
    public void testAddPositive() {
        int result=CodeToTest.add(1, 2);
        assertEquals("Expected 3 on (1,2) but got: "+result,3,result);
        result=CodeToTest.add(10, 5);
        assertEquals("Expected 5 on (10,5) but got: "+result,15,result);
        result=CodeToTest.add(3, 3);
        assertEquals("Expected 6 on (3,3) but got: "+result,6,result);
    }
    @Test
    public void testAddZero() {
        int result=CodeToTest.add(0, 2);
        assertEquals("Expected 2 on (0,2) but got: "+result,2,result);
        result=CodeToTest.add(10, 0);
        assertEquals("Expected 10 on (10,0) but got: "+result,10,result);
        result=CodeToTest.add(0, 0);
        assertEquals("Expected 0 on (0,0) but got: "+result,0,result);
    }
    @Test
    public void testAddNegative(){
        ArrayList<ArrayList<Integer>> tests=new ArrayList<>();
        tests.add(new ArrayList<>(Arrays.asList(-5,8,3)));
        tests.add(new ArrayList<>(Arrays.asList(-15,8,-7)));
        for (ArrayList<Integer> test : tests){
            int a=test.get(0);
            int b=test.get(1);
            int expected=test.get(2);
            int actual=CodeToTest.add(a,b);
            assertEquals("Expected "+expected+" on ("+a+","+b+") but got: "+actual,expected,actual);
        }
    }
}
