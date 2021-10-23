package ss9_list.baitap.trienkhaicacphuongthuccualinkedlist;

public class LinkedList<T> {
    private Node head;
    private int numberNode = 0;

    public LinkedList() {

    }
    public LinkedList(T elements){
        head = new Node(elements);
    }
    public void add(int index, T element){
       Node temp = head;
       for(int i=0;i<index-1;i++){
           temp = temp.next;
       }
       Node after = temp.next;
       temp.next = new Node(element);
       temp.next.next = after;
       numberNode++;
    }
    public void addFirst(T element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numberNode++;
    }

    public T get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (T) temp.getData();
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }

    public int size() {
        return numberNode;
    }

    private class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
}
