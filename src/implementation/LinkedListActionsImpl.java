package implementation;


import java.util.HashSet;
import java.util.NoSuchElementException;

public class LinkedListActionsImpl implements LinkedListActions {
    Node head;

    public int size;

    public static class Node {
        String data;

        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    @Override
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (size > 0) {
            newNode.next = head;
        }
        head = newNode;
        size++;
    }

    @Override
    public void addLast(String data) {
        Node newNode = new Node(data);
        Node current = head;
        if (size > 0) {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            size++;
            return;
        }
        head = newNode;
        size++;
    }

    @Override
    public Node removeFirst() throws NoSuchElementException {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        Node current = head.next;
        head.next = null;
        head = current;
        size--;
        return head;
    }

    @Override
    public Node removeLast() throws NoSuchElementException {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        if (size == 1) {
            head = null;
            size--;
            return null;
        }
        Node current = head;
        Node nextNode = head.next;

        while (nextNode.next != null) {
            current = nextNode;
            nextNode = nextNode.next;
        }
        current.next = null;
        size--;
        return head;
    }

    @Override
    public boolean find(String data) {
        if (size == 0) {
            return false;
        }
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public Node updateByIndex(int index, String data) throws IndexOutOfBoundsException {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("Please specify a valid index.");
        }
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data = data;
        return newNode;
    }

    @Override
    public Node get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("Please specify a valid index.");
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    @Override
    public void add(int index, String data) throws IndexOutOfBoundsException {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("Please specify a valid index.");
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node currentNode = head;
        Node newNode = new Node(data);
        int i = 0;
        while (i < index - 1) {
            currentNode = currentNode.next;
            i++;
        }
        Node tempNode = currentNode.next;
        currentNode.next = newNode;
        newNode.next = tempNode;
        size++;
    }

    @Override
    public Node removeByIndex(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("Please specify a valid index.");
        }
        if (index == 0) {
            Node current = head.next;
            head.next = null;
            head = current;
            size--;
            return head;
        }
        Node currentNode = head;
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;
        }
        Node tempNode = currentNode.next;
        currentNode.next = tempNode.next;
        tempNode.next = null;
        size--;
        return tempNode;
    }

    @Override
    public void remove(String data) throws NoSuchElementException {
        if (size == 0) {
            throw new NoSuchElementException("Linked list is empty..!!");
        }
        if (size == 1) {
            this.removeFirst();
            return;
        }
        Node current = head;
        Node nextNode = current.next;
        while (nextNode != null) {
            if (nextNode.data.equals(data)) {
                break;
            }
            nextNode = nextNode.next;
            current = current.next;
        }
        current.next = nextNode.next;
        nextNode.next = null;
        size--;
    }

    @Override
    public int filterDuplicates() {
        if (head == null || size == 1) {
            return 0;
        }

        int duplicateCount = 0;
        Node current = head;
        Node prev = null;
        HashSet<String> distinctNodesList = new HashSet<>();

        while (current != null) {
            if (distinctNodesList.contains(current.data)) {
                prev.next = current.next;
                duplicateCount++;
            } else {
                distinctNodesList.add(current.data);
                prev = current;
            }
            current = current.next;
        }
        return duplicateCount;
    }

    @Override
    public void reverse() {
        if (head == null || size == 1) {
            return;
        }
        Node current = head;
        Node previous = null;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    @Override
    public void print() {
        if (size == 0) {
            System.out.println("Linked List is Empty..!!");
            return;
        }
        Node current = head;

        while (current != null) {
            System.out.print(current.data);
            System.out.print(" -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    @Override
    public void printNode(Node node) {
        System.out.printf("Data: %s\n", node.data);
    }

}


