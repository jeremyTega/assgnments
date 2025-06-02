import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class rotateMatrix {



    @Test
    public void arrayRotate() {
      int[][] original = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
      expected ={9 ,8 ,7}
                {6 ,5, 4}
                {3, 2 ,1}
         assertEquals(expected, methodSwitchArray.reverseArray(original));

    }

    }



