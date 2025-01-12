package SinglyLinkList;


// Example usage
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        
        ListNode mergedList = solution.mergeTwoLists(list1, list2);
        printList(mergedList);  // Output: 1 -> 1 -> 2 -> 3 -> 4 -> 4
    }
    
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}