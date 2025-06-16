package leetcode;

/**
 * Utility class with helper methods for LeetCode problems
 */
public class LeetCodeUtils {
    
    /**
     * Definition for singly-linked list commonly used in LeetCode problems
     */
    public static class ListNode {
        int val;
        ListNode next;
        
        ListNode() {}
        
        ListNode(int val) {
            this.val = val;
        }
        
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
        
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            ListNode current = this;
            
            while (current != null) {
                sb.append(current.val).append(" -> ");
                current = current.next;
            }
            
            sb.append("null");
            return sb.toString();
        }
        
        /**
         * Utility method to create a linked list from an array
         */
        public static ListNode arrayToList(int[] array) {
            if (array == null || array.length == 0) {
                return null;
            }
            
            ListNode dummy = new ListNode(0);
            ListNode current = dummy;
            
            for (int val : array) {
                current.next = new ListNode(val);
                current = current.next;
            }
            
            return dummy.next;
        }
    }
    
    /**
     * Definition for a binary tree node commonly used in LeetCode problems
     */
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        TreeNode() {}
        
        TreeNode(int val) {
            this.val = val;
        }
        
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
    /**
     * Pretty-print a 2D array/matrix
     */
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
