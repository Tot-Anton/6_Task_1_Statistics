package ru.netology.stats;

public class StatsService {

    public int calculateSalesSum(int[] sales) {   // Сумму всех продаж
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSaleAmount(int[] sales) {  // Среднюю сумму продаж в месяц
        return calculateSalesSum(sales) / sales.length;
    }

    public int minSales(int[] sales) {   // Номер месяца, в котором был минимум продаж
        int minMonth = 1;
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

    public int maxSales(int[] sales) {   // Номер месяца, в котором был пик продаж
        int maxMonth = 1;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int monthsBelowAverageSales(int[] sales) {  // Кол-во месяцев, в которых продажи были ниже среднего
        int numberMonths = 0;
        double averageSales = averageSaleAmount(sales);
        for (int sale : sales) {
            if (sale < averageSales) {
                numberMonths += 1;
            }
        }
        return numberMonths;
    }

    public int monthsAboveAverageSales(int[] sales) {  // Кол-во месяцев, в которых продажи были выше среднего
        int numberMonths = 0;
        double averageSales = averageSaleAmount(sales);
        for (int sale : sales) {
            if (sale > averageSales) {
                numberMonths += 1;
            }
        }
        return numberMonths;
    }

}
