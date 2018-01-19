package com.binary.tree.application;

import com.binary.tree.node.BinaryTreeNode;
import com.binary.tree.traversal.RecursiveTreeTraversal;

public class BinaryTree {
	
	private BinaryTreeNode head;
	private int size;
	private int height;
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		BinaryTreeNode newNode = new BinaryTreeNode(1);
		tree.head = newNode;
		tree.head.setLeft(new BinaryTreeNode(2));
		tree.head.setRight(new BinaryTreeNode(3));
		tree.head.getLeft().setLeft(new BinaryTreeNode(4));
		tree.head.getLeft().setRight(new BinaryTreeNode(5));
		tree.head.getRight().setLeft(new BinaryTreeNode(6));
		tree.head.getRight().setRight(new BinaryTreeNode(7));
		
		System.out.println("\n*******PreOrder traversal ******");
		RecursiveTreeTraversal.preOrderTraversal(tree.head);
		
		System.out.println("\n*******PostOrder traversal ******");
		RecursiveTreeTraversal.postOrderTraversal(tree.head);
		
		System.out.println("\n*******InOrder traversal ******");
		RecursiveTreeTraversal.inOrderTraversal(tree.head);
	}

}
