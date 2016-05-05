import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Created by Nika Doghonadze
 */
public class DoublerTest {
    @Test
    public void testActOnInt() {
        Doubler doubler = new Doubler();

        int res = doubler.act(2);

        assertEquals(4, res);
    }

    @Test
    public void testActOnList() {
        List list = Mockito.mock(List.class);
        when(list.size()).thenReturn(12);
        Doubler doubler = new Doubler();

        int res = doubler.act(list);

        assertEquals(24, res);
    }

}