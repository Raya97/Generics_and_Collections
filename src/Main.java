public class Main {

    public static void main(String[] args) {
        // Демонстрація роботи з MyArrayList
        demoMyArrayList();

        // Демонстрація роботи з MyLinkedList
        demoMyLinkedList();

        // Демонстрація роботи з MyQueue
        demoMyQueue();

        // Демонстрація роботи з MyStack
        demoMyStack();

        // Демонстрація роботи з MyHashMap
        demoMyHashMap();
    }

    private static void demoMyArrayList() {
        System.out.println("===== MyArrayList Demo =====");

        MyArrayList<Integer> myArrayList = new MyArrayList<>();

        // Заповнення колекції 1 млн елементів
        for (int i = 1; i <= 1000000; i++) {
            myArrayList.add(i);
        }

        System.out.println("Size: " + myArrayList.size());
        System.out.println("Element at index 500000: " + myArrayList.get(500000));
        myArrayList.remove(500000);
        System.out.println("Size after removing element: " + myArrayList.size());

        myArrayList.clear();
        System.out.println("Size after clearing: " + myArrayList.size());

        System.out.println();
    }

    private static void demoMyLinkedList() {
        System.out.println("===== MyLinkedList Demo =====");

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        // Заповнення колекції 1 млн елементів
        for (int i = 1; i <= 1000000; i++) {
            myLinkedList.add(i);
        }

        System.out.println("Size: " + myLinkedList.size());
        System.out.println("Element at index 500000: " + myLinkedList.get(500000));
        myLinkedList.remove(500000);
        System.out.println("Size after removing element: " + myLinkedList.size());

        myLinkedList.clear();
        System.out.println("Size after clearing: " + myLinkedList.size());

        System.out.println();
    }

    private static void demoMyQueue() {
        System.out.println("===== MyQueue Demo =====");

        MyQueue<Integer> myQueue = new MyQueue<>();

        // Заповнення черги 1 млн елементів
        for (int i = 1; i <= 1000000; i++) {
            myQueue.add(i);
        }

        System.out.println("Size: " + myQueue.size());
        System.out.println("Peek: " + myQueue.peek());

        myQueue.poll();
        System.out.println("Size after polling: " + myQueue.size());
        System.out.println("Peek after polling: " + myQueue.peek());

        myQueue.clear();
        System.out.println("Size after clearing: " + myQueue.size());

        System.out.println();
    }

    private static void demoMyStack() {
        System.out.println("===== MyStack Demo =====");

        MyStack<Integer> myStack = new MyStack<>();

        // Заповнення стеку 1 млн елементів
        for (int i = 1; i <= 1000000; i++) {
            myStack.push(i);
        }

        System.out.println("Size: " + myStack.size());
        System.out.println("Peek: " + myStack.peek());

        myStack.pop();
        System.out.println("Size after popping: " + myStack.size());
        System.out.println("Peek after popping: " + myStack.peek());

        myStack.clear();
        System.out.println("Size after clearing: " + myStack.size());

        System.out.println();
    }

    private static void demoMyHashMap() {
        System.out.println("===== MyHashMap Demo =====");

        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();

        // Заповнення хешмапи 1 млн елементів
        for (int i = 1; i <= 1000000; i++) {
            myHashMap.put("Key_" + i, i);
        }

        System.out.println("Size: " + myHashMap.size());
        System.out.println("Value for key 'Key_500000': " + myHashMap.get("Key_500000"));

        myHashMap.remove("Key_500000");
        System.out.println("Size after removing key: " + myHashMap.size());

        myHashMap.clear();
        System.out.println("Size after clearing: " + myHashMap.size());

        System.out.println();
    }
}
