package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestService {

    @Test
    public void getMontBelow() {
        SalesStatistics service = new SalesStatistics();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double average = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / sales.length;
        int expectedMonth = 5;
        double actualMonth = service.countBelowAverage(sales, average);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void getMonthAbove() {
        SalesStatistics service = new SalesStatistics();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double average = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / sales.length;
        int expected = 5;
        double actual = service.countAboveAverage(sales,average);


        Assertions.assertEquals(expected, actual);
    }
}
