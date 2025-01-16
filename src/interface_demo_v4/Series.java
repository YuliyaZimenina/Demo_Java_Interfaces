package interface_demo_v4;

// Interface for a class that generates a sequence of numbers
// Adding a standard method ( getNextArray() ) to the interface
public interface Series {
    // Method to return the next number in a sequence
    int getNext();

    /*
    A method that returns an array containing the
    next n elements in the sequence after the
    current element.
    */
    default int[] getNextArray(int n) {
        int [] values = new int[n];
        for (int i = 0; i < n; i++) values[i] = getNext();
        return values;
    }

    // Method for reset
    void reset();

    // Method for setting initial value
    void setStart(int x);
}
