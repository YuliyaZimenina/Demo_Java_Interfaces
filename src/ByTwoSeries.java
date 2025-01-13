/*
A class that generates a sequence of numbers
where each current number is 2 greater than
the previous one.
 */
public class ByTwoSeries implements Series {
    int start;
    int value;
    int previous;

    // Standard constructor
    ByTwoSeries() {
        start = 0;
        value = 0;
    }

    // Interface methods
    public int getNext() {
        value += 2;
        return value;
    }

    public void reset() {
        value = start;
        previous = start - 2;
    }

    public void setStart(int x) {
        start = x;
        value = x;
        previous = x - 2;
    }

    // Own class method
    int getPrevious(){
        return previous;
    }
}
