import com.sun.deploy.util.StringUtils;
import javafx.util.Pair;

import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    /*
     * @param graph: A list of Directed graph node
     * @return: Any topological order for the given graph.
     */
    static int MOD = 1_000_000_007;
    public static void main(String[] args) {
        Solution s = new Solution();
    }




}

/**
 *
 * 912
 * public int[] sortArray(int[] nums){
 *         sort(nums, 0, nums.length-1);
 *         return nums;
 *     }
 *
 *     private void sort(int[] nums, int left, int right){
 *         if(left>=right)
 *             return;
 *         int pivot = nums[right];
 *         int idx= left;
 *         for(int i=left;i<right;i++){
 *             if(nums[i]<=pivot){
 *                 swap(nums, i, idx++);
 *             }
 *         }
 *         swap(nums, idx, right);
 *
 *         sort(nums, left, idx-1);
 *         sort(nums, idx+1, right);
 *     }
 *
 *     private void swap(int[] nums, int idx1, int idx2){
 *         int tmp = nums[idx1];
 *         nums[idx1] = nums[idx2];
 *         nums[idx2] = tmp;
 *     }
 *
 *  // 1014
 *     public int maxScoreSightseeingPair(int[] A){
 *         // a[i] +A[j] - j +i;
 *         int max = 0;
 *         PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> A[a] - a - A[b] + b);
 *         for(int i=0;i<A.length;i++){
 *             if(pq.size()>0){
 *                 int idx = pq.peek();
 *                 max = Math.max(max, A[idx]+A[i]+idx - i);
 *             }
 *             pq.add(i);
 *         }
 *
 *         return max;
 *     }
 *
 *     // 1017
 *     public String baseNeg2(int N){
 *         StringBuilder sb = new StringBuilder();
 *         String sign = N<0?"-":"";
 *         N = Math.abs(N);
 *         while(N!=0){
 *             sb.insert(0, N%2);
 *             N/=2;
 *         }
 *         sb.insert(0, sign);
 *         return sb.toString();
 *     }
 *
 *     // 1019
 *         // head,  2, 3, 1
 *     // ts: 1, 3
 *     // arr 3, 0, 0,
 *     public int[] nextLargerNodes(ListNode head){
 *         List<Integer> arr = new LinkedList<>();
 *         findNext(arr, head,  new TreeSet());
 *         int[] res = new int[arr.size()];
 *         for(int i=0;i<arr.size();i++){
 *             res[i] = arr.get(i);
 *         }
 *         return res;
 *     }
 *
 *     private void findNext(List<Integer> arr, ListNode head, TreeSet<Integer> ts){
 *         if(head==null)
 *             return;
 *         findNext(arr, head, ts);
 *         Integer nextBig = ts.higher(head.val);
 *         arr.add(0, nextBig==null?0:nextBig);
 *         ts.add(head.val);
 *     }
 *
 *
 * 1020. Number of Enclaves
 * Medium
 *
 * 89
 *
 * 13
 *
 * Favorite
 *
 * Share
 * Given a 2D array A, each cell is 0 (representing sea) or 1 (representing land)
 *
 * A move consists of walking from one land square 4-directionally to another land square, or off the boundary of the grid.
 *
 * Return the number of land squares in the grid for which we cannot walk off the boundary of the grid in any number of moves.
 *
 *
 *
 * Example 1:
 *
 * Input: [[0,0,0,0],[1,0,1,0],[0,1,1,0],[0,0,0,0]]
 * Output: 3
 * Explanation:
 * There are three 1s that are enclosed by 0s, and one 1 that isn't enclosed because its on the boundary.
 * Example 2:
 *
 * Input: [[0,1,1,0],[0,0,1,0],[0,0,1,0],[0,0,0,0]]
 * Output: 0
 * Explanation:
 * All 1s are either on the boundary or can reach the boundary.
 *
 * public int numEnclaves(int[][] A) {
 *
 *     }
 *
 *
 *     1074. Number of Submatrices That Sum to Target
 * Hard
 *
 * 100
 *
 * 4
 *
 * Favorite
 *
 * Share
 * Given a matrix, and a target, return the number of non-empty submatrices that sum to target.
 *
 * A submatrix x1, y1, x2, y2 is the set of all cells matrix[x][y] with x1 <= x <= x2 and y1 <= y <= y2.
 *
 * Two submatrices (x1, y1, x2, y2) and (x1', y1', x2', y2') are different if they have some coordinate that is different: for example, if x1 != x1'.
 *
 *
 *
 * Example 1:
 *
 * Input: matrix = [[0,1,0],[1,1,1],[0,1,0]], target = 0
 * Output: 4
 * Explanation: The four 1x1 submatrices that only contain 0.
 * Example 2:
 *
 * Input: matrix = [[1,-1],[-1,1]], target = 0
 * Output: 5
 * Explanation: The two 1x2 submatrices, plus the two 2x1 submatrices, plus the 2x2 submatrix.
 *
 *
 * Note:
 *
 * 1 <= matrix.length <= 300
 * 1 <= matrix[0].length <= 300
 * -1000 <= matrix[i] <= 1000
 * -10^8 <= target <= 10^8
 *
 * public int numSubmatrixSumTarget(int[][] matrix, int target) {
 *
 *     }
 *
 *
 *
 *
 *     1063. Number of Valid Subarrays
 * Hard
 *
 * 26
 *
 * 4
 *
 * Favorite
 *
 * Share
 * Given an array A of integers, return the number of non-empty continuous subarrays that satisfy the following condition:
 *
 * The leftmost element of the subarray is not larger than other elements in the subarray.
 *
 *
 *
 * Example 1:
 *
 * Input: [1,4,2,5,3]
 * Output: 11
 * Explanation: There are 11 valid subarrays: [1],[4],[2],[5],[3],[1,4],[2,5],[1,4,2],[2,5,3],[1,4,2,5],[1,4,2,5,3].
 * Example 2:
 *
 * Input: [3,2,1]
 * Output: 3
 * Explanation: The 3 valid subarrays are: [3],[2],[1].
 * Example 3:
 *
 * Input: [2,2,2]
 * Output: 6
 * Explanation: There are 6 valid subarrays: [2],[2],[2],[2,2],[2,2],[2,2,2].
 *
 * public int validSubarrays(int[] nums) {
 *
 *     }
 *
 *     1104. Path In Zigzag Labelled Binary Tree
 * Medium
 *
 * 67
 *
 * 61
 *
 * Favorite
 *
 * Share
 * In an infinite binary tree where every node has two children, the nodes are labelled in row order.
 *
 * In the odd numbered rows (ie., the first, third, fifth,...), the labelling is left to right, while in the even numbered rows (second, fourth, sixth,...), the labelling is right to left.
 *
 *
 *
 * Given the label of a node in this tree, return the labels in the path from the root of the tree to the node with that label.
 *
 *dfsdf
 *
 * Example 1:
 *
 * Input: label = 14
 * Output: [1,3,4,14]
 * Example 2:
 *
 * Input: label = 26
 * Output: [1,2,6,10,26]
 *
 * public List<Integer> pathInZigZagTree(int label) {
 *
 *     }
 *
 *
 */










/**
 *  BELOW ARE THE LIBRARY
 */


class Point{
    public int x,y,val;
    public Point(int x, int y, int val){
        this.x = x;
        this.y = y;
        this.val = val;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}

class TrieNode {
    TrieNode[] children;
    boolean isEndOfWord;

    TrieNode() {
        isEndOfWord = false;
        children = new TrieNode[26];
    }

    public void insert(String key) {
        int index;
        TrieNode pCrawl = this;

        for (int i = 0; i < key.length(); i++) {
            index = key.charAt(i) - 'a';
            if (pCrawl.children[index] == null)
                pCrawl.children[index] = new TrieNode();

            pCrawl = pCrawl.children[index];
        }
        pCrawl.isEndOfWord = true;
    }

    public boolean search(String key) {
        int index;
        TrieNode pCrawl = this;

        for (int i = 0; i < key.length(); i++) {
            index = key.charAt(i) - 'a';
            if (pCrawl.children[index] == null)
                return false;
            pCrawl = pCrawl.children[index];
        }
        return (pCrawl != null && pCrawl.isEndOfWord);
    }

}
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }
}

