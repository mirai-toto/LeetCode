package leetcode.utils;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class ListNodeUtils {
  public static ListNode arrayListToListNode(List<Integer> list) {
    ListNode listNode = null;
    ListNode first = null;
    for (Integer i : list) {
      if (listNode == null) {
        first = new ListNode(i, null);
        listNode = first;
      } else {
        listNode.setNext(new ListNode(i));
        listNode = listNode.getNext();
      }
    }
    return first;
  }

  public static List<Integer> listNodeToArrayList(ListNode listNode) {
    List<Integer> list = new ArrayList<>();
    while (listNode != null) {
      list.add(listNode.getVal());
      listNode = listNode.getNext();
    }
    return list;
  }

  public static void printListNode(ListNode listNode) {
    System.out.print("List : [");
    while (listNode != null) {
      if (listNode.getNext() != null)
        System.out.print(listNode.getVal() + ", ");
      else
        System.out.print(listNode.getVal());
      listNode = listNode.getNext();
    }
    System.out.println("]");
  }

  private ListNodeUtils() {
  }

}
