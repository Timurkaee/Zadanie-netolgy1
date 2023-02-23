public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[]{10, 2, 400, 10});

        int max = salesManager.max();
        System.out.println(max);

        int min = salesManager.min();
        System.out.println(min);
        int averageOfSales = salesManager.averageOfSales();
        System.out.println(averageOfSales);
    }
}
