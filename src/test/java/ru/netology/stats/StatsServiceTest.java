package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
        // Сумму всех продаж
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSalesSum(sales);

        assertEquals(expected, actual);
    }

    @Test
        // Среднюю сумму продаж в месяц
    void shouldAverageSaleAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.averageSaleAmount(sales);

        assertEquals(expected, actual);
    }

    @Test
        // Номер месяца, в котором был минимум продаж
    void monthNumberMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSales(sales);

        assertEquals(expected, actual);
    }

    @Test
        // Номер месяца, в котором был пик продаж
    void monthNumberMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.maxSales(sales);

        assertEquals(expected, actual);
    }

    @Test
        // Кол-во месяцев, в которых продажи были ниже среднего
    void countingMonthsWhereSalesBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.monthsBelowAverageSales(sales);

        assertEquals(expected, actual);
    }


    @Test
        // Кол-во месяцев, в которых продажи были выше среднего
    void countingMonthsWhenSalesAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.monthsAboveAverageSales(sales);

        assertEquals(expected, actual);
    }
}