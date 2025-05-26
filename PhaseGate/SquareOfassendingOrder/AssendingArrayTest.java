import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class AssendingArrayTest {

    @Test
    public void testThatFunctionReturnCorrectValue(){
         int[] arr = {9,-10,7,0,5};
        int[] expected = {0,25,49,81,100};
/         assertArrayEquals(expected, ArrayMethods.ascending(arr));

    }



}
