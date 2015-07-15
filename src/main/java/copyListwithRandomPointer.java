package main.java;

/**
 * @
 */

//Definition for singly-linked list with a random pointer.
class RandomListNode {
    int label;
    RandomListNode next, random;
    RandomListNode(int x) { this.label = x; }
};

public class copyListwithRandomPointer {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (null == head){
            return null;
        }
        RandomListNode p = head;
        RandomListNode copyHead = null;
        RandomListNode tmp  ;
        //复制链表，并且将复制的节点插入到链表中
        while (null != p){
            tmp = new RandomListNode(p.label);
            if (null == copyHead){
                copyHead = tmp;
            }
            tmp.next = p.next;
            p.next = tmp;
            p = p.next.next;
        }
        //复制新节点的random指针
        p = head;
        while (null != p){
            p.next.random = p.random != null ? p.random.next : null;
            p = p.next.next;
        }
        //拆分为两个链表
        p = head;
        while (null != p){
            tmp = p.next;
            p.next = tmp.next;
            tmp.next = p.next != null ? p.next.next : null;
            p = p.next;
        }
        return copyHead;
    }
}
