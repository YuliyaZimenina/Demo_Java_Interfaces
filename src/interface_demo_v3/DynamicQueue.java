package interface_demo_v3;
// The class that implements a dynamic queue
public class DynamicQueue implements ICharInQueue{
    private char [] dynamicQueue; // The array in which the queue is stored
    private int putIndex, getIndex; // Indexes for placing and extracting characters

    // Constructor of an empty queue of a given size
    public DynamicQueue(int size){
        dynamicQueue = new char[size]; // Allocate memory for the queue
        putIndex = getIndex = 0;
    }

    // Method for putting a character into a queue
    public void putCharQ(char ch) {
        if (putIndex == dynamicQueue.length){
            // Increasing the queue size
            char [] enlargedArray = new char[dynamicQueue.length * 2];
            // Copy elements to a new queue
            for (int i = 0; i < dynamicQueue.length; i++)
                enlargedArray[i] = dynamicQueue[i];
            dynamicQueue = enlargedArray;
        }
        dynamicQueue[putIndex++] = ch;
    }

    // Method to extract a character from a queue
    public char extractCharQ() {
        if (getIndex == putIndex){
            System.out.println(" - The queue is empty");
            return (char) 0;
        }
        return dynamicQueue[getIndex++];
    }
}
