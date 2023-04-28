package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i;// запомним его как максимальный
            }
        }

        return maxMonth + 1;// месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int salesAmount(int[] sales) {  // cумма всех продаж
        int sum = 0;
        for (int number : sales) {
            sum = sum + number;
        }

        return sum;
    }

    public int averageAmount(int[] sales) { // cредняя сумма продаж в месяц
        int sum = salesAmount(sales);

        return sum / sales.length;

    }

    public int monthsSalesBelowAverage(int[] sales) { // количество месяцев, в которых продажи были ниже среднего
        int averageMonth = averageAmount(sales);
        int month = 0;
        for (int number : sales) {
            if (number < averageMonth) {
                month = month + 1;

            }
        }
        return month;
    }

    public int monthsSalesAboveAverage(int[] sales) { // количество месяцев, в которых продажи были выше среднего
        int averageMonth = averageAmount(sales);
        int month = 0;
        for (int number : sales) {
            if (number > averageMonth) {
                month = month + 1;

            }
        }
        return month;
    }
}