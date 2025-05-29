import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class TestingUniqueNumbers{
     @Test
    public void testNumbers() {
        int[] arr = {1,2,3,2};
        assertEquals(4, uniqueNumbers.unique(arr));

    }


     @Test
    public void testForNegativeNumber() {
        int[] arr = {1,2,3};
        assertEquals(6, uniqueNumbers.unique(arr));

    }

     @Test
    public void testForOneValue() {
        int[] arr = {2,5};
        assertEquals(7, uniqueNumbers.unique(arr));

    }

     @Test
    public void testForSimilarValue() {
        int[] arr = {1,1,1,1,1,1};
        assertEquals(0, uniqueNumbers.unique(arr));

    }




}
