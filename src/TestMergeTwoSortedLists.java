import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestMergeTwoSortedLists {
    private SolutionMergeTwoSortedLists solutionMergeTwoSortedLists;

    @BeforeEach
    void setUp() {
        this.solutionMergeTwoSortedLists = new SolutionMergeTwoSortedLists();
    }

    private ListNode createListNode(List<Integer> list) {
        ListNode listNode = null;
        ListNode first = null;
        for (Integer i : list) {
            if (listNode == null) {
                first = new ListNode(i, null);
                listNode = first;
            }
            else {
                listNode.next = new ListNode(i);
                listNode = listNode.next;
            }
        }
        return first;
    }

    private void printListNode(ListNode listNode) {
        while (listNode != null) {
            System.out.println(STR."[\{listNode.val}]");
            listNode = listNode.next;
        }
    }

    @Test
    public void test() {
        ListNode listNode = createListNode(List.of(2, 3, 5, 7, 11));
        printListNode(listNode);
    }
}
