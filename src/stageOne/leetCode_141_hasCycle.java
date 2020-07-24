package stageOne;

import java.util.ArrayList;
import java.util.List;

/*
*   1.暴力法：
*
*
*/
public class leetCode_141_hasCycle {
    public static void main(String[] args) {
        ListNode head=new ListNode(3);
        int[] value={2,0,-4};
        ListNode t=head;
        for(int i:value){
           t.next=new ListNode(i);
           t=t.next;
        }

        System.out.println(hasCycle(head));
    }
    public static boolean hasCycle(ListNode head) {
        List<ListNode> con=new ArrayList();
        while(head!=null){
            if(con.contains(head)){
                return true;
            }
            head=head.next;
        }
        return false;
    }

    static class ListNode {
        int val;
        ListNode next;
       public ListNode(int x) {
            val=x;
            next=null;
        }


    }
}
