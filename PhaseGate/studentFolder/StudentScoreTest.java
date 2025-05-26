import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class StudentScoreTest {

    @Test
    public void SumOfRolls() {
            int[][] arr = {{3,3,4},{9,1,3}};
            int [] expected = {10,13};
            int [] actual = studentScore.sumOfRows(arr);
        assertArrayEquals(actual, expected);

   }

    @Test
    public void SumOfRollsWithMinusValues() {
            int[][] arr = {{-3,3,4},{9,-1,3}};
            int [] expected = {4,11};
            int [] actual = studentScore.sumOfRows(arr);
        assertArrayEquals(actual, expected);


}


}
