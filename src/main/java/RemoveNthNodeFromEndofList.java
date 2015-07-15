package main.java;

/**
 * @author xiaolong zhang
 */
public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (null == head || 0 == n || null == head.next) {
            return null;
        }
        ListNode guard = new ListNode(-1);
        guard.next = head;
        ListNode pNode = guard;
        ListNode qNode = guard;
        while (n > 0 && null != pNode.next) {
            pNode = pNode.next;
            n--;
        }
        while (null != pNode.next){
            pNode = pNode.next;
            qNode = qNode.next;
        }
        if (null != qNode.next){
            qNode.next = qNode.next.next;
        }
        return guard.next;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode value = new RemoveNthNodeFromEndofList().removeNthFromEnd(head,1);

        System.out.println(value + " : " + value.val);
    }
}
