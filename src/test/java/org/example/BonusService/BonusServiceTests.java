package org.example.BonusService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTests {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/BonusServiceData.csv")

    public void doEveryTypeAndEveryLimit(int expected, long amount, boolean registered) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }
}
