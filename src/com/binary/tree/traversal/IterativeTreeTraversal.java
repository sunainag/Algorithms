package com.binary.tree.traversal;

import java.util.Stack;

import com.binary.tree.node.BinaryTreeNode;

public class IterativeTreeTraversal {

	public static void preOrderTraversal(BinaryTreeNode head) {
		if (head == null)
			System.out.println("Empty tree");
		Stack<BinaryTreeNode> s = new Stack<>();
		s.push(head);
		while (!s.isEmpty()) {
			BinaryTreeNode curr = s.pop();
			System.out.print(curr.getData() + " ");
			if (curr.getRight() != null)
				s.push(curr.getRight());
			if (curr.getLeft() != null)
				s.push(curr.getLeft());

		}
	}
	
	public static void postOrderTraversal(BinaryTreeNode head){
		if(head==null)
			System.out.println("Empty tree");
		Stack<BinaryTreeNode> result = new Stack<>();
		Stack<BinaryTreeNode> stackItr = new Stack<>();
		stackItr.push(head);
		
		while(!stackItr.isEmpty()){
			BinaryTreeNode curr = stackItr.pop();
			result.push(curr);
			if(curr.getLeft()!=null)
				stackItr.push(curr.getLeft());
			if(curr.getRight()!=null)
				stackItr.push(curr.getRight());
		}
		
		while(!result.isEmpty()){
			System.out.print(result.pop()+" ");
		}
	}
}
