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
        System.out.println(s.numSubmatrixSumTarget(new int[][]{{2,2},{1,1}}, 4));
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
                        long size = sum[ii][jj]
                                    - (i>0?sum[i-1][jj]:0)
                                    - (j>0?sum[ii][j-1]:0)
                                    + (i>0&& j>0?sum[i-1][j-1]:0);
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

