import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {
    @Test
    public void dataTest() {
        OffsetDateTime testOne = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String formatDate = Main.dataTimeFormact(testOne);
        String expected = "01 marzo 2023";
        assertEquals(expected, formatDate);
    }

}