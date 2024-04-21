package main.java.leetcode.solution;

import main.java.leetcode.common.ListNode;

public class SolutionMergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tmp;
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        if (list1.getVal() <= list2.getVal()) {
            tmp = list1;
            tmp.setNext(mergeTwoLists(list1.getNext(), list2));
        } else {
            tmp = list2;
            tmp.setNext(mergeTwoLists(list1, list2.getNext()));
        }
        return tmp;
    }
}
