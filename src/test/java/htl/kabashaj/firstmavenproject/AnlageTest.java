package htl.kabashaj.firstmavenproject;

import static org.junit.Assert.*;
import org.junit.Test;

public class AnlageTest {

    public AnlageTest() {
    }

    @Test
    public void testJahresAfa() {
        Anlage a = new Anlage(2000.0, 10);
        assertEquals(200.0, a.jahresAfa(), 0.01);
    }

    public void testBuchwert() {
        Anlage a = new Anlage(2000.0, 10);
        a.updateBuchwert(5);
        assertEquals(1000.0, a.getBuchwert(), 0.01);
    }

    public void testBuchwert2() {
        Anlage a = new Anlage(2000.0, 10);
        a.updateBuchwert(12);
        assertEquals(1.0, a.getBuchwert(), 0.01);
    }

}
