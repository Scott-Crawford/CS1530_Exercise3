import org.junit.Test;
import static org.junit.Assert.*;

import ScottCrawford.Sequence;

public class SequenceTest {

    @Test
    public void testSequenceTri0() {
        assertEquals(Sequence.Tri(0), 0);
    }

    @Test
    public void testSequenceTri1() {
        assertEquals(Sequence.Tri(1), 1);
    }

    @Test
    public void testSequenceTri5() {
        assertEquals(Sequence.Tri(5), 15);
    }

    @Test
    public void testSequenceLazy0() {
        assertEquals(Sequence.Lazy(0), 1);
    }

    @Test
    public void testSequenceLazy1() {
        assertEquals(Sequence.Lazy(1), 2);
    }

    @Test
    public void testSequenceLazy5() {
        assertEquals(Sequence.Lazy(5), 16);
    }

}
