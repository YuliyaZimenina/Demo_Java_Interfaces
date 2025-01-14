package interface_demo_v3;

// The circular queue
public class CircularQueue implements ICharInQueue {
    private char[] queueArray; // The array in which the queue is stored
    private int putIndex, getIndex; // Indexes for placing and extracting characters

    // Constructor of an empty queue of a given size
    public CircularQueue(int size) {
        queueArray = new char[size + 1]; // Allocate memory for the queue
        putIndex = getIndex = 0;
    }

    // Method for putting a character into a queue
    public void putCharQ(char ch) {
        /*
        The conditional operator returns a message if:
        - putIndex is one less than getIndex,
        - putIndex points to the end of the array,
         and getIndex points to the beginning of the array.
         */
        if (putIndex + 1 == getIndex | (putIndex == queueArray.length) & (getIndex == 0)) {
            System.out.println(" - The queue is overcrowded");
            return;
        }
        queueArray[putIndex++] = ch;
        if (putIndex == queueArray.length) putIndex = 0; // Looping the queue
    }

    // Method to extract a character from a queue
    public char extractCharQ() {
        if (getIndex == putIndex){
            System.out.println("- The queue is empty");
            return (char) 0;
        }
        char ch = queueArray[getIndex++];
        if (getIndex == queueArray.length) getIndex = 0; // Looping the queue
        return ch;
    }
}
