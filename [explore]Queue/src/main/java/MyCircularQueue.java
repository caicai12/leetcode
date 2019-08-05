import java.util.ArrayList;
import java.util.List;

/**
 * @author: caiyq(蔡永琪)
 * @time: 2019/8/5 9:34
 */
//在循环中利用(int+1)%size来实现循环是很常见的
public class MyCircularQueue {

    private int[] data;
    private int head;
    private int tail;
    private int size;

    public void setData(int[] data) {
        this.data = data;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[] getData() {
        return data;
    }

    public int getHead() {
        return head;
    }

    public int getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        data = new int[k];
        head = -1;
        tail = -1;
        size = k;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (isFull() == true) {
            return false;
        }
        if (isEmpty() == true) {
            head = 0;
        }
        tail = (tail + 1) % size;
        data[tail] = value;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        if (head == tail) {
            head = -1;
            tail = -1;
            return true;
        }
        head = (head + 1) % size;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if (isEmpty() == true) {
            return -1;
        }
        return data[head];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if (isEmpty() == true) {
            return -1;
        }
        return data[tail];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return head == -1;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return ((tail + 1) % size) == head;
    }

    public static void main(String[] args) {

    }
}
