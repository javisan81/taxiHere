import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class FareCalculatorTest {

    public static final float NO_DISTANCE = 0;
    public static final float ONE_EURO = 1;
    public static final float ONE_KM = 1;
    public static final float TWO_EUROS = 2;
    private static final float FOUR_EUROS = 4;
    private static final float THREE_EUROS = 3;

    @Test
    public void shouldBeOneEuroForZeroKms(){
        FareCalculator fareCalculator = new FareCalculator();
        assertThat(fareCalculator.calculateByDistance(new Kilometers(NO_DISTANCE)), equalTo(ONE_EURO));
    }

    @Test
    public void shouldBeTwoEurosForOneKm(){
        FareCalculator fareCalculator = new FareCalculator();
        assertThat(fareCalculator.calculateByDistance(new Kilometers(ONE_KM)), equalTo(TWO_EUROS));
    }

    @Test
    public void shouldBeOneEuroForZeroDot5Kms(){
        FareCalculator fareCalculator = new FareCalculator();
        assertThat(fareCalculator.calculateByDistance(new Kilometers(0.5f)), equalTo(ONE_EURO));
    }


    @Test
    public void shouldBeFourEurosForTwoKms(){
        FareCalculator fareCalculator = new FareCalculator();
        assertThat(fareCalculator.calculateByDistance(new Kilometers((float) 2)), equalTo(FOUR_EUROS));
    }

    @Test
    public void shouldBeThreeEurosForOnePoint2Kms(){
        FareCalculator fareCalculator = new FareCalculator();
        assertThat(fareCalculator.calculateByDistance(new Kilometers(1.2f)), equalTo(THREE_EUROS));
    }
}
