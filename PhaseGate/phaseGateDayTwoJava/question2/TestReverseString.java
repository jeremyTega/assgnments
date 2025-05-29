import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestReverseString {



    @Test
    public void testReversedString() {
        String word = "abcdefd";
        assertEquals("dcbaefd", ReverseString.reverseString(word, "d"));

    }

    }



