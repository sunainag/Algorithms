package com.binary.tree.traversal;

import com.binary.tree.node.BinaryTreeNode;

public class RecursiveTreeTraversal {
	
	public static void preOrderTraversal(BinaryTreeNode head){
		if(head==null)
			return;
		System.out.print(head.getData()+" ");
		preOrderTraversal(head.getLeft());
		preOrderTraversal(head.getRight());
	}

	public static void postOrderTraversal(BinaryTreeNode head){
		if(head==null)
			return;
		postOrderTraversal(head.getLeft());
		postOrderTraversal(head.getRight());
		System.out.print(head.getData()+" ");
	}
	
	public static void inOrderTraversal(BinaryTreeNode head){
		if(head==null)
			return;
		inOrderTraversal(head.getLeft());
		System.out.print(head.getData()+" ");
		inOrderTraversal(head.getRight());
	}
}
