package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"Lower value check, 99,101,1",
            "Upper value check, 9800,9802,1",
            "Maximum number,100,9801,90",
            "No min values,0,99,0",
            "No maw values,9802,10000,0"
    })
    void squareNumber(String testName, int lowerValue, int upperValue, int count) {
        SQRService service = new SQRService();
        int expected = service.squareNumber(lowerValue, upperValue);
        assertEquals(expected, count);
    }
}