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
    }

    char[][] b;
    int[][] dirs = {{1,0},{-1,0},{0,1},{-1,0}};
    public char[][] updateBoard(char[][] board, int[] click) {
        b = board;
        int cRow = click[0],  cCol = click[1];
        if(b[cRow][cCol]=='M'){
            b[cRow][cCol] = 'X';
            return b;
        }
        dfs(cRow,cCol);
        return b;
    }

    private void dfs(int row, int col){
        if(row<0 || row>b.length-1 || col<0 || col>b[0].length-1 || b[row][col]!='E' )
            return;
        int bomb = bomb(row, col);
        if(bomb>0){
            b[row][col] = '0';
            b[row][col] += bomb;
            return;
        }
        b[row][col] = 'B';
        for(int[] dir: dirs){
            dfs(row+dir[0], col+dir[1]);
        }
    }

    private int bomb(int row, int col){
        int c = 0;
        for(int i=row-1;i<=row+1;i++){
            for(int j=col-1;j<=col+1;j++){
                if(i<0 || i>=b.length || j<0 || j>=b[0].length || i==row && j==col) continue;
                c += b[i][j]=='M'?1:0;
            }
        }
        return c;
    }
}

/**
 * 224. Basic Calculator
 * Hard
 *
 * 763
 *
 * 92
 *
 * Favorite
 *
 * Share
 * Implement a basic calculator to evaluate a simple expression string.
 *
 * The expression string may contain open ( and closing parentheses ), the plus + or minus sign -, non-negative integers and empty spaces .
 *
 * Example 1:
 *
 * Input: "1 + 1"
 * Output: 2
 * Example 2:
 *
 * Input: " 2-1 + 2 "
 * Output: 3
 * Example 3:
 *
 * Input: "(1+(4+5+2)-3)+(6+8)"
 * Output: 23
 *
 * public int calculate(String s) {
 *         Stack<Integer> nums = new Stack();
 *         Stack<Character> sign = new Stack();
 *         for(char c: s.toCharArray()){
 *
 *         }
 *     }
 *
 *
 * 79. Word Search
 * Medium
 *
 * 1821
 *
 * 90
 *
 * Favorite
 *
 * Share
 * Given a 2D board and a word, find if the word exists in the grid.
 *
 * The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
 *
 * Example:
 *
 * board =
 * [
 *   ['A','B','C','E'],
 *   ['S','F','C','S'],
 *   ['A','D','E','E']
 * ]
 *
 * Given word = "ABCCED", return true.
 * Given word = "SEE", return true.
 * Given word = "ABCB", return false.
 *
 *     public boolean exist(char[][] board, String word) {
 *
 *     }
 *
 *253. Meeting Rooms II
 * Medium
 *
 * 1380
 *
 * 25
 *
 * Favorite
 *
 * Share
 * Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), find the minimum number of conference rooms required.
 *
 * Example 1:
 *
 * Input: [[0, 30],[5, 10],[15, 20]]
 * Output: 2
 * Example 2:
 *
 * Input: [[7,10],[2,4]]
 * Output: 1
 *
 *
 * public int minMeetingRooms(Interval[] intervals) {
 *     }
 *
 *
 *     267. Palindrome Permutation II
 * Medium
 *
 * 262
 *
 * 35
 *
 * Favorite
 *
 * Share
 * Given a string s, return all the palindromic permutations (without duplicates) of it. Return an empty list if no palindromic permutation could be form.
 *
 * Example 1:
 *
 * Input: "aabb"
 * Output: ["abba", "baab"]
 * Example 2:
 *
 * Input: "abc"
 * Output: []
 *
 * public List<String> generatePalindromes(String s) {
 *
 *     }
 *
 *
 *
 *     542. 01 Matrix
 * Medium
 *
 * 693
 *
 * 78
 *
 * Favorite
 *
 * Share
 * Given a matrix consists of 0 and 1, find the distance of the nearest 0 for each cell.
 *
 * The distance between two adjacent cells is 1.
 *
 *
 *
 * Example 1:
 *
 * Input:
 * [[0,0,0],
 *  [0,1,0],
 *  [0,0,0]]
 *
 * Output:
 * [[0,0,0],
 *  [0,1,0],
 *  [0,0,0]]
 * Example 2:
 *
 * Input:
 * [[0,0,0],
 *  [0,1,0],
 *  [1,1,1]]
 *
 * Output:
 * [[0,0,0],
 *  [0,1,0],
 *  [1,2,1]]
 *
 *  public int[][] updateMatrix(int[][] matrix) {
 *
 *     }
 *
 *
 *
 *     658. Find K Closest Elements
 * Medium
 *
 * 695
 *
 * 151
 *
 * Favorite
 *
 * Share
 * Given a sorted array, two integers k and x, find the k closest elements to x in the array. The result should also be sorted in ascending order. If there is a tie, the smaller elements are always preferred.
 *
 * Example 1:
 * Input: [1,2,3,4,5], k=4, x=3
 * Output: [1,2,3,4]
 * Example 2:
 * Input: [1,2,3,4,5], k=4, x=-1
 * Output: [1,2,3,4]
 *
 * public List<Integer> findClosestElements(int[] arr, int k, int x) {
 *
 *     }
 *
 *
 *     528. Random Pick with Weight
 * Medium
 *
 * 264
 *
 * 492
 *
 * Favorite
 *
 * Share
 * Given an array w of positive integers, where w[i] describes the weight of index i, write a function pickIndex which randomly picks an index in proportion to its weight.
 *
 * Note:
 *
 * 1 <= w.length <= 10000
 * 1 <= w[i] <= 10^5
 * pickIndex will be called at most 10000 times.
 * Example 1:
 *
 * Input:
 * ["Solution","pickIndex"]
 * [[[1]],[]]
 * Output: [null,0]
 * Example 2:
 *
 * Input:
 * ["Solution","pickIndex","pickIndex","pickIndex","pickIndex","pickIndex"]
 * [[[1,3]],[],[],[],[],[]]
 * Output: [null,0,1,1,1,0]
 * Explanation of Input Syntax:
 *
 * The input is two lists: the subroutines called and their arguments. Solution's constructor has one argument, the array w. pickIndex has no arguments. Arguments are always wrapped with a list, even if there aren't any.
 *
 *
 * public Solution(int[] w) {
 *
 *     }
 *
 *     public int pickIndex() {
 *
 *     }
 *
 *
 *     210. Course Schedule II
 * Medium
 *
 * 970
 *
 * 67
 *
 * Favorite
 *
 * Share
 * There are a total of n courses you have to take, labeled from 0 to n-1.
 *
 * Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]
 *
 * Given the total number of courses and a list of prerequisite pairs, return the ordering of courses you should take to finish all courses.
 *
 * There may be multiple correct orders, you just need to return one of them. If it is impossible to finish all courses, return an empty array.
 *
 * Example 1:
 *
 * Input: 2, [[1,0]]
 * Output: [0,1]
 * Explanation: There are a total of 2 courses to take. To take course 1 you should have finished
 *              course 0. So the correct course order is [0,1] .
 * Example 2:
 *
 * Input: 4, [[1,0],[2,0],[3,1],[3,2]]
 * Output: [0,1,2,3] or [0,2,1,3]
 * Explanation: There are a total of 4 courses to take. To take course 3 you should have finished both
 *              courses 1 and 2. Both courses 1 and 2 should be taken after you finished course 0.
 *              So one correct course order is [0,1,2,3]. Another correct ordering is [0,2,1,3] .
 *
 *              public int[] findOrder(int numCourses, int[][] prerequisites) {
 *
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

