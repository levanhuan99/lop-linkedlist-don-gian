public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList=new MyLinkedList<>();

        myLinkedList.addFirst("số 1");
        myLinkedList.add(1,"số 2");
        myLinkedList.add(2,"số 3");
        myLinkedList.add(3,"số 4");
        myLinkedList.addLast("số 5");
        myLinkedList.remove("số 1");
        myLinkedList.printList();


    }
}
