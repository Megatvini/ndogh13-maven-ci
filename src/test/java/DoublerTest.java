import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Nika Doghonadze
 */
public class DoublerTest {
    @Test
    public void act() throws Exception {
        Doubler doubler = new Doubler();

        int res = doubler.act(2);

        assertEquals(4, res);
    }

}