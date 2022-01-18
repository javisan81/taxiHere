import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class FareCalculatorTest {

    @Test
    public void shouldBeOneEuroForZeroKms() {
        assertThat(Fare.noDistance().fare(), equalTo(new Euros(1f)));
    }

    @Test
    public void shouldBeTwoEurosForOneKm() {
        assertThat(Fare.buildByKms(1).fare(), equalTo(new Euros(2f)));
    }

    @Test
    public void shouldBeOneEuroForZeroDot5Kms() {
        assertThat(Fare.buildByKms(0.5f).fare(), equalTo(new Euros(1f)));
    }

    @Test
    public void shouldBeThreeEurosForOnePoint2Kms() {
        assertThat(Fare.buildByKms(1.2f).fare(), equalTo(new Euros(3f)));
    }
}
