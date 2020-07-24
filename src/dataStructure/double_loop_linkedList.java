package dataStructure;

public class double_loop_linkedList<T> {
    Node<T> first;
    public double_loop_linkedList(T[] nums) {
        Node<T> s=first;
        for(int i=0;i<nums.length;i++) {
            Node<T> node=new Node<T>();
            node.data=nums[i];
            node.previous=s;
            node.next=null;
            s=node;
        }
    }
    class Node<T> {
        private T data;
        private Node previous;
        private Node next;
    }
}

