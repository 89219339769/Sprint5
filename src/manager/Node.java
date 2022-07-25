package manager;

public class Node<T> {
    private Node<T> prev;
    private Node<T> next;
    private T task;

    Node(Node<T> prev, Node<T> next, T task) {
        this.prev = prev;
        this.next = next;
        this.task = task;
    }

    Node<T> getPrev() {
        return this.prev;
    }

    Node<T> getNext() {
        return this.next;
    }

    tasks.Task getItem() {
        return (tasks.Task) this.task;
    }

    void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return
                " task=" + task ;
    }
}
