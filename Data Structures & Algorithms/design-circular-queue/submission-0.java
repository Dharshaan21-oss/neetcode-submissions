class MyCircularQueue {
    private int[] data;
    private int head;
    private int tail;
    private int count;
    private int capacity;

    public MyCircularQueue(int k) {
        this.capacity = k;
        this.data = new int[k];
        this.head = 0;
        this.tail = -1;
        this.count = 0;
    }
    
    public boolean enQueue(int value) {
        if (isFull()) return false;
        tail = (tail + 1) % capacity;
        data[tail] = value;
        count++;
        return true;
    }
    
    public boolean deQueue() {
        if (isEmpty()) return false;
        head = (head + 1) % capacity;
        count--;
        return true;
    }
    
    public int Front() {
        return isEmpty() ? -1 : data[head];
    }
    
    public int Rear() {
        return isEmpty() ? -1 : data[tail];
    }
    
    public boolean isEmpty() {
        return count == 0;
    }
    
    public boolean isFull() {
        return count == capacity;
    }
}