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
        int[] a = {3,2,63,12,654,2,0};
//        a = s.sortArray(a);
        for(int each: a)
            System.out.print(each+" ");
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

