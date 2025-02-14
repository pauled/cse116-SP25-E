package week4;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class TestPlayer {
    @Test
    public void testPlayer(){
        Player p1=new Player(4);
        Player p2=new Player(4);
        //assertTrue("constructed the same",p1==p2);
        assertEquals("maxHP",p1.getMaxHP(),4);
        assertEquals("HP",p1.getHP(),4);
        assertEquals("damageDealt",p1.getDamageDealt(),4);
    }
}
