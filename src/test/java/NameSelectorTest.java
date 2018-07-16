import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameSelectorTest {

    private NameSelector nameSelector;

    @Before
    public void before() {
        this.nameSelector = new NameSelector();
    }

    @Test
    public void canGetInt() {
        assertEquals(3, nameSelector.getInt());
    }

    @Test
    public void canGetFirstName() {
        assertEquals("Ben", nameSelector.getFirstName());
    }

    @Test
    public void canGetNameListLength() {
        assertEquals(19, nameSelector.getNameListLength());
    }

    @Test
    public void canGetTwoNames() {
        nameSelector.getRandomNames(2);
        assertEquals(17, nameSelector.getNameListLength());
        assertEquals(2, nameSelector.getRandomNames(2).size());
    }

}
