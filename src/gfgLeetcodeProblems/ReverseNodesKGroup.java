package gfgLeetcodeProblems;

//  Definition for singly-linked list.

//25. Reverse Nodes in k-Group - Optimise it !!

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class ReverseNodesKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int[] arr = new int[size];

        ListNode temp2 = head;
        int c = 0;
        while (temp2 != null) {
            arr[c] = temp2.val;
            temp2 = temp2.next;
            c++;
        }

        int[] res = new int[size];
        int count = 0;
        for (int i = 0; i < arr.length; i = i + k) {
            if (i + k <= arr.length) {
                //reverse
                int[] tempArr = new int[k];
                int j = 0;
                int m = i;
                for (j = 0; j < k; j++) {
                    tempArr[j] = arr[m];
                    m++;
                }

                for (j = k - 1; j >= 0; j--) {
                    res[count] = tempArr[j];
                    count++;
                }

            } else {
                //remaining
                while (i < arr.length) {
                    res[count] = arr[i];
                    i++;
                    count++;
                }
                break;
            }
        }

        ListNode nxt = null;
        ListNode ans = null;

        for (int x = res.length - 1; x >= 0; x--) {
            ans = new ListNode(res[x], nxt);
            nxt = ans;
        }

        return ans;

    }
}