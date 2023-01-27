/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Week18 
//用JAVA完成Dijkstra法

package Dijkstra;

import java.util.*;

public class Dijkstra {
    public static int[] dijkstra(int[][] graph, int start) {
        int n = graph.length;
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return dist[a] - dist[b];
            }
        });

        queue.add(start);
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            visited[curr] = true;
            for (int i = 0; i < n; i++) {
                if (graph[curr][i] != 0 && !visited[i]) {
                    int newDist = dist[curr] + graph[curr][i];
                    if (newDist < dist[i]) {
                        dist[i] = newDist;
                        queue.add(i);
                    }
                }
            }
        }

        return dist;
    }

    public static void main(String[] args) {
        int[][] graph = {{0, 10, 0, 30, 100},
                         {0, 0, 50, 0, 0},
                         {0, 0, 0, 0, 10},
                         {0, 0, 20, 0, 60},
                         {0, 0, 0, 0, 0}};
        int start = 0;
        int[] dist = Dijkstra.dijkstra(graph, start);
        System.out.println(Arrays.toString(dist));
    }

}


