package interface_demo_v3;
/*
Demonstration of the use of the IChrQueue interface.
NOTE: Access to queue class objects will be done
through an interface reference.
 */

public class IQueueDemo {
    public static void main(String[] args) {
        FixedSizeQueue fixedSizeQueue = new FixedSizeQueue(10);
        DynamicQueue dynamicQueue = new DynamicQueue(5);
        CircularQueue circularQueue = new CircularQueue(10);

        ICharInQueue iCharInQueue;
        char ch;
        int i;

        iCharInQueue = fixedSizeQueue;
        // Place a series of characters into a fixed-size queue
        for (i = 0; i < 10; i++)
            iCharInQueue.putCharQ((char) ('A' + i));
        // Displaying the contents of the queue
        System.out.print("Fixed size queue contents: ");
        for (i = 0; i < 10; i++) {
            ch = iCharInQueue.extractCharQ();
            System.out.print(ch + " ");
        }

        System.out.println();
        iCharInQueue = dynamicQueue;
        // Place a series of characters into a dynamic queue
        for (i = 0; i < 10; i++)
            iCharInQueue.putCharQ((char) ('Z' - i));
        // Displaying the contents of the queue
        System.out.print("Dynamic queue contents: ");
        for (i = 0; i < 10; i++){
            ch = iCharInQueue.extractCharQ();
            System.out.print(ch + " ");
        }

        System.out.println();
        iCharInQueue = circularQueue;
        // Place a series of characters into a circular queue
        for (i = 0; i < 10; i++)
            iCharInQueue.putCharQ((char) ('A' + i));
        // Displaying the contents of the queue
        System.out.print("Circular queue contents: ");
        for (i = 0; i < 10; i++){
            ch = iCharInQueue.extractCharQ();
            System.out.print(ch + " ");
        }

        System.out.println();
        // Putting extra characters into the circular queue
        for (i = 10; i < 20; i++)
            iCharInQueue.putCharQ((char) ('A' + i));
        // Displaying the contents of the queue
        System.out.println("Contents of a circular queue with additional characters:");
        for (i = 0; i < 10; i++){
            ch = iCharInQueue.extractCharQ();
            System.out.print(ch + " ");
        }
        System.out.println("\nStoring and using items in a circular queue:");
        for (i = 0; i < 20; i++){
            iCharInQueue.putCharQ((char) ('A' + i));
            ch = iCharInQueue.extractCharQ();
            System.out.print(ch + " ");
        }

    }
}
