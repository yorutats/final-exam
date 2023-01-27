/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Week14
//期中題目 完成RB TREE新增功能
//完成刪除功能總成績+2

package RedBlackTree;

/**
 *
 * @author s2000
 */
import java.util.Objects;

public class RedBlackTree {
    private static final boolean RED = true;
    private static final boolean BLACK = false;
    private Node root;

    private class Node {
        int val;
        boolean color;
        Node left;
        Node right;

        public Node(int val, boolean color) {
            this.val = val;
            this.color = color;
        }
    }

    private boolean isRed(Node x) {
        if (x == null) {
            return false;
        }
        return x.color == RED;
    }

    private Node rotateLeft(Node h) {
        Node x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }

    private Node rotateRight(Node h) {
        Node x = h.left;
        h.left = x.right;
        x.right = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }

    private void flipColors(Node h) {
        h.color = !h.color;
        h.left.color = !h.left.color;
        h.right.color = !h.
        right.color;
    }
    private Node moveRedLeft(Node h) {
        flipColors(h);
        if (isRed(h.right.left)) {
            h.right = rotateRight(h.right);
            h = rotateLeft(h);
            flipColors(h);
        }
        return h;
    }
    
    private Node moveRedRight(Node h) {
        flipColors(h);
        if (isRed(h.left.left)) {
            h = rotateRight(h);
            flipColors(h);
        }
        return h;
    }
    
    private Node balance(Node h) {
        if (isRed(h.right)) {
            h = rotateLeft(h);
        }
        if (isRed(h.left) && isRed(h.left.left)) {
            h = rotateRight(h);
        }
        if (isRed(h.left) && isRed(h.right)) {
            flipColors(h);
        }
        return h;
    }
    
    public void insert(int val) {
        root = insert(root, val);
        root.color = BLACK;
    }
    
    private Node insert(Node h, int val) {
        if (h == null) {
            return new Node(val, RED);
        }
        int cmp = Integer.compare(val, h.val);
        if (cmp < 0) {
            h.left = insert(h.left, val);
        } else if (cmp > 0) {
            h.right = insert(h.right, val);
        } else {
            h.val = val;
        }
        h = balance(h);
        return h;
    }
    
    public void delete(int val) {
        if (!isRed(root.left) && !isRed(root.right)) {
            root.color = RED;
        }
        root = delete(root, val);
        if (root != null) {
            root.color = BLACK;
        }
    }
    
    private Node delete(Node h, int val) {
        if (Objects.isNull(h)) {
            return null;
        }
    
        if (val < h.val) {
            if (!isRed(h.left) && !isRed(h.left.left)) {
                h = moveRedLeft(h);
            }
            h.left = delete(h.left, val);
        } else {
            if (isRed(h.left)) {
                h = rotateRight(h);
            }
            if (val == h.val && (Objects.isNull(h.right))) {
                return null;
            }
            if (!isRed(h.right) && !isRed(h.right.left)) {
                h = moveRedRight(h);
            }
            if (val == h.val) {
                Node x = min(h.right);
                h.val = x.val;
                h.right = deleteMin(h.right);
            } else {
                h.right = delete(h.right, val);
            }
        }
        return balance(h);
    }




    private Node min(Node h) {
        if (h.left == null) {
            return h;
        }
        return min(h.left);
    }

    
    private Node deleteMin(Node h) {
        if (h.left == null) {
            return null;
        }
        if (!isRed(h.left) && !isRed(h.left.left)) {
            h = moveRedLeft(h);
        }
        h.left = deleteMin(h.left);
        return balance(h);
    }
    
}        