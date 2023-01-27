/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Week18 
//以OPENAI用JAVA寫DFS和BFS 

package DFS;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author s2000
 */
public class  DFS {
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
        //調用DFS方法
        DFS(0);
    }

    
    public static void DFS(int v) {
        visited[v] = true;
        System.out.println(v);
        for (int i = 0; i < adj[v].size(); i++) {
            int next = adj[v].get(i);
            if (!visited[next]) {
                DFS(next);
            }
        }
    }
}


