package ru.netology.stats;

public class StatsService {
    public long allSales(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result = result + sale;
        }
        return result;
    }

    public long averageSales(long[] sales) {
        return allSales(sales) / sales.length;
    }

    public long maxSales(long[] sales) {
        long maxSalesMounth = 0;
        long maximumSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maximumSale) {
                maxSalesMounth = i;
                maximumSale = sales[i];
            }
        }
        return maxSalesMounth + 1;
    }

    public long minSales(long[] sales) {
        long minSalesMounth = 0;
        long minimumSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minimumSale) {
                minSalesMounth = i;
                minimumSale = sales[i];
            }
        }
        return minSalesMounth + 1;
    }

    public long belowAverageSales(long[] sales) {
        int belowAverageSalesMounths = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                belowAverageSalesMounths++;
            }
        }
        return belowAverageSalesMounths;
    }

    public long aboveAverageSales(long[] sales) {
        int aboveAverageSalesMounths = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                aboveAverageSalesMounths++;
            }
        }
        return aboveAverageSalesMounths;
    }
}
