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

    @org.junit.jupiter.api.Test
    void calcAverSalePerMonth() {

        StatService service = new StatService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calcAverSalePerMonth(sales);

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void maxMonth() {

        StatService service = new StatService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.maxMonth(sales);

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void minMonth() {

        StatService service = new StatService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minMonth(sales);

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void numMonthLowAverSale() {

        StatService service = new StatService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.numMonthLowAverSale(sales);

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void numMonthUpperAverSale() {

        StatService service = new StatService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.numMonthUpperAverSale(sales);

        assertEquals(expected, actual);

    }
}

