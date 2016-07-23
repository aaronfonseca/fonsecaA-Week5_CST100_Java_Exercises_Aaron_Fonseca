/** Program: Listing 10.08
* File: StackOfIntegers.java
* Summary: Listing 10.08
* Author: Aaron Fonseca
* Date: July 20, 2016
**/

public class StackOfIntegers {

    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    // Create new stack with capacity of 16    
    public StackOfIntegers() {
        this(DEFAULT_CAPACITY);
    }

    // Create new stack with set capacity
    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }

    // Push new int to the top
    public int push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        return elements[size++] = value;
    }

    // Return and remove the top element
    public int pop() {
        return elements[--size];
    }

    // Return the size of the element
    public int peek() {
        return elements[size - 1];
    }

    // If empty
    public boolean empty() {
        return size == 0;
    }

    // Return the size
    public int getSize() {
        return size;
    }
}