package CollectionsAll.collections.linklistDS;

//Find the first node of loop in linked list
/*      Given the head of a linked list, return the node where the cycle begins.
        If there is no cycle, return null.
        There is a cycle in a linked list if there is some node in the list
        that can be reached again by continuously following the next pointer.
        Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed).
        It is -1 if there is no cycle. Note that pos is not passed as a parameter.

        Do not modify the linked list.

Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.






        */

public class FirstNode {
    public static void main(String[] args) {

    }

//    public ListNode detectCycle(ListNode head) {
//        ListNode temp = head;
//        ListNode fast = head;
//        ListNode slow = head;
//        ListNode f = head;
//        ListNode s = head;
//
//        while(fast != null && fast.next != null && slow != null){
//            slow = slow.next;
//            fast = fast.next.next;
//            if(fast == slow){
//                //length of cycle
//                int len = 0;
//                do{
//                    temp = temp.next;
//                    len++;
//                }while(temp != slow);
//
//                // move s to a distance of length l
//                while(len > 0){
//                    s = s.next;
//                    len--;
//                }
//
//                // f is at head and s is at length l
//                // Start node(ans) is at a k disnace from f and s both
//                while(f != s){
//                    f = f.next;
//                    s = s.next;
//                }
//
//                return f;
//            }
//        }
//        return null;
//    }
}
