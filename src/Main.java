import implementation.LinkedListActionsImpl;

public class Main {
    public static void main(String[] args) {

        LinkedListActionsImpl linkedListActions = new LinkedListActionsImpl();
        linkedListActions.addFirst("12");
        linkedListActions.addFirst("2");
        linkedListActions.addFirst("3");
        linkedListActions.addFirst("4");
        linkedListActions.addFirst("1");
        linkedListActions.addFirst("6");
        linkedListActions.addLast("7");
        linkedListActions.addFirst("6");
        linkedListActions.addLast("7");
        linkedListActions.addLast("8");
        linkedListActions.addFirst("10");
        linkedListActions.removeFirst();
        linkedListActions.removeLast();
        linkedListActions.updateByIndex(6, "122");
        System.out.println(linkedListActions.find("122"));
        LinkedListActionsImpl.Node getNode = linkedListActions.get(1);
        linkedListActions.printNode(getNode);
        linkedListActions.add(3, "677");
        linkedListActions.add(0, "777");
        linkedListActions.removeByIndex(4);
        linkedListActions.removeByIndex(7);
        linkedListActions.removeByIndex(0);
        linkedListActions.remove("2");
        linkedListActions.addFirst("3");
        linkedListActions.addFirst("4");
        linkedListActions.addFirst("1");
        linkedListActions.addFirst("6");
        linkedListActions.addLast("7");
        linkedListActions.addLast("8");
        linkedListActions.addFirst("10");
        linkedListActions.print();
        System.out.println(linkedListActions.size);
        linkedListActions.reverse();
        linkedListActions.print();
        System.out.println(linkedListActions.filterDuplicates());
        linkedListActions.print();
    }
}