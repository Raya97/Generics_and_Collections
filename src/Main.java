import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        demoMyArrayList();
        demoMyLinkedList();
        demoMyHashMap();
        demoMyQueue();
        demoMyStack();
    }

    private static void demoMyArrayList() {
        System.out.println("MyArrayList Demo =====");
        MyArrayList<Integer> myArrayList = new MyArrayList<>();

        // Додавання 1 млн елементів в MyArrayList
        for (int i = 1; i <= 1_000_000; i++) {
            myArrayList.add(i);
        }

        // Виведення кількості елементів MyArrayList
        System.out.println("Size of MyArrayList: " + myArrayList.size());

        // Видалення елемента з MyArrayList за індексом
        myArrayList.remove(2);
        System.out.println("MyArrayList after removing element at index 2");

        // Очищення MyArrayList
        myArrayList.clear();
        System.out.println("MyArrayList after clearing");
    }

    private static void demoMyLinkedList() {
        System.out.println("\nMyLinkedList Demo =====");
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        // Додавання 1 млн елементів в MyLinkedList
        for (int i = 1; i <= 1_000_000; i++) {
            myLinkedList.add("Element " + i);
        }

        // Виведення кількості елементів MyLinkedList
        System.out.println("Size of MyLinkedList: " + myLinkedList.size());

        // Видалення елемента з MyLinkedList за індексом
        myLinkedList.remove(1);
        System.out.println("MyLinkedList after removing element at index 1");

        // Очищення MyLinkedList
        myLinkedList.clear();
        System.out.println("MyLinkedList after clearing");
    }

    private static void demoMyHashMap() {
        System.out.println("\nMyHashMap Demo =====");
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();

        // Додавання 1 млн пар ключ-значення в MyHashMap
        for (int i = 1; i <= 1_000_000; i++) {
            myHashMap.put("Key " + i, i);
        }

        // Виведення кількості елементів MyHashMap
        System.out.println("Size of MyHashMap: " + myHashMap.size());

        // Видалення пари ключ-значення з MyHashMap
        myHashMap.remove("Key 500");
        System.out.println("MyHashMap after removing key 'Key 500'");

        // Очищення MyHashMap
        myHashMap.clear();
        System.out.println("MyHashMap after clearing");
    }

    private static void demoMyQueue() {
        System.out.println("\nMyQueue Demo =====");
        MyQueue<String> myQueue = new MyQueue<>();

        // Додавання 1 млн елементів в MyQueue
        for (int i = 1; i <= 1_000_000; i++) {
            myQueue.add("Element " + i);
        }

        // Виведення кількості елементів MyQueue
        System.out.println("Size of MyQueue: " + myQueue.size());

        // Отримання першого елемента з MyQueue
        System.out.println("Peek: " + myQueue.peek());

        // Видалення першого елемента з MyQueue
        System.out.println("Poll: " + myQueue.poll());
        System.out.println("MyQueue after poll");

        // Розмір MyQueue
        System.out.println("Size of MyQueue: " + myQueue.size());
    }

    private static void demoMyStack() {
        System.out.println("\nMyStack Demo =====");
        MyStack<String> myStack = new MyStack<>();

        // Додавання 1 млн елементів в MyStack
        for (int i = 1; i <= 1_000_000; i++) {
            myStack.push("Element " + i);
        }

        // Виведення кількості елементів MyStack
        System.out.println("Size of MyStack: " + myStack.size());

        // Отримання верхнього елемента MyStack
        System.out.println("Peek: " + myStack.peek());

        // Видалення верхнього елемента MyStack
        System.out.println("Pop: " + myStack.pop());
        System.out.println("MyStack after pop");

        // Розмір MyStack
        System.out.println("Size of MyStack: " + myStack.size());
    }
}
