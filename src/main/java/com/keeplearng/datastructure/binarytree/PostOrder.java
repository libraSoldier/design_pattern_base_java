package com.keeplearng.datastructure.binarytree;

import java.util.Stack;

/**
 * @Author liangyu
 * @create 2020/4/22 2:09 下午
 * @Description
 */
public class PostOrder extends BaseTree{

    /**
     * 1）前序遍历：先遍历根节点，然后遍历左子节点，最后遍历右子节点，简记为“根-左-右”；
     *
     * 2）中序遍历：先遍历左子节点，然后遍历根节点，最后遍历右子节点，简记为“左-根-右”；
     *
     * 3）后序遍历：先遍历左子节点，然后遍历右子节点，最后遍历根节点，简记为“左-右-根”；
     * */

    public static void main(String[] args) {

        BaseTree.TreeNode[] binaryTree = createCompleteBinaryTree();

        postOrderRe(binaryTree[0]);

        postOrder(binaryTree[0]);
    }

    /**
     * rec: 后序遍历 - 递归实现
     * @param biTree
     */
    public static void postOrderRe(TreeNode biTree)
    {//后序遍历递归实现
        if(biTree == null) {
            return;
        } else
        {
            postOrderRe(biTree.left);
            postOrderRe(biTree.right);
            System.out.println(biTree.value);
        }
    }


    /**
     * rec: 后序遍历 - 非递归实现
     * @param biTree
     */
    public static void postOrder(TreeNode biTree)
    {//后序遍历非递归实现
        int left = 1;//在辅助栈里表示左节点
        int right = 2;//在辅助栈里表示右节点
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<Integer> stack2 = new Stack<Integer>();//辅助栈，用来判断子节点返回父节点时处于左节点还是右节点。

        while(biTree != null || !stack.empty())
        {
            while(biTree != null)
            {//将节点压入栈1，并在栈2将节点标记为左节点
                stack.push(biTree);
                stack2.push(left);
                biTree = biTree.left;
            }

            while(!stack.empty() && stack2.peek() == right)
            {//如果是从右子节点返回父节点，则任务完成，将两个栈的栈顶弹出
                stack2.pop();
                System.out.println(stack.pop().value);
            }

            if(!stack.empty() && stack2.peek() == left)
            {//如果是从左子节点返回父节点，则将标记改为右子节点
                stack2.pop();
                stack2.push(right);
                biTree = stack.peek().right;
            }

        }
    }

}
