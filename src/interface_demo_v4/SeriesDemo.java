package interface_demo_v4;

/*
Demonstration of the use of an interface reference
 */
public class SeriesDemo {
    public static void main(String[] args) {
       ByTwoSeries objTwoSeries = new ByTwoSeries();
       ByThreeSeries objThreeSeries = new ByThreeSeries();
       Series objSeries; // Variable referencing an interface

        for (int i = 0; i < 5; i++) {
            objSeries = objTwoSeries;
            System.out.println("Next value ByTwoSeries: " + objSeries.getNext());

            objSeries = objThreeSeries;
            System.out.println("Next value ByThreeSeries: " + objSeries.getNext());
        }
    }
}