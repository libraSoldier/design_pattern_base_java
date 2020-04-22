package com.keeplearng.datastructure.binarytree;

/**
 * @Author liangyu
 * @create 2020/4/22 1:56 下午
 * @Description
 */
public class BaseTree {

    protected static TreeNode[] createCompleteBinaryTree(){
        // 以数组形式生成一棵完全二叉树
        // 若设二叉树的深度为k，除第 k 层外，其它各层 (1～k-1) 的结点数都达到最大个数，第k 层所有的结点都连续集中在最左边，这就是完全二叉树。
        TreeNode[] binaryTree = new TreeNode[10];
        // rec: 创建节点
        for (int i = 0; i < 10; i++) {
            binaryTree[i] = new TreeNode(i);
        }
        // rec: 构建完全二叉树
        for (int i = 0; i < 10; i++) {
            if(i*2+1<10){
                // 左子树为奇数，例如0左边是1
                binaryTree[i].left = binaryTree[i*2+1];
            }
            if(i*2+2<10){
                // 右子树为偶数，例如0右边是2
                binaryTree[i].right = binaryTree[i*2+2];
            }
        }
        return binaryTree;
    }

    protected static class TreeNode{
        TreeNode left;
        TreeNode right;

        int value;
        TreeNode(int x) {
            value = x;
        }
    }
}
