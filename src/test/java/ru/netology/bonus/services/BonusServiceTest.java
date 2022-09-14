package ru.netology.bonus.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    public void testShouldCalculate(String nameTest, int expectedBonus, int amount, boolean registered) {
        BonusService service = new BonusService();

        int actualBonus = service.calculate(amount, registered);
        Assertions.assertEquals(expectedBonus, actualBonus);
    }

}
