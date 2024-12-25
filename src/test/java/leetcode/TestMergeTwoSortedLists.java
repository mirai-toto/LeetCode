package leetcode;

import leetcode.common.ListNode;
import leetcode.solution.SolutionMergeTwoSortedLists;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static leetcode.utils.ListNodeUtils.*;

public class TestMergeTwoSortedLists {
  private SolutionMergeTwoSortedLists solutionMergeTwoSortedLists;

  @BeforeEach
  void setUp() {
    this.solutionMergeTwoSortedLists = new SolutionMergeTwoSortedLists();
  }

  @Test
  public void test1() {
    ListNode listNode1 = arrayListToListNode(List.of(1, 3, 5, 7, 9));
    ListNode listNode2 = arrayListToListNode(List.of(2, 4, 6, 8, 10));
    printListNode(listNode1);
    printListNode(listNode2);
    ListNode mergedTwoLists = solutionMergeTwoSortedLists.mergeTwoLists(listNode1, listNode2);

    List<Integer> solutionList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> mergedTwoListsAsArrayList = listNodeToArrayList(mergedTwoLists);
    printListNode(mergedTwoLists);
    Assertions.assertArrayEquals(mergedTwoListsAsArrayList.toArray(), solutionList.toArray());
  }
}
