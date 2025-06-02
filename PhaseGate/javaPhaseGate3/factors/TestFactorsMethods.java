import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TestFactorsMethods {



    @Test
    public void testFactor() {

    int[] expected = {1,2, 5, 10};
    assertArrayEquals(expected, factorsOfAnArray.factors(10));

    }

    }



