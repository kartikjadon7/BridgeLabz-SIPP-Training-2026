package Linkedlist;




public class Student<T> {
    private T sId;
    private Student<?> next;

    public Student(T sId) {
        this.sId = sId;
        this.next = null;
    }

    public void printLinkedList() {
        Student<?> current = this;
        while (current != null) {
            System.out.print(current.sId + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Student<Integer> n1 = new Student<>(2);
        Student<String> n2 = new Student<>("Str");
        Student<Integer> n3 = new Student<>(8);

        n1.next = n2;
        n2.next = n3;

        n1.printLinkedList();
    }
}