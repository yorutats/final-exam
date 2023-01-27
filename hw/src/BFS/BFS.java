/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Week18 
//以OPENAI用JAVA寫DFS和BFS 

package BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author s2000
 */
public class  BFS {
    static boolean[] visited;
    static List<Integer>[] adj;
    public static void main(String[] args) {
        //初始化visited數組和adj數組
        int size = 5; 
        visited = new boolean[size];
        adj = new ArrayList[size];
        for (int i = 0; i < size; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        //添加邊
        adj[0].add(1);
        adj[0].add(2);
        adj[1].add(3);
        adj[2].add(3);
        adj[3].add(4);
        //調用BFS方法
        BFS(0);
    }

    
    static void BFS(int v) {
        Queue<Integer> queue = new LinkedList<Integer>();
        visited[v] = true;
        queue.add(v);
        while (!queue.isEmpty()) {
            int x = queue.poll();
            System.out.println(x);
            for (int i = 0; i < adj[x].size(); i++) {
                int next = adj[x].get(i);
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
    }

    
}
