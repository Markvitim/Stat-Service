package ru.netology.statService;

public class StatService {
    public int calculateSumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calcAverSalePerMonth(int[] sales) {
        return calculateSumSales(sales) / sales.length;
    }

    public int maxMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month += 1;
        }
        return maxMonth + 1;
    }

    public int minMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month += 1;
        }
        return minMonth + 1;
    }

    public int numMonthLowAverSale(int[] sales) {
        int counter = 0;
        for (int sale : sales) {
            if (sale < calcAverSalePerMonth(sales)) {
                counter += 1;
            }
        }
        return counter;
    }

    public int numMonthUpperAverSale(int[] sales) {
        int counter = 0;
        for (int sale : sales) {
            if (sale > calcAverSalePerMonth(sales)) {
                counter += 1;
            }
        }
        return counter;
    }
}
