package week3;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestPlusMinus {
    @Test
    public void testLetter(){
        HashMap<Integer,String> tests=new HashMap<>();
        for (int x=0;x<10;x++){
            tests.put(90+x,"A");
            tests.put(100+x,"A");
            tests.put(80+x,"B");
            tests.put(70+x,"C");
            tests.put(60+x,"D");
        }
        for (int x=-20;x<60;x++){
            tests.put(x,"F");
        }

        for (int score : tests.keySet()){
            String expected=tests.get(score);
            String actual=PlusMinus.letter(score);
            assertEquals("letter("+score+")",expected,actual);
        }
    }
    @Test
    public void testPMplus(){
        HashMap<Integer,String> tests=new HashMap<>();
        for (int x=8;x<10;x++){
            tests.put(80+x,"+");
            tests.put(70+x,"+");
            tests.put(60+x,"+");
        }

        for (int score : tests.keySet()){
            String expected=tests.get(score);
            String actual=PlusMinus.pm(score);
            assertEquals("pm("+score+")",expected,actual);
        }
    }
    @Test
    public void testPMminus(){
        HashMap<Integer,String> tests=new HashMap<>();
        for (int x=0;x<3;x++){
            tests.put(90+x,"-");
            tests.put(80+x,"-");
            tests.put(70+x,"-");
            tests.put(60+x,"-");
        }
        for (int x=-20;x<60;x++){
            tests.put(x,"");
        }


        for (int score : tests.keySet()){
            String expected=tests.get(score);
            String actual=PlusMinus.pm(score);
            assertEquals("pm("+score+")",expected,actual);
        }
    }
    @Test
    public void testPMflat(){
        HashMap<Integer,String> tests=new HashMap<>();
        for (int x=3;x<7;x++){
            tests.put(80+x,"");
            tests.put(70+x,"");
            tests.put(60+x,"");
        }
        for (int x=93;x<120;x++){
            tests.put(x,"");
        }
        for (int score : tests.keySet()){
            String expected=tests.get(score);
            String actual=PlusMinus.pm(score);
            assertEquals("pm("+score+")",expected,actual);
        }
    }
}
