package ru.netology.stats;

public class StatsService {
    public int salesSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSale(int[] sales) {
        int average;
        average = salesSum(sales) / sales.length;
        return average;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int underAverage(int[] sales) {
        int monthsUnderAverage = 0;
        for (int sale : sales) {
            if (sale < averageSale(sales)) {
                monthsUnderAverage += 1;
            }
        }
        return monthsUnderAverage;
    }

    public int overAverage(int[] sales) {
        int monthsOverAverage = 0;
        for (int sale : sales) {
            if (sale > averageSale(sales)) {
                monthsOverAverage += 1;
            }
        }
        return monthsOverAverage;
    }
}