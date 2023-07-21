import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Демонстрація роботи з MyArrayList
        testMyArrayList();

        // Демонстрація роботи з MyLinkedList
        testMyLinkedList();

        // Демонстрація роботи з MyQueue
        testMyQueue();

        // Демонстрація роботи з MyStack
        testMyStack();

        // Демонстрація роботи з MyHashMap
        testMyHashMap();
    }

    private static void testMyArrayList() {
        System.out.println("\n----- MyArrayList -----");
        MyArrayList<Integer> myArrayList = new MyArrayList<>();

        // Заповнення MyArrayList 1 млн елементів
        for (int i = 0; i < 1000000; i++) {
            myArrayList.add(i);
        }

        // Демонстрація методів
        System.out.println("Size: " + myArrayList.size());
        System.out.println("Element at index 500000: " + myArrayList.get(500000));
        myArrayList.remove(0);
        System.out.println("Size after removal: " + myArrayList.size());
        myArrayList.clear();
        System.out.println("Size after clear: " + myArrayList.size());
    }

    private static void testMyLinkedList() {
        System.out.println("\n----- MyLinkedList -----");
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        // Заповнення MyLinkedList 1 млн елементів
        for (int i = 0; i < 1000000; i++) {
            myLinkedList.add("Element " + i);
        }

        // Демонстрація методів
        System.out.println("Size: " + myLinkedList.size());
        System.out.println("Element at index 500000: " + myLinkedList.get(500000));
        myLinkedList.remove(0);
        System.out.println("Size after removal: " + myLinkedList.size());
        myLinkedList.clear();
        System.out.println("Size after clear: " + myLinkedList.size());
    }

    private static void testMyQueue() {
        System.out.println("\n----- MyQueue -----");
        MyQueue<Double> myQueue = new MyQueue<>();

        // Заповнення MyQueue 1 млн елементів
        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {
            myQueue.add(random.nextDouble());
        }

        // Демонстрація методів
        System.out.println("Size: " + myQueue.size());
        System.out.println("First element: " + myQueue.peek());
        myQueue.poll();
        System.out.println("Size after poll: " + myQueue.size());
        myQueue.clear();
        System.out.println("Size after clear: " + myQueue.size());
    }

    private static void testMyStack() {
        System.out.println("\n----- MyStack -----");
        MyStack<Character> myStack = new MyStack<>();

        // Заповнення MyStack 1 млн елементів
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            myStack.push(ch);
        }

        // Демонстрація методів
        System.out.println("Size: " + myStack.size());
        System.out.println("Top element: " + myStack.peek());
        myStack.pop();
        System.out.println("Size after pop: " + myStack.size());
        myStack.clear();
        System.out.println("Size after clear: " + myStack.size());
    }

    private static void testMyHashMap() {
        System.out.println("\n----- MyHashMap -----");
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();

        // Заповнення MyHashMap 1 млн елементів
        for (int i = 0; i < 1000000; i++) {
            myHashMap.put("Key_" + i, i);
        }

        // Демонстрація методів
        System.out.println("Size: " + myHashMap.size());
        System.out.println("Value for key 'Key_500000': " + myHashMap.get("Key_500000"));
        myHashMap.remove("Key_0");
        System.out.println("Size after removal: " + myHashMap.size());
        myHashMap.clear();
        System.out.println("Size after clear: " + myHashMap.size());
    }
}
