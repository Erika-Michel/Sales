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
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        average = sum / sales.length;
        return average;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int underAverage(int[] sales) {
        int sum = 0;
        int monthsUnderAverage = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int average = sum / sales.length;
        for (int sale : sales) {
            if (sale < average) {
                monthsUnderAverage += 1;
            }
        }
        return monthsUnderAverage;
    }

    public int overAverage(int[] sales) {
        int sum = 0;
        int monthsOverAverage = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int average = sum / sales.length;
        for (int sale : sales) {
            if (sale > average) {
                monthsOverAverage += 1;
            }
        }
        return monthsOverAverage;
    }
}