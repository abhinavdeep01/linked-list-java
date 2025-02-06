package implementation;

import java.util.NoSuchElementException;

import implementation.LinkedListActionsImpl.Node;

public interface LinkedListActions {

    /**
     * Inserts Node at the beginning of linked list.
     *
     * @param data the data to be added
     */
    void addFirst(String data);

    /**
     * Inserts Node to the end of linked list.
     *
     * @param data the data to be added
     */
    void addLast(String data);

    /**
     * Removes and returns the head Node from the linked list.
     *
     * @return the head node of the linked list
     * @throws NoSuchElementException if the linked list is empty
     */
    Node removeFirst() throws NoSuchElementException;

    /**
     * Removes and returns the first node from the linked list.
     *
     * @return the last node from the linked list
     * @throws NoSuchElementException if the linked list is empty
     */
    Node removeLast() throws NoSuchElementException;

    /**
     * Finds and returns true if node exists with the specified data.
     *
     * @param data data of the node
     * @return boolean - true if node exists with the specified data
     */
    boolean find(String data);

    /**
     * Updates the node data with the specified index.
     *
     * @param index index of the node to be updated
     * @param data  new value for the specified index
     * @return the updated node
     * @throws IndexOutOfBoundsException {@inheritDoc} if the index does not exist in linked list
     */
    Node updateByIndex(int index, String data) throws IndexOutOfBoundsException;

    /**
     * Returns the node at the specified position in the linked list.
     *
     * @param index index of the node to return
     * @return the node at the specified index in the linked list
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    Node get(int index) throws IndexOutOfBoundsException;

    /**
     * Insert the node at the specified index in the linked list.
     *
     * @param index index at which the node is to be inserted
     * @param data  the data to be inserted
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    void add(int index, String data) throws IndexOutOfBoundsException;

    /**
     * Removes and returns the node at the specified index in the linked list.
     *
     * @param index index of the node to remove
     * @return the removed node
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    Node removeByIndex(int index) throws IndexOutOfBoundsException;

    /**
     * Removes the first occurrence of the node with the
     * specified data from the linked list. If the linked
     * list does not contain a node with the specified data,
     * it is unchanged.
     *
     * @param data data of the node to be removed from
     *             the linked list, if present
     * @throws NoSuchElementException if the node with the provided
     *                                data does not exist
     */
    void remove(String data) throws NoSuchElementException;

    /**
     * Filters the linked list such that every duplicate node is removed.
     *
     * @return number of removed nodes
     */
    int filterDuplicates();

    /**
     * Reverses the linked list.
     */
    void reverse();

    /**
     * Prints the linked list.
     */
    void print();

    /**
     * Prints the node of linked list.
     */
    void printNode(Node node);
}
