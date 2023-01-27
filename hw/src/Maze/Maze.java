/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Week8
//完成Doubly Linked List新增和刪除元素
//用Stack來完成迷宮題目(回溯)

package Maze;

/**
 *
 * @author s2000
 */
import java.util.Stack;

public class Maze {
    private static final int[][] MAZE = {
            { 1, 1, 0, 1, 0 },
            { 1, 0, 0, 0, 1 },
            { 0, 0, 0, 0, 1 },
            { 1, 0, 0, 0, 1 },
            { 1, 0, 1, 0, 1 }
    };
    private static final int START_X = 1;
    private static final int START_Y = 0;
    private static final int END_X = 3;
    private static final int END_Y = 4;

    public static void main(String[] args) {
        boolean isSolved = solveMaze();
        if (isSolved) {
            System.out.println("Maze通過");
        } else {
            System.out.println("Maze不可通過");
        }
    }

    private static boolean solveMaze() {
        Stack<Node> stack = new Stack<>();
        stack.push(new Node(START_X, START_Y));
        while (!stack.isEmpty()) {
            Node current = stack.pop();
            if (current.x == END_X && current.y == END_Y) {
                return true;
            }
            if (MAZE[current.x][current.y] != 1) {
                MAZE[current.x][current.y] = 1;
                if (current.x - 1 >= 0 && MAZE[current.x - 1][current.y] != 1) {
                    stack.push(new Node(current.x - 1, current.y));
                }
                if (current.y + 1 < MAZE[0].length && MAZE[current.x][current.y + 1] != 1) {
                    stack.push(new Node(current.x, current.y + 1));
                }
                if (current.x + 1 < MAZE.length && MAZE[current.x + 1][current.y] != 1) {
                    stack.push(new Node(current.x + 1, current.y));
                }
                if (current.y - 1 >= 0 && MAZE[current.x][current.y - 1] != 1) {
                    stack.push(new Node(current.x, current.y - 1));
                }
            }
        }
        return false;
    }

    private static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
