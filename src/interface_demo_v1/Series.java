package interface_demo_v1;

// Interface for a class that generates a sequence of numbers
public interface Series {
    int getNext(); // Method to return the next number in a sequence
    void reset(); // Method for reset
    void setStart(int x); // Method for setting initial value
}
