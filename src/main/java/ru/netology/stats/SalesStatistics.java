package ru.netology.stats;



public class SalesStatistics {


    public double countBelowAverage(int[] sales, double average) {
        int count = 0;
        for (int sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public double countAboveAverage(int[] sales, double average) {
        int count = 0;
        for (int sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}

