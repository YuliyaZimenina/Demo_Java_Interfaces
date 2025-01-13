package interface_demo_v1;

/*
A class that generates a sequence of numbers
where each current number is 3 greater than
the previous one.
 */
public class ByThreeSeries implements Series {
    int start;
    int value;

    //Standard constructor
    ByThreeSeries() {
        start = 0;
        value = 0;
    }

    // Interface methods
    public int getNext() {
        value += 3;
        return value;
    }

    public void reset() {
        value = start;
    }

    public void setStart(int x) {
        start = x;
        value = x;
    }
}
