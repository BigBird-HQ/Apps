package arrayListMethods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListMethodsTest {
    private ArrayListMethods myMethods;
    @BeforeEach
    public void initialize() {
        myMethods = new ArrayListMethods();
    }
    @Test
    public void listContainsNoElementAtCreation_emptyListTest() {

        assertTrue(myMethods.isEmpty());

    }
    @Test
    public void addElementToList_listIsNotEmptyTest() {

        assertTrue(myMethods.isEmpty());
        myMethods.add("pen");
        assertFalse(myMethods.isEmpty());

    }
    @Test
    public void addMoreThanOneElementToList_listContainsMoreThanOneElementTest() {

        assertTrue(myMethods.isEmpty());
        myMethods.add("pen");
        myMethods.add("scissors");
        assertFalse(myMethods.isEmpty());
    }

    @Test
    public void listContainsMoreThanOneElement_removeOneElementListIsNotEmptyTest() {

        assertTrue(myMethods.isEmpty());
        myMethods.add("pen");
        myMethods.add("scissors");
        myMethods.remove("Scissors");
        assertFalse(myMethods.isEmpty());

    }
    @Test
    public void listContainsTwoElements_removeEqualElementsAsContainedInListTest() {

        myMethods.add("pen");
        myMethods.add("scissors");
        myMethods.remove("scissors");
        myMethods.remove("pen");
        assertTrue(myMethods.isEmpty());
    }
    @Test
    public void removeElementFromEmptyList_throwNewIllegalArgumentExceptionTest() {

        assertTrue(myMethods.isEmpty());
        assertThrows(IllegalArgumentException.class, ()->myMethods.remove("scissors"));
    }

}
