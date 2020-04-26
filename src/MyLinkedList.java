import org.w3c.dom.Node;

public class MyLinkedList<T>{


    public class Node<T> {
        private Node<T> next;
        private T data;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return this.data;
        }
    }
    private Node<T> head;
    private int numberNodes;


    public void addFirst( T data) {
        if (head==null){
            head=new Node<>(data);
        }else {
            Node temp = head;
            head = new Node<T>(data);
            head.next = temp;
        }
        numberNodes++;
    }
    public void  addLast(T data){
        if (head==null){
            head=new Node<T>(data);
        }
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node<T>(data);
        }
        numberNodes++;
    }

    public T get(int index){
        Node temp =head;
        for (int i=0;i<index-1 &&head!=null;i++){
            temp=temp.next;
        }
        return (T) temp.next;
    }
    public void add(int index,T data){
       Node temp=head;
       for (int i=0;i<index-1 && temp.next!=null;i++){
           temp=temp.next;
       }
       Node hold=temp.next;
       temp.next=new Node<T>(data);
       temp.next.next=hold;
       numberNodes++;
    }
    public void printList(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.getData());
            temp=temp.next;
        }
    }
    public void removeFist(){
        if (head==null){
            throw new IndexOutOfBoundsException("o co");
        }
        head=head.next;                     //cái head mới sẽ là Node thứ 2 vì ta gán node đầu bằng node 2 rồi kìa
       }
    public void removeLast(){
        if (head==null){
            throw new IndexOutOfBoundsException("o co");
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp=null;
        numberNodes--;
    }

    public void remove(int index){
        Node temp=head;

        for (int i=0;i<index-1;i++){
            temp=temp.next;                     //temp lúc này bằng temp sẽ LÀ node ở  trước phần tử muốn xóa
        }
        temp.next=temp.next.next;               //gán cái temp.next=temp.next.next để trỏ về cái node sau phần tử muốn xóa
        numberNodes--;
    }


    public int getSize(){
        int index=1;
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
            index++;
        }
        return index;
    }

    public void remove(T element) {
        Node temp = head;
        int index=0;                                                //khong remove duoc o vi tri 0?
        for (int i=0;i<numberNodes;i++){
            if (temp.data==element){
                index=i;
                break;
            }
            temp=temp.next;
        }

        Node firstHead=head;
        for (int i=0;i<index-1;i++){
            firstHead=firstHead.next;
        }
        firstHead.next=firstHead.next.next;
        numberNodes--;

    }

//    public boolean contain(T element){
//        Node temp=head;
//        int index=0;
//        for (int i=0;i<numberNodes-1;i++){
//            if (temp.next.data==element){
//                index=i;
//                break;
//            }
//            temp=temp.next;
//        }
//        Node firstNode=head;
//
//        for (int i=0;i<index-1;i++){
//            firstNode=firstNode.next;
//        }
//        firstNode.next=firstNode.next.next;
//
//    }


}
