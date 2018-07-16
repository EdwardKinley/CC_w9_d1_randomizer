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
        assertEquals(2, nameSelector.getRandomNames(2).size());
        assertEquals(17, nameSelector.getNameListLength());
    }

    @Test
    public void canGetFiveNames() {
        assertEquals(5, nameSelector.getRandomNames(5).size());
        assertEquals(14, nameSelector.getNameListLength());
    }

    @Test
    public void canGetSixteenNames() {
        assertEquals(16, nameSelector.getRandomNames(16).size());
        assertEquals(3, nameSelector.getNameListLength());
    }

    @Test
    public void canGetAllNames() {
        assertEquals(19, nameSelector.getRandomNames(19).size());
        assertEquals(0, nameSelector.getNameListLength());
    }

    @Test
    public void cannotGetMoreThanAllNames() {
        assertEquals(19, nameSelector.getRandomNames(22).size());
        assertEquals(0, nameSelector.getNameListLength());
    }

}
