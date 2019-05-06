import java.util.*;

public class Solution {
    static int MOD = 1_000_000_007;
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,0};
        Interval a = new Interval(0,30);
        Interval b = new Interval(5,10);
        Interval c = new Interval(15, 20);
        Solution s = new Solution();
        s.baseNeg2(3);
    }

    public String baseNeg2(int N) {
        int idx = 0;
        StringBuilder sb = new StringBuilder();
        while(Math.pow(-2, idx)<=N){
            idx++;
        }
        idx--;

        while(idx>=0){
            int sub = (int)Math.pow(-2, idx--);
            if(sub<=N){
                sb.append(1);
                N -= sub;
            }else
                sb.append(0);

        }
        return sb.toString();
    }


}










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
