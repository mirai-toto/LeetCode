package main.java.leetcode.common;

/**
 * Definition for singly-linked list.
 * public class main.java.leetcode.common.ListNode {
 * int val;
 * main.java.leetcode.common.ListNode next;
 * main.java.leetcode.common.ListNode() {}
 * main.java.leetcode.common.ListNode(int val) { this.val = val; }
 * main.java.leetcode.common.ListNode(int val, main.java.leetcode.common.ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class ListNode {
    private int val;

    private ListNode next;

    public ListNode() { }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
