package interface_demo_v3;
// Class for representing a fixed size queue
public class FixedSizeQueue implements ICharInQueue{
    private char [] fixSizeQ; // The array in which the queue is stored
    private int putIndex, getIndex; // Indexes for placing and extracting characters

    // Constructor of an empty queue of a given size
    public FixedSizeQueue(int size){
        fixSizeQ = new char[size];
        putIndex = getIndex = 0;
    }

    // Method for putting a character into a queue
    public void putCharQ(char ch) {
        if (putIndex == fixSizeQ.length) {
            System.out.println(" - The queue is overcrowded");
            return;
        }
        fixSizeQ[putIndex++] = ch;
    }

    // Method to extract a character from a queue
    public char extractCharQ() {
        if (getIndex == putIndex){
            System.out.println(" - The queue is empty");
            return (char) 0;
        }
        return fixSizeQ[getIndex++];
    }
}
