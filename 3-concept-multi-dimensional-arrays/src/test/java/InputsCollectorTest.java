import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.prograd.InputsCollector;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputsCollectorTest {
    InputsCollector inputsCollector;

    @BeforeEach
    void init(){
        inputsCollector = new InputsCollector();
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenNumberOfDaysIsNegative() throws IllegalArgumentException {
        inputsCollector.setNumber_of_days(-1);
        IllegalArgumentException illegalArgumentException = Assertions.assertThrows(IllegalArgumentException.class, () -> {inputsCollector.getNumber_of_days();});
        String expectedString = "Invalid Number of Days";
        String actualString = illegalArgumentException.getMessage();
        assertEquals(actualString, expectedString);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenNumberOfCitiesIsNegative() throws IllegalArgumentException {
        inputsCollector.setNumber_of_cities(-1);
        IllegalArgumentException illegalArgumentException = Assertions.assertThrows(IllegalArgumentException.class, () -> {inputsCollector.getNumber_of_cities();});
        String expectedString = "Invalid Number of Cities";
        String actualString = illegalArgumentException.getMessage();
        assertEquals(actualString, expectedString);
    }
}