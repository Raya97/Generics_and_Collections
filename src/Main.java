public class Main {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        myList.add("Hello");
        myList.add("World");
        System.out.println("Size of array: " + myList.size());
        System.out.println("Element 0: " + myList.get(0));
        System.out.println("Element 1: " + myList.get(1));
        myList.remove(0);
        System.out.println("Size after remove: " + myList.size());
        myList.clear();
        System.out.println("Size after clear: " + myList.size());
    }
}
