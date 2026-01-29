package Structures;
public class MyCustomQueue<E> {
    private Node<E> head, tail;
    public void enqueue(E item) {
        Node<E> newNode = new Node<>(item);
        if (tail == null) { head = tail = newNode; return; }
        tail.next = newNode; tail = newNode;
    }
    public E dequeue() {
        if (head == null) return null;
        E data = head.data; head = head.next;
        if (head == null) tail = null;
        return data;
    }
    public boolean isEmpty() { return head == null; }
}