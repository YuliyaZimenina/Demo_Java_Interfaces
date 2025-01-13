public class SeriesDemo {
    public static void main(String[] args) {
       ByTwoSeries byTwoSeries = new ByTwoSeries();
       ByThreeSeries byThreeSeries = new ByThreeSeries();

        System.out.println("\n A sequence of numbers where each subsequent number is 2 greater:");
        for (int i = 0; i < 5; i++)
            System.out.println("Next value: " + byTwoSeries.getNext());

        System.out.println("\nReset");
        byTwoSeries.reset();

        for (int i = 0; i < 5; i++)
            System.out.println("Next value: " + byTwoSeries.getNext());

        System.out.println("\nInitial value: 100");
        byTwoSeries.setStart(100);

        for (int i = 0; i < 5; i++)
            System.out.println("Next value: " + byTwoSeries.getNext());

        System.out.println("\n A sequence of numbers where each subsequent number is 3 greater:");
        for (int i = 0; i < 5; i++)
            System.out.println("Next value: " + byThreeSeries.getNext());

        System.out.println("\nReset");
        byThreeSeries.reset();

        for (int i = 0; i < 5; i++)
            System.out.println("Next value: " + byThreeSeries.getNext());

        System.out.println("\nInitial value: 100");
        byThreeSeries.setStart(100);

        for (int i = 0; i < 5; i++)
            System.out.println("Next value: " + byThreeSeries.getNext());

    }
}