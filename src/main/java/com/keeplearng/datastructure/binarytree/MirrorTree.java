package com.keeplearng.datastructure.binarytree;

/**
 * @Author liangyu
 * @create 2020/4/23 6:04 下午
 * @Description
 */
public class MirrorTree {

    private class TreeNode {

        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }



    public static void main(String[] args) {



    }


    boolean isMirrorTree(TreeNode treeNode, TreeNode JXnode){
        // 空判断
        if (treeNode == null & JXnode == null) {
            return true;
        } else if (treeNode == null || JXnode == null) {
            return false;
        }

        if(treeNode.value == JXnode.value){
            return isMirrorTree(treeNode.left, JXnode.left) &&
                    isMirrorTree(treeNode.right, JXnode.right);
        }

        return false;
    }

    /**
     * 获取镜像树
     * @param treeNode
     * @return
     */
    TreeNode getMirrorTree(TreeNode treeNode){

        if (null == treeNode){
            return null;
        }

        TreeNode tmpTreeNode = new TreeNode(treeNode.value);

        tmpTreeNode.right = getMirrorTree(tmpTreeNode.left);
        tmpTreeNode.left = getMirrorTree(tmpTreeNode.right);

        return tmpTreeNode;
    }
}

