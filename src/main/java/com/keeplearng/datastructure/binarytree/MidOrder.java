package com.keeplearng.datastructure.binarytree;


import javax.swing.tree.TreeNode;
import java.util.HashMap;
import java.util.Stack;

/**
 * @Author liangyu
 * @create 2020/4/22 10:48 上午
 * @Description rec: 中序遍历二叉树
 */
public class MidOrder {

    /**
     * 1）前序遍历：先遍历根节点，然后遍历左子节点，最后遍历右子节点，简记为“根-左-右”；
     *
     * 2）中序遍历：先遍历左子节点，然后遍历根节点，最后遍历右子节点，简记为“左-根-右”；
     *
     * 3）后序遍历：先遍历左子节点，然后遍历右子节点，最后遍历根节点，简记为“左-右-根”；
     * */

    private static class TreeNode{
        TreeNode left;
        TreeNode right;

        int value;
        TreeNode(int x) {
            value = x;
        }
    }

    public static void main(String[] args) {

        TreeNode[] binaryTree = createCompleteBinaryTree();

        midOrderRe(binaryTree[0]);

        midOrder(binaryTree[0]);
    }

    private static TreeNode[] createCompleteBinaryTree(){
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

    /**
     * rec: 中序遍历 - 递归实现
     * @param biTree
     * 递归的执行顺序就像栈一样，你可以把递归调用函数，每一层都放入栈，有返回值时，然后挨着版从栈内取出之前的函数段执行
     * 一直执行到栈内为空为止，这过程中所有执行的结果即是该递归权调用的结果
     */
    public static void midOrderRe(TreeNode biTree) {
        if (biTree == null) {
            return;
        } else {
            midOrderRe(biTree.left);
            System.out.println(biTree.value);
            midOrderRe(biTree.right);
        }
    }


    /**
     * rec: 中序遍历 - 非递归实现
     * @param biTree
     * 迭代实现，首先依次将左子节点全部加入栈中，所以第一个while循环后栈顶元素对应最左下的子树
     * 从最左下的子树开始遍历，打印出栈元素，并将对象引用指向其右子树
     * 当右子树为空时，继续出栈；当当右子树存在时，压栈
     * 保证调用顺序为：左-中-右
     */
    public static void midOrder(TreeNode biTree)
    {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(biTree != null || !stack.isEmpty())
        {

            while(biTree != null)
            {
                stack.push(biTree);
                biTree = biTree.left;
                // rec: 依次压栈：0，1，3，7
            }

            if(!stack.isEmpty())
            {
                biTree = stack.pop();
                System.out.println(biTree.value);
                biTree = biTree.right;
            }
        }
    }

}
