public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int min() {
        int min = Integer.MAX_VALUE;
        for (int sale : sales) {
            if (min > sale) {
                min = sale;
            }
        }
        return min;
    }

    public int averageOfSales() {
     int summa= 0;
     for (int sale:sales){
       summa += sale;
     }
     return (summa-max()-min())/(sales.length-2);
    }
}