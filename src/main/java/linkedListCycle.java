package main.java;

/**
 * @author xiaolong.zhang
 */
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class linkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (null == head){
            return false;
        }
        ListNode pSlow = head;
        ListNode qFast = head;
        while (null != pSlow && null != qFast && null != qFast.next){
            pSlow = pSlow.next;
            qFast = qFast.next.next;
            if (pSlow == qFast){
                return true;
            }
        }
        return false;
    }
}
