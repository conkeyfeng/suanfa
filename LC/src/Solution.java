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

    // 1074
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;
        long[][] sum = new long[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sum[i][j] = matrix[i][j];
                if(i>0)
                    sum[i][j] += sum[i-1][j];
                if(j>0)
                    sum[i][j] += sum[i][j-1];
                if(i>0 && j>0)
                    sum[i][j] -= sum[i-1][j-1];
            }
        }
        int res =0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                for(int ii=i;ii<row;ii++){
                    for(int jj=j;jj<col;jj++){
                        if(i==ii && j==jj)
                            continue;
                        long size = sum[ii][jj] -
                                    (i>0?sum[i-1][jj]:0) -
                                    (j>0?sum[ii][j-1]:0) +
                                    (i>0&& i>0?sum[i-1][j-1]:0);
                        if(size==target)
                            res++;
                    }
                }
            }
        }
        return res;
    }

}

/**
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

