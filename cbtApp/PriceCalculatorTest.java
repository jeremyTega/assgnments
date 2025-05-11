import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class PriceCalculatorTest {

    @Test
    void testCalculateTotalPrice_1to4Copies() {
        assertEquals(8000, PriceCalculator.calculateTotalPrice(4));
    }

    @Test
    void testCalculateTotalPrice_5to9Copies() {
        assertEquals(16200, PriceCalculator.calculateTotalPrice(9));
    }

    @Test
    void testCalculateTotalPrice_10to29Copies() {
        assertEquals(48000, PriceCalculator.calculateTotalPrice(30));
    }

    @Test
    void testCalculateTotalPrice_30to49Copies() {
        assertEquals(45000, PriceCalculator.calculateTotalPrice(30));
    }

    @Test
    void testCalculateTotalPrice_50to99Copies() {
        assertEquals(130000, PriceCalculator.calculateTotalPrice(100));
    }

    @Test
    void testCalculateTotalPrice_100to199Copies() {
        assertEquals(240000, PriceCalculator.calculateTotalPrice(200));
    }

    @Test
    void testCalculateTotalPrice_200to499Copies() {
        assertEquals(550000, PriceCalculator.calculateTotalPrice(500));
    }

    @Test
    void testCalculateTotalPrice_500PlusCopies() {
        assertEquals(1000000, PriceCalculator.calculateTotalPrice(1000));
    }
}
