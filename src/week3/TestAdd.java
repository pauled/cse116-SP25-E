package week3;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class TestAdd {
    @Test
    public void testAddPotisitves(){
        ArrayList<ArrayList<Integer>> tests=new ArrayList<>();
        tests.add(new ArrayList<>(Arrays.asList(1,5,6)));
        tests.add(new ArrayList<>(Arrays.asList(21,11,32)));
        tests.add(new ArrayList<>(Arrays.asList(7,7,14)));
        for (ArrayList<Integer> test : tests){
            int a=test.get(0);
            int b=test.get(1);
            int expected=test.get(2);
            int actual=FirstRecursion.add(a,b);
            assertEquals("add("+a+","+b+")",expected,actual);
        }
    }
    @Test
    public void testAddZeros(){
        ArrayList<ArrayList<Integer>> tests=new ArrayList<>();
        tests.add(new ArrayList<>(Arrays.asList(0,5,5)));
        tests.add(new ArrayList<>(Arrays.asList(21,0,21)));
        tests.add(new ArrayList<>(Arrays.asList(0,-5,-5)));
        tests.add(new ArrayList<>(Arrays.asList(-21,0,-21)));
        tests.add(new ArrayList<>(Arrays.asList(0,0,0)));
        for (ArrayList<Integer> test : tests){
            int a=test.get(0);
            int b=test.get(1);
            int expected=test.get(2);
            int actual=FirstRecursion.add(a,b);
            assertEquals("add("+a+","+b+")",expected,actual);
        }
    }
    @Test
    public void testAddNegatives(){
        ArrayList<ArrayList<Integer>> tests=new ArrayList<>();
        tests.add(new ArrayList<>(Arrays.asList(-5,-5,-10)));
        tests.add(new ArrayList<>(Arrays.asList(-5,5,0)));
        tests.add(new ArrayList<>(Arrays.asList(-21,-10,-31)));
        tests.add(new ArrayList<>(Arrays.asList(-5,-50,-55)));
        tests.add(new ArrayList<>(Arrays.asList(-21,10,-11)));
        tests.add(new ArrayList<>(Arrays.asList(-3,9,6)));
        tests.add(new ArrayList<>(Arrays.asList(21,-10,11)));
        tests.add(new ArrayList<>(Arrays.asList(3,-9,-6)));
        for (ArrayList<Integer> test : tests){
            int a=test.get(0);
            int b=test.get(1);
            int expected=test.get(2);
            int actual=FirstRecursion.add(a,b);
            assertEquals("add("+a+","+b+")",expected,actual);
        }
    }
}
