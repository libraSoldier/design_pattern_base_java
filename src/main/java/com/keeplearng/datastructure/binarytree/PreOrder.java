package com.keeplearng.datastructure.binarytree;

import java.util.Stack;

/**
 * @Author liangyu
 * @create 2020/4/22 1:59 下午
 * @Description rec: 前序遍历二叉树
 */
public class PreOrder extends BaseTree{

    /**
     * 1）前序遍历：先遍历根节点，然后遍历左子节点，最后遍历右子节点，简记为“根-左-右”；
     *
     * 2）中序遍历：先遍历左子节点，然后遍历根节点，最后遍历右子节点，简记为“左-根-右”；
     *
     * 3）后序遍历：先遍历左子节点，然后遍历右子节点，最后遍历根节点，简记为“左-右-根”；
     * */

    public static void main(String[] args) {

        BaseTree.TreeNode[] binaryTree = createCompleteBinaryTree();

        preOrderRe(binaryTree[0]);

        preOrder(binaryTree[0]);
    }


    /**
     * rec: 前序遍历 - 递归实现
     * @param biTree
     * rec: 从根部开始遍历，当左子树不为空时遍历左子树，否则遍历右子树
     */
    public static void preOrderRe(TreeNode biTree)
    {
        System.out.println(biTree.value);
        TreeNode leftTree = biTree.left;
        if(leftTree != null)
        {
            preOrderRe(leftTree);
        }
        TreeNode rightTree = biTree.right;
        if(rightTree != null)
        {
            preOrderRe(rightTree);
        }
    }

    /**
     * rec: 前序遍历 - 非递归实现
     * @param biTree
     */
    public static void preOrder(TreeNode biTree) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (biTree != null || !stack.isEmpty()) {
            while (biTree != null) {
                System.out.println(biTree.value);
                stack.push(biTree);
                biTree = biTree.left;
            }
            if (!stack.isEmpty()) {
                biTree = stack.pop();
                biTree = biTree.right;
            }
        }
    }


}
