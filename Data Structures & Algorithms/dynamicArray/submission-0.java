public class DynamicArray {
    private int[] arr;
    private int size;
    private int capacity;

    // Initializes an empty array with a capacity of capacity
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.arr = new int[capacity];
    }

    // Returns the element at index i
    public int get(int i) {
        return arr[i];
    }

    // Sets the element at index i to n
    public void set(int i, int n) {
        arr[i] = n;
    }

    // Pushes the element n to the end of the array
    public void pushback(int n) {
        if (size == capacity) {
            resize();
        }
        arr[size] = n;
        size++;
    }

    // Pops and returns the element at the end of the array
    public int popback() {
        size--;
        return arr[size];
    }

    // Doubles the capacity of the array
    public void resize() {
        capacity *= 2;
        int[] newArr = new int[capacity];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    // Returns the number of elements in the array
    public int getSize() {
        return size;
    }

    // Returns the capacity of the array
    public int getCapacity() {
        return capacity;
    }

    // Main method to verify the code against Example 3 from your prompt
    public static void main(String[] args) {
        System.out.println("--- Running Example 3 ---");
        
        DynamicArray obj = new DynamicArray(1); // ["Array", 1] -> null
        System.out.println("getSize: " + obj.getSize());         // [0]
        System.out.println("getCapacity: " + obj.getCapacity()); // [1]
        
        obj.pushback(1);                                         // -> null
        System.out.println("getSize: " + obj.getSize());         // [1]
        System.out.println("getCapacity: " + obj.getCapacity()); // [1]
        
        obj.pushback(2);                                         // -> null (forces resize)
        System.out.println("getSize: " + obj.getSize());         // [2]
        System.out.println("getCapacity: " + obj.getCapacity()); // [2]
        
        System.out.println("get(1): " + obj.get(1));             // [2]
        obj.set(1, 3);                                           // -> null
        System.out.println("get(1) after set: " + obj.get(1));   // [3]
        
        System.out.println("popback: " + obj.popback());         // [3]
        System.out.println("getSize: " + obj.getSize());         // [1]
        System.out.println("getCapacity: " + obj.getCapacity()); // [2]
    }
}
