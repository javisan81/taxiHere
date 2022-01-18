import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class FareCalculatorTest {

    public static final int NO_DISTANCE = 0;
    public static final int ONE_EURO = 1;
    public static final int ONE_KM = 1;
    public static final int TWO_EUROS = 2;
    private static final int FOUR_EUROS = 4;

    @Test
    public void shouldBeOneEuroForZeroKms(){
        FareCalculator fareCalculator = new FareCalculator();
        assertThat(fareCalculator.calculateByDistance(NO_DISTANCE), equalTo(ONE_EURO));
    }

    @Test
    public void shouldBeTwoEurosForOneKm(){
        FareCalculator fareCalculator = new FareCalculator();
        assertThat(fareCalculator.calculateByDistance(ONE_KM), equalTo(TWO_EUROS));
    }

    @Test
    public void shouldBeOneEuroForZeroDot5Kms(){
        FareCalculator fareCalculator = new FareCalculator();
        assertThat(fareCalculator.calculateByDistance(0.5f), equalTo(ONE_EURO));
    }


    @Test
    public void shouldBeFourEurosForTwoKms(){
        FareCalculator fareCalculator = new FareCalculator();
        assertThat(fareCalculator.calculateByDistance(2), equalTo(FOUR_EUROS));
    }
}
