package ru.netology.stats;

public class StatsService {
    public int sumAllSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {

            sum += sale;
        }
        return sum;
    }

    public int averageSumOfAllSales(int[] sales) {
        return sumAllSales(sales) / sales.length;
    }

    public int monthWithMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sales[maxMonth] <= sale) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int monthWithMinSales(int[] sales) {
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

    public int monthSalesLessThanAverage(int[] sales) {
        int countMonth = 0;
        int months = 0;
        for (int sale : sales) {
            if (sale < averageSumOfAllSales(sales)) {
                months++;
            }
            countMonth = countMonth + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return months;
    }

    public int monthSalesMoreThanAverage(int[] sales) {
        int countMonth = 0;
        int months = 0;
        for (int sale : sales) {
            if (sale > averageSumOfAllSales(sales)) {
                months++;
            }
            countMonth = countMonth + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return months;
    }
}
