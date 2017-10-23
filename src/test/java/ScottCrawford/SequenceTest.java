import org.junit.Test;
import static org.junit.Assert.*;

import ScottCrawford.Sequence;

public class SequenceTest {

    @Test
    public void testSequence0() {
        assertEquals(SequenceTest.Tri(0), 0);
    }

    @Test
    public void testSequence1() {
        assertEquals(SequenceTest.Tri(1), 1);
    }

    @Test
    public void testSequence5() {
        assertEquals(SequenceTest.Tri(5), 15);
    }

    @Test
    public void testSequence0() {
        assertEquals(SequenceTest.Lazy(0), 0);
    }

    @Test
    public void testSequence1() {
        assertEquals(SequenceTest.Lazy(1), 2);
    }

    @Test
    public void testSequence5() {
        assertEquals(SequenceTest.Lazy(5), 16);
    }
    
}
