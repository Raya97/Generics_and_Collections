public class Main {
    public static void main(String[] args) {
        // Демонстрація роботи з MyArrayList
        System.out.println("----- MyArrayList -----");
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        for (int i = 0; i < 10; i++) {
            myArrayList.add(i);
        }
        System.out.println("Size: " + myArrayList.size());
        System.out.println("Element at index 5: " + myArrayList.get(5));
        myArrayList.remove(2);
        System.out.println("Size after removal: " + myArrayList.size());
        myArrayList.clear();
        System.out.println("Size after clear: " + myArrayList.size());

        // Демонстрація роботи з MyLinkedList
        System.out.println("\n----- MyLinkedList -----");
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("Hello");
        myLinkedList.add("World");
        myLinkedList.add("!");
        System.out.println("Size: " + myLinkedList.size());
        System.out.println("Element at index 1: " + myLinkedList.get(1));
        myLinkedList.remove(0);
        System.out.println("Size after removal: " + myLinkedList.size());
        myLinkedList.clear();
        System.out.println("Size after clear: " + myLinkedList.size());

        // Демонстрація роботи з MyQueue
        System.out.println("\n----- MyQueue -----");
        MyQueue<Double> myQueue = new MyQueue<>();
        myQueue.add(3.14);
        myQueue.add(2.71);
        System.out.println("Size: " + myQueue.size());
        System.out.println("First element: " + myQueue.peek());
        myQueue.poll();
        System.out.println("Size after poll: " + myQueue.size());
        myQueue.clear();
        System.out.println("Size after clear: " + myQueue.size());

        // Демонстрація роботи з MyStack
        System.out.println("\n----- MyStack -----");
        MyStack<Character> myStack = new MyStack<>();
        myStack.push('A');
        myStack.push('B');
        myStack.push('C');
        System.out.println("Size: " + myStack.size());
        System.out.println("Top element: " + myStack.peek());
        myStack.pop();
        System.out.println("Size after pop: " + myStack.size());
        myStack.clear();
        System.out.println("Size after clear: " + myStack.size());

        // Демонстрація роботи з MyHashMap
        System.out.println("\n----- MyHashMap -----");
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        myHashMap.put("one", 1);
        myHashMap.put("two", 2);
        myHashMap.put("three", 3);
        System.out.println("Size: " + myHashMap.size());
        System.out.println("Value for key 'two': " + myHashMap.get("two"));
        myHashMap.remove("one");
        System.out.println("Size after removal: " + myHashMap.size());
        myHashMap.clear();
        System.out.println("Size after clear: " + myHashMap.size());
    }
}
