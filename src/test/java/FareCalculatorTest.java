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
        assertThat(Fare.buildByKmsAndMinutes((float) 1, 0).fare(), equalTo(new Euros(2f)));
    }

    @Test
    public void shouldBeOneEuroForZeroDot5Kms() {
        assertThat(Fare.buildByKmsAndMinutes(0.5f, 0).fare(), equalTo(new Euros(1f)));
    }

    @Test
    public void shouldBeThreeEurosForOnePoint2Kms() {
        assertThat(Fare.buildByKmsAndMinutes(1.2f, 0).fare(), equalTo(new Euros(3f)));
    }

    @Test
    public void shouldBeFiveEurosForTwoKmsAndOneMinute(){
        assertThat(Fare.buildByKmsAndMinutes(2,1).fare(), equalTo(new Euros(5f)));
    }

    @Test
    public void shouldBeTwoEurosForZeroKmsAndOneMinute(){
        assertThat(Fare.buildByKmsAndMinutes(0,1).fare(), equalTo(new Euros(2f)));
    }

    @Test
    public void shouldBeTwoEurosZeroDot5KmsAndZeroDot5Minutes(){
        assertThat(Fare.buildByKmsAndMinutes(0.5f, 0.5f).fare(), equalTo(new Euros(2f)));
    }

    @Test
    public void shouldBeFourEurosOneKmsAndOneDot5Minutes() {
        assertThat(Fare.buildByKmsAndMinutes(1f, 1.5f).fare(),equalTo(new Euros(4f)));
    }
}
