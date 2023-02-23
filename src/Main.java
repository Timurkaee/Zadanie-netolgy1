public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[]{10, 2, 400, 10});
        long max = salesManager.max();
        System.out.println(max);

    }
}