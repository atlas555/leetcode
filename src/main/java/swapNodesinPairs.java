package main.java;

/**
 * @author xiaolong zhang
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
        }
    }

public class swapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if (null == head || null == head.next){
            return head;
        }
        ListNode  guard= new ListNode(0);
        guard.next = head;
        ListNode pNode = guard;
        ListNode qNode = head;

        while (null != qNode && null != qNode.next ){
            pNode.next = qNode.next;
            qNode.next = pNode.next.next;
            pNode.next.next = qNode;
            pNode = qNode;
            qNode = qNode.next;
        }
        return guard.next;
    }

    public static void main(String[] args){
        //create test ListNode
        int num = 1;
        ListNode head = null;
        while (num <= 4){
            ListNode node = new ListNode(num);
            node.next = head;
            head = node;
            num++;
        }

        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }
        ListNode listNode = new swapNodesinPairs().swapPairs(head);
    }
}
