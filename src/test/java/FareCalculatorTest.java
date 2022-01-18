import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class FareCalculatorTest {

    public static final Euros ONE_EURO = new Euros(1f);
    public static final Euros TWO_EUROS = new Euros(2f);
    private static final Euros FOUR_EUROS = new Euros(4f);
    private static final Euros THREE_EUROS = new Euros(3f);

    @Test
    public void shouldBeOneEuroForZeroKms(){
        FareCalculator fareCalculator = new FareCalculator();
        assertThat(fareCalculator.calculateByDistance(Kilometers.noDistance()), equalTo(ONE_EURO));
    }

    @Test
    public void shouldBeTwoEurosForOneKm(){
        FareCalculator fareCalculator = new FareCalculator();
        assertThat(fareCalculator.calculateByDistance(new Kilometers(1)), equalTo(TWO_EUROS));
    }

    @Test
    public void shouldBeOneEuroForZeroDot5Kms(){
        FareCalculator fareCalculator = new FareCalculator();
        assertThat(fareCalculator.calculateByDistance(new Kilometers(0.5f)), equalTo(ONE_EURO));
    }


    @Test
    public void shouldBeFourEurosForTwoKms(){
        FareCalculator fareCalculator = new FareCalculator();
        assertThat(fareCalculator.calculateByDistance(new Kilometers( 2)), equalTo(FOUR_EUROS));
    }

    @Test
    public void shouldBeThreeEurosForOnePoint2Kms(){
        FareCalculator fareCalculator = new FareCalculator();
        assertThat(fareCalculator.calculateByDistance(new Kilometers(1.2f)), equalTo(THREE_EUROS));
    }
}
