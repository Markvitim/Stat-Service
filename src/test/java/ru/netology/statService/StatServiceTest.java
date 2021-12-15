package ru.netology.statService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatServiceTest {

    @org.junit.jupiter.api.Test
    void calculateSumSales() {

        StatService service = new StatService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSumSales(sales);

        assertEquals(expected, actual);

    }

}

