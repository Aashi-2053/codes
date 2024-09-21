package com.dsa.BinaryTree;

import java.util.*;

public class LevelOrderTraverseBFS {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
        public static void main(String[] args) {

        }

        //https://leetcode.com/problems/binary-tree-level-order-traversal/
        public List<List<Integer>> levelorder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();

            if (root == null) return res;

            Queue<TreeNode> que = new LinkedList<>();

            que.offer(root);
            while (!que.isEmpty()) {
                int levelSize = que.size();
                List<Integer> currLevel = new ArrayList<>(levelSize);
                for (int i = 0; i < levelSize; i++) {
                    TreeNode curr = que.poll();
                    currLevel.add(curr.val);
                    if(curr.left!=null){
                        que.offer(curr.left);
                    }
                    if(curr.right!=null){
                        que.offer(curr.right);
                    }
                }
                res.add(currLevel);
            }
            return res;

        }

    }
