package ru.netology.statService;

public class StatService {
    public int calculateSumSales(int[] sales){
        int sum = 0;
        for(int sale:sales){
            sum+=sale;
        }
        return sum;
    }
}
