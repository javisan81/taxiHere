import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class AppTest {
    @Test
    public void firstTest() {
        assertThat("pepe", equalTo("pepe"));
    }
}
